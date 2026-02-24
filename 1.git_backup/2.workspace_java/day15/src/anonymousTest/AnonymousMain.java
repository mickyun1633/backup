package anonymousTest;

//7번 : 익명클래스 - 메인 클래스
public class AnonymousMain {
   public static void main(String[] args) {
//      InterA a = new InterA();
      InterA a1 = new ClassA();
      a1.printText();

      InterA a2 = new InterA() {

         @Override
         public void printText() {
            System.out.println("익명클래스에서 오버라이딩");

         }

      };
      System.out.println(a2);
      a2.printText();
   }
}