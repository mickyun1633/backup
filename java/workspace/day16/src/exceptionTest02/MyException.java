package exceptionTest02;
//10번 : 사용자 정의 예외 클래스
public class MyException extends Exception{

   public MyException() {
      super("음수는 입력하면 안돼요");
   }
   
}
