package threadBasic;
// 5번 : 현재 실행중인 쓰레드의 참조를 얻어 이름을 콘솔에 출력하고
// 작업 쓰레드의 이름을 setName()메소드로 수정
public class ThreadNameTest {
   public static void main(String[] args) {
      Thread mainThread = Thread.currentThread();
      // 실행하는 쓰레드 객체의 참조 얻기
      System.out.println(mainThread.getName() + "실행");

      for (int i = 0; i < 3; i++) {
         Thread threadA = new Thread() {

            @Override
            public void run() {
               System.out.println(getName() + "실행");
               // getName() 메소드는 Thread의 인스턴스 메소드로
               // 쓰레드의 이름을 반환
            }
         };
         threadA.start();
      }

      Thread testThread = new Thread() {

         @Override
         public void run() {
            System.out.println(getName() + "실행");
         }
      };
      testThread.setName("test-Thread"); // 작업 쓰레드 이름 변경
      testThread.start();

   }
}
