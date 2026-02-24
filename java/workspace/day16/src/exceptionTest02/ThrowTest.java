package exceptionTest02;

import java.util.InputMismatchException;
import java.util.Scanner;

//9번 : throws(예외던지기)와 throw(예외강제 발생시키기)
public class ThrowTest {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      try {
         method(sc);
      } catch (InputMismatchException e) {
         // TODO Auto-generated catch block
//         e.printStackTrace();
         System.out.println(e.getMessage());
      } finally {
         System.out.println("프로그램종료");
      }
   }

   static void method(Scanner sc) throws InputMismatchException {
      System.out.println("양수만 입력하세요!!");
      int result = sc.nextInt();
      if (result < 0) {
         throw new InputMismatchException("양수를 입력하라했잖아요!!!");
      }
      System.out.println("입력한 숫자는 " + result + "입니다");
   }
}
