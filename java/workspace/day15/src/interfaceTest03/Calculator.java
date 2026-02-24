package interfaceTest03;
//3번 : static 메소드, default 메소드, private 메소드
public interface Calculator {
   
   //상수, 추상메소드
	//추상 메소드 : 구현 강제
	int multiply 
	//default : 
   default int add(int num1, int num2) {
      return validate(num1, num2) == 1 ? num1 + num2 : 0;
   }
   
   default int subtract(int num1, int num2) {
      return num1 - num2;
   }
   //static 메소드 : 인터페이스 전용 가능
   static void info() {
      System.out.println("계산기 인터페이스입니다. 양수만 가능합니다");
   }
   //private 메소드 : default 메소드 내부 로직 공통화
   private int validate(int num1, int num2) {
      if(num1 < 0 || num2 < 0) {
         System.out.println("음수값은 사용 불가능합니다. 양수만 사용가능합니다.");
         return 0;
      }
      return 1;
   }

}
