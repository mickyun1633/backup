package threadBasic;

//11번 : interrupted
public class InterruptTest {
   public static void main(String[] args) {

      Thread t = new Thread(() -> {
         try {
            while (true) {
               System.out.println("작업중");
               Thread.sleep(500);
            }
         } catch (InterruptedException e) {
            System.out.println("인터럽트 발생, 종료");
         }
      });

      t.start();
      try {
         Thread.sleep(500);
      } catch (InterruptedException e) {

      }
      t.interrupt(); // 종료 신호
   }
}
