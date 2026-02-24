package threadTask;

public class JavaCinema {
   public static void main(String[] args) {

      Movie movie = new Movie();
      Thread t1 = new Thread(movie, "왕과 사는 남자");
      Thread t2 = new Thread(movie, "휴민트");
      Thread t3 = new Thread(movie, "모노노케 히메");

      t1.start();
      try {
         t1.join();
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      t2.start();
      t3.start();

      /*
       * JavaCinema라는 영화관이 있다 3개의 관에서 각각 다른 영화를 상영중이다 A관은 영화를 먼저 시작하고 B, C관은 A관의 상영이
       * 끝나야 영화를 시작한다
       * 
       * 각 상영관은 영화를 상영중에 "000 영화 상영중~"이라는 문구를 10번표시한다 각 상영관은 영화가 끝나면 "000 영화 종료"라는 문구를
       * 표시한다 영화 이름은 각 쓰레드의 이름으로 설정한다
       * 
       * 영화 이름 3개는 자유
       * 
       * Movie 클래스와 JavaCinema 클래스를 만든다 JavaCinema에 main 쓰레드가 존재한다 Runnable 인터페이스와
       * join() 사용할 것
       * 
       * 
       */

      String[] title = { "왕과사는 남자", "휴민트", "모노노케 히메" };
      Thread[] arThread = new Thread[title.length];

      for (int i = 0; i < title.length; i++) {
         arThread[i] = new Thread(movie, title[i]);
      }

      for (int i = 0; i < arThread.length; i++) {
         arThread[i].start();
         if (i == 0) {
            try {
               arThread[i].join();
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      }

   }
}
