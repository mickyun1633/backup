package typeCasting;
//1번 : 다른 자료형을 문자열로 형변환
// + ""(빈문자열)
public class TypeCasting01 { //클래스 중괄호 시작
   public static void main(String[] args) { // main메소드 중괄호 시작
      int num1 = 10;
      float num2 = 20.17f;
      long num3 = 30L;
      double num4 = 40.17;
      boolean isTrue = true;
      char alpha = 'a';

      System.out.println(num1);
      System.out.println(num2);
      System.out.println(num3);
      System.out.println(num4);
      System.out.println(isTrue);
      System.out.println(alpha);

      System.out.printf("%d + %d = %d", num1, num3, num1 + num3);
      // 10 + 30 = 40
      System.out.println();
      System.out.printf("%f + %f = %f", num2, num4, num2 + num4);
      // 20.170000 + 40.170000 = 60.340000
      System.out.println();
      System.out.printf("%d + %f = %f", num1, num2, num1 + num2);
      // 10 + 20.170000 = 30.170000
      System.out.println();
      String result1 = num1 + num3 + "";
      // 10 + 30 + "" => 40 + "" => "40"
      System.out.println(result1);
      String result2 = num1 + "" + num3;
      // 10 + "" + 30 => "10" + 30 => "1030"
      System.out.println(result2);
      String result3 = "" + num1 + num3;
      System.out.println(result3);

      System.out.println(alpha + "");
      System.out.println(isTrue + "");

   }
}


