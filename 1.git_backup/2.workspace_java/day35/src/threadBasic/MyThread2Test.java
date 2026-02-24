package threadBasic;

//4번 : Runnable 인터페이스 구현 클래스 실행 클래스
public class MyThread2Test {
   public static void main(String[] args) {
      
      //Runnable 객체 2개 생성
      //Runnable은 작업내용이고 쓰레드가 아님
      MyThread2 mt1 = new MyThread2();
      MyThread2 mt2 = new MyThread2();

      // Runnable 인터페이스를 구현하면 start()는 없다
      // start() Thread에 있다
      //Thread 객체 생성      (Runnable, 쓰레드이름);
      Thread t1 = new Thread(mt1, "A");
      Thread t2 = new Thread(mt2, "B");

      //쓰레드 실행(새로운 호출 스택 생성)
      t1.start();
      t2.start();

      // Runnable 인터페이스는 함수형 인터페이스이다 => 람다식 활용 가능
      Runnable r1 = () -> {
         for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      };

      Thread test = new Thread(r1, "C");
      test.start();

      Thread t3 = new Thread(() -> {
         for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
         System.out.println(Thread.currentThread().getName() + "종료");
      }, "D");
      t3.start();

   }

}
