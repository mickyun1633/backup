package apiTest;

import apiTest2.Calc1;

public class ApiTest2 {
   public static void main(String[] args) {
      Calc1 cal = new Calc1();
      try {
         System.out.println(cal.divide(10, 0));
      } catch (ArithmeticException e) {
         // TODO Auto-generated catch block
         System.out.println("0사용불가능");
      }
      
   }
}
