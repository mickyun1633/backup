package threadMethod;

// 7번 : 동기화
public class SynchronizedTest implements Runnable {
   private int number;

   public SynchronizedTest() {
      super();
      this.number = 100;
   }

   @Override
   public /* synchronized */ void run() { // run메소드를 동기화 처리하면 싱글쓰레도 작동한다
      for (int i = 0; i < 5; i++) {
         sub(10);
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }

   public synchronized void sub(int number) {
      String name = Thread.currentThread().getName();
//      synchronized(this) {
      this.number -= number;
//      }
      System.out.println(name + " : " + number);
      System.out.println("현재 number : " + this.number);
   }

}
