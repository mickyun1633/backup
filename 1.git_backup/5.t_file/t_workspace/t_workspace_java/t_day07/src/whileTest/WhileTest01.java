package whileTest;
//4번 : 반복문 - while문
public class WhileTest01 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ", 안녕하세요");
		}
		
		int cnt = 0;
		while(cnt < 10) {
			System.out.println(cnt + ", 안녕하세요");
			cnt++;
		}
		
	}
}
