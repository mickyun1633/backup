package typeCasting;
// 2번 : 문자열 자료형 -> 다른 기본 자료형 형 변환
public class TypeCasting02 { // 클래스 중괄호 시작
   public static void main(String[] args) { // main메소드 중괄호 시작
      
      //기본자료형 -> 문자열자료형
      String str1 = 3 + "";
      String str2 = 1.6 + "";
      String str3 = 'a' + "";
      String str4 = false + "";
      
      System.out.printf("str1 : %s str2 : %s  str3 : %s str4 : %s", str1, str2, str3, str4);
      //str1 : 3 str2 : 1.6  str3 : a str4 : false
      System.out.println();
      //문자열 -> 기본 자료형
      int num1 = Integer.parseInt(str1); //문자열 -> 정수로 형변환
      System.out.println(num1);
      System.out.println(num1 + 1);
      System.out.println(str1 + 1);
      
      double num2 = Double.parseDouble(str2);
      System.out.println(num2);
      System.out.println(num2 + 1);
      System.out.println(str2 + 1);
      
      boolean isFalse = Boolean.parseBoolean(str4);
      System.out.println(isFalse);
      System.out.println(!isFalse);
//      System.out.println(!str4);
      
      char ch = str3.charAt(0);
      System.out.println(ch);
      char ch2 = "hello".charAt(1); // 인덱스는 0부터 시작한다!!
      System.out.println(ch2);
      
   } //main 메소드 중괄호 끝

} //클래스 중괄호 끝