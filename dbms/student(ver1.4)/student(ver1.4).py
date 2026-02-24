import tkinter as tk
from socket import *
import threading
import time

TEACHER_IP = '192.168.20.254'
PORT = 9999

class StudentApp:
    def __init__(self, root):
        self.root = root
        self.root.title("학생용")
        self.root.geometry("300x380")
        self.is_connected = False  

        tk.Label(root, text="등록된 이름을 입력하세요", font=('Arial', 10)).pack(pady=10)
        self.name_entry = tk.Entry(root, width=15, justify='center', font=('Arial', 12))
        self.name_entry.pack(pady=5)
        
        self.login_btn = tk.Button(root, text="수업 접속하기", command=self.connect_to_server, bg="#e1e1e1")
        self.login_btn.pack(pady=5)
        
        self.buttons = []
        for text, color, stat in [("✅ 완료", "#90ee90", "DONE"), ("❓ 질문", "#ff9999", "HELP"), ("🔄 대기", "#f0f0f0", "IDLE")]:
            btn = tk.Button(root, text=text, bg=color, height=2, width=20, state='disabled',
                            command=lambda s=stat: self.send_status(s))
            btn.pack(pady=3)
            self.buttons.append(btn)

        self.info_label = tk.Label(root, text="이름 입력 후 접속하세요", fg="grey")
        self.info_label.pack(pady=10)

        threading.Thread(target=self.heartbeat_loop, daemon=True).start()

    def connect_to_server(self):
        name = self.name_entry.get().strip()
        if not name: return
        self.info_label.config(text="명단 확인 중...", fg="orange")
        threading.Thread(target=self._try_login, args=(name,), daemon=True).start()

    def _try_login(self, name):
        try:
            sock = socket(AF_INET, SOCK_STREAM)
            sock.settimeout(2.0)
            sock.connect((TEACHER_IP, PORT))
            sock.send(f"{name}:CONN".encode('utf-8'))
            
            # 서버로부터 응답 대기
            response = sock.recv(1024).decode('utf-8')
            sock.close()
            
            if response == "OK":
                self.root.after(0, self._set_login_success)
            else:
                self.root.after(0, lambda: self.info_label.config(text="경고: 명단에 없는 이름입니다!", fg="red"))
        except:
            self.root.after(0, lambda: self.info_label.config(text="에러: 서버 연결 불가", fg="red"))

    def _set_login_success(self):
        self.is_connected = True
        self.name_entry.config(state='disabled')
        self.login_btn.config(state='disabled', text="접속 완료")
        for btn in self.buttons: btn.config(state='normal')
        self.info_label.config(text="성공: 명단 확인됨!", fg="blue")

    def send_status(self, status):
        if not self.is_connected: return
        threading.Thread(target=self._socket_send, args=(f"{self.name_entry.get().strip()}:{status}",), daemon=True).start()

    def heartbeat_loop(self):
        while True:
            if self.is_connected:
                self._socket_send(f"{self.name_entry.get().strip()}:CONN")
            time.sleep(2)

    def _socket_send(self, message):
        try:
            sock = socket(AF_INET, SOCK_STREAM)
            sock.settimeout(0.8)
            sock.connect((TEACHER_IP, PORT))
            sock.send(message.encode('utf-8'))
            sock.close()
        except: pass

if __name__ == "__main__":
    root = tk.Tk()
    app = StudentApp(root)
    root.mainloop()