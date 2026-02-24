package anonymousTest02;
//3번 : Calculator 인터페이스를 만들고 익명 클래스로 객체 생성 후 메소드 호출

interface Calculator {
   // 추상메소드 2개 선언
   // add 정수형 매개변수2개
   // mul 정수형 매개변수2개
   int add(int num1, int num2);

   void mul(int num1, int num2);
}

public class AnonymousTask {
   public static void main(String[] args) {
      // 익명 클래스로 객체 생성 후 메소드 호출
      Calculator cal1 = new Calculator() {

         @Override
         public void mul(int num1, int num2) {
            System.out.println(num1 * num2);
         }

         @Override
         public int add(int num1, int num2) {
            // TODO Auto-generated method stub
            return num1 + num2;
         }
      };

      System.out.println(cal1);
      System.out.println(cal1.add(10, 20));
      cal1.mul(5, 2);
   }
}
