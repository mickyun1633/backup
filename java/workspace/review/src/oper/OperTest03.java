package oper;

//10번 : 증감 연산자
public class OperTest03 {
   public static void main(String[] args) {

      int num1 = 1, num2 = 1;
      System.out.println("현재 num1의 값 : " + num1);

      System.out.println("\n======증감연산자(전위형)======");
      System.out.println("기존 num1의 값 : " + num1);
      System.out.println("전위증가연산자를 사용한 num1의 값 : " + ++num1);
      System.out.println("현재 num1의 값 : " + num1);

      System.out.println("\n======증감연산자(후위형)======");
      System.out.println("기존 num2의 값 : " + num2);
      System.out.println("후위증가연산자를 사용한 num2의 값 : " + num2++);
      System.out.println("현재 num2의 값 : " + num2);

      System.out.println();
      int num3 = 7, num4 = 7;
      int result1 = 0, result2 = 0;

      System.out.println("현재 num3의 값 : " + num3);
      result1 = --num3 + 4;
      System.out.println(result1);
      System.out.println("현재 num3의 값 : " + num3);

      System.out.println("현재 num4의 값 : " + num4);
      result2 = num4++ - 4;
      System.out.println(result2);
      System.out.println("현재 num4의 값 : " + num4);

   }
}
