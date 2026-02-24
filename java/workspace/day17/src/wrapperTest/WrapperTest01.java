package wrapperTest;

// wrpper클래스(boxing과 unboxing)
public class WrapperTest01 {
   public static void main(String[] args) {
      // boxing : 기본 자료형 -> wrapper클래스
      int num = 10;
      System.out.println(num);

      // 예전방법
//      Integer number = new Integer(num);
      // 최근방법
      Integer num1 = Integer.valueOf(num);
      System.out.println(num1);
      System.out.println(num1.toString());

      // unboxing : wrapper 클래스 -> 기본 자료형
      int unNum1 = num1.intValue();
      System.out.println(unNum1);
//      System.out.println(unNum1.toString());

      // Auto Boxing
      double num2 = 1.1; // 기본자료형의 값
      Double dNum = num2; // boxing
      System.out.println(dNum.toString() + 10);

      // Auto unBoxing
      double unNum2 = dNum;
      System.out.println(unNum2 + 10);

   }
}
