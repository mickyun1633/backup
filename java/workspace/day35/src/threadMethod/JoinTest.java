package threadMethod;

// 6번 : join() 메소드
public class JoinTest {
   public static void main(String[] args) {
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
         System.out.println(Thread.currentThread().getName() + "쓰레드 종료");
      };

      Thread t1 = new Thread(r1, "t1");
      Thread t2 = new Thread(r1, "t2");

      t1.start();
      t2.start();

      try {
//         t1.join();
    	   t1.join(2000); // t1이 멈추는 것이 아니라 main이(현재 thread) 멈춘다
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      for (int i = 0; i < 5; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
				// TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      System.out.println(Thread.currentThread().getName() + "쓰레드 종료");

   }
}
