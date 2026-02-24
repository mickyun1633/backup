package LambdaTest02;

//3-4번 : 인터페이스 객체 생성(익명클래스와 람다식 활용)
public class Print {
   public static void main(String[] args) {
      // 익명 클래스로 객체 생성
      StringTool st = new StringTool() {

         @Override
         public void strAdd() {
            System.out.println("hello " + "java");
         }
      };

      st.strAdd();

      // 람다식으로 객체 생성
      StringTool st2 = () -> System.out.println("hello " + "김영선");
      st2.strAdd();

//      void strAdd() {System.out.println("hello " + "java");}

//      1) 이름 삭제 () -> 추가
//      void () -> {System.out.println("hello " + "java");}
//      2) 반환타입 추론 가능 생략한다
//      () -> {System.out.println("hello " + "java");}
//      3) 매개변수가 없을 땐 () 생략 불가능
//      4) 실행문 1줄 {} ; 생략가능하다
//      () -> System.out.println("hello " + "java")

      // Func1 익명클래스로 객체 생성
      Func1 func1 = new Func1() {

         @Override
         public void addTen(int number) {
            System.out.println(number + 10);
         }
      };

      System.out.println(func1);
      func1.addTen(100);

      // Func1 람다식으로 객체 생성
      Func1 func2 = number -> System.out.println(number + 10);
      System.out.println(func2);

//      void addTen(int number) {
//         System.out.println(number + 10);
//      }

//      void (int number) -> { syso(number + 10); }
//      (int number) -> { syso(number + 10); }
//      (number) -> { syso(number + 10); }
//      number -> { syso(number + 10); }
//      number -> syso(number + 10)

      // Func2 익명클래스 객체 생성
      Func2 f2 = new Func2() {

         @Override
         public int printSum(int num1, int num2) {
            System.out.println("num1의 값 : " + num1 + " num2의 값 : " + num2);
            return num1 + num2;
         }
      };
      System.out.println(f2);
      System.out.println(f2.printSum(1, 2));

      // Func2 람다식 객체 생성
//      int printSum(int num1, int num2) {
//         System.out.println("num1의 값 : " + num1 + " num2의 값 : " + num2);
//         return num1 + num2;
//      }

//      1) 이름을 없애고 () 뒤에 -> 추가
//      2) 리턴타입 추론가능하므로 생략
//      3) 매개변수의 타입 추론가능하므로 생략 가능(선택)
//      4) 매개변수 ()는 매개변수가 2개이므로 생략 불가
//      5) 명령문이 2줄이므로 {} ; 생략불가
      Func2 f3 = (num1, num2) -> {
         System.out.println("num1의 값 : " + num1 + " num2의 값 : " + num2);
         return num1 + num2;
      };
      System.out.println(f3);
      System.out.println(f3.printSum(20, 5));

   }
}
