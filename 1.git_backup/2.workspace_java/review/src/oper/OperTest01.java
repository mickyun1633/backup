package oper;

//8번 : 산술 연산자( +, -, *, /, %)
public class OperTest01 {
   public static void main(String[] args) {

      int num1 = 10, num2 = 20;
      double num3 = 5.5, num4 = 2.5;
      String str1 = "hello", str2 = " java";
      System.out.println("=====덧셈=====");
      System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
      System.out.println(num3 + " + " + num4 + " = " + (num3 + num4));
      System.out.printf("%.1f + %.1f = %.1f\n", num3, num4, num3 + num4);
      System.out.println(num1 + " + " + num3 + " = " + (num1 + num3));
      System.out.println(str1 + str2);

      System.out.println("\n=====뺄셈=====");
      System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
      System.out.println(num3 + " - " + num4 + " = " + (num3 - num4));
      System.out.println(num1 + " - " + num4 + " = " + (num1 - num4));

      System.out.println("\n======곱셈======");
      System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
      System.out.println(num3 + " * " + num4 + " = " + (num3 * num4));
      System.out.println(num1 + " * " + num4 + " = " + (num1 * num4));

      System.out.println("\n======나눗셈======");
      System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
      System.out.println(num3 + " / " + num4 + " = " + (num3 / num4));
      System.out.println(num1 + " / " + num4 + " = " + (num1 / num4));

      System.out.println("\n======나머지======");
      System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
      System.out.println(num3 + " % " + num4 + " = " + (num3 % num4));
      System.out.println(num1 + " % " + num4 + " = " + (num1 % num4));

      // 복합대입연산자
      int num = 10;
      System.out.println("\nnum의 현재 값 : " + num);
//      num = num + 2;
      num += 2;
      System.out.println("\nnum의 현재 값 : " + num);
      num += num;
      System.out.println("\nnum의 현재 값 : " + num);
      num -= 2.5; // num = 24 - 2.5;
      System.out.println("\nnum의 현재 값 : " + num); // 실제 계산값은 21.5인데 21로 나온이유 : int형 변수에 저장했기 때문에

   }
}

