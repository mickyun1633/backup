package innerTest;

//6번 : 내부클래스
public class Outer { // 외부클래스 중괄호 시작
   // Outer 클래스 필드
   int var1;
   String data1 = "Outer";

   // Outer 클래스의 기본 생성자
   public Outer() {
      super();
      System.out.println("외부 클래스의 기본 생성자");
   }

   // Outer 클래스의 인스턴스 메소드
   void outerMethod() {
      System.out.println("외부 클래스의 메소드 호출");
//      System.out.println(var2); //외부클래스에서 내부 클래스의 필드 직접접근불가
   }

   // 내부 클래스 Inner 클래스 정의
   class Inner { // 내부클래스 중괄호 시작
      // 필드, 생성자, 메소드
//      Outer this$0; //컴파일러가 자동으로 추가
      
      // Inner 클래스 필드
      int var2 = 10;
      String data2 = "Inner";

      // Inner 클래스 생성자
      public Inner() {
         super(); // Object 클래스의 생성자 호출
         System.out.println(this);
         System.out.println("내부 클래스의 생성자");
//         outerMethod(); //외부 클래스의 메소드 호출 가능
      }

      // Inner 클래스 메소드
      void innerMethod() {
         System.out.println("내부 클래스의 메소드 호출");
         this.var2 = 20; // this : Inner 객체, var2 : Inner의 인스턴스 변수
         var1 = 100; // 컴파일러가 자동으로 Outer.this.var1으로 해석
//         this.var1 = 100; 오류발생
//         this : Inner 객체, var1 : Outer의 멤버
         System.out.println("내부클래스의 메소드에서 var1의 값 : " + var1);
         System.out.println("내부클래스의 메소드에서 var2의 값 : " + var2);
      }

   }// 내부 클래스 중괄호 끝

} // 외부클래스 중괄호 끝



























