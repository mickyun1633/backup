package oper;

//9번 : 관계연산자와 논리연산자
public class OperTest02 {
   public static void main(String[] args) {
      System.out.println("========관계연산자========");

      int num1 = 10, num2 = 20, num3 = 10;
      System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
      System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
      System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
      System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
      System.out.println(num1 + " == " + num3 + " : " + (num1 == num3));
      System.out.println(num1 + " != " + num3 + " : " + (num1 != num3));
      // 이상, 이하, 초과, 미만

      System.out.println("\n========논리연산자========");
//      System.out.println(5<=num1<15);
//      System.out.println(5<=num1 && num1<10);
//      System.out.println(5<=num1); //num1 = 10
//      System.out.println(num1<10); //num1 = 10
      System.out.println("and : 둘 다 참이면 참(&&)");
      System.out.println(true && true); // true
      System.out.println(true && false); // false
      System.out.println(false && true); // false
      System.out.println(false && false); // false

      System.out.println("or : 둘 중 하나라도 참이면 참(||)");
      System.out.println(true || true); // true
      System.out.println(true || false); // true
      System.out.println(false || true); // true
      System.out.println(false || false); // false

      System.out.println("not : 참이면 거짓, 거짓이면 참(!)");
      System.out.println(!true);
      System.out.println(!false);
   }
}
