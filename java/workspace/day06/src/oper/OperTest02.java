package oper;
// 2번 : 연산자 복습 확인
public class OperTest02 {   
   public static void main(String[] args) {
      int num1 = 10, num2 = 20, num3 = 30;
      String data1 = "hello", data2 = "java", data3 = "java", data4 = null, data5 = null;
      
      System.out.println(num1 + " == " + num3 + " : " + (num1 == num3));
      System.out.println(data1 + " == " + data3 + " : " + (data1 == data3));
      System.out.println(data2 + " == " + data3 + " : " + (data2 == data3));
      System.out.println(data4 + " == " + data5 + " : " + (data4 == data5));
      // == : 참조(주소) 비교
      // 문자열 내용이 같아도 false가 나올 수 있거나 true 나올 수 있어 위험
      // null : 아무것도 참조하지 않는다 값이 아니라 참조 대상이 없는 상태
      // null과 ""는 다르다
      System.out.println(null == "");
      System.out.println("java".equals("java"));
      System.out.println(data4.equals(data5));
      //문자열 비교는 .equals() 메소드를 사용한다!!
      
   }
}

