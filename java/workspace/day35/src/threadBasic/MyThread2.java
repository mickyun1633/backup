package threadBasic;
//3번 : Runnable interface 구현
public class MyThread2 implements Runnable {
	// Runnable interface는 추상 method 1개(함수형 interface)
	// run 재정의할 때 thread가 할 일을 정의
	// 실제 실행은 Thread 객체가 담당
   @Override
   public void run() {
	  // 현재 실행중인 thread 객체를 가져옴
	  // start()를 호출한 thread 객체가 여기서 실행된다
      String name = Thread.currentThread().getName();

      for (int i = 0; i < 10; i++) {
    	  // 현재 thread 이름
         System.out.println(name);
         try {
        	 // 0.5초동안 thread 일시정지(TIMED_WAITING 상태)
            Thread.sleep(500);
         } catch (InterruptedException e) {
        	 // sleep 중 인터럽트 발생시 예외처리
        	 // InterruptedException은 체크 예외이므로 반드시 처리애햐한다
            e.printStackTrace();
         }
      }
      // 반복이 끝나면 종료 메시지 출력
      System.out.println(name + "쓰레드 종료");
   }

}