package scanner;

import java.util.Scanner;

//6번 : 문자열로 입력받은 후 정수형으로 형변환 연산처리
public class ScannerTest04 {
   public static void main(String[] args) {

      // 두 정수를 입력받고 합을 출력하기
      // next()를 사용한다
      // [출력결과]
      // 정수1 입력 : 20
      // 정수2 입력 : 40
      // 두 정수의 합은 60입니다

      // 1) 입력클래스 import
      Scanner sc = new Scanner(System.in);
      // 2) 출력메시지
      System.out.print("정수1 입력 : ");
      // 3) 문자열 변수1 선언 next()
      String num1 = sc.next();
      // 4) 출력메시지
      System.out.print("정수2 입력 : ");
      // 5) 문자열 변수2 선언 next()
      String num2 = sc.next();
      // 6) 정수형 변수 선언 변수1, 변수2 정수형으로 각각 형변환 후 덧셈연산처리
      int result = Integer.parseInt(num1) + Integer.parseInt(num2);
      // 7) 출력
      System.out.println("두 정수의 합은 " + result + "입니다.");
//      8) 스캐너 해제
//      sc.close();

      // 한줄로 형변환
      System.out.println("정수 1 입력 : ");
      int number1 = Integer.parseInt(sc.next());
      System.out.println("정수 2 입력 : ");
      int number2 = Integer.parseInt(sc.next());
      System.out.println("두 정수의 합은 " + (number1 + number2) + "입니다");

      // next(), nextLine()
      System.out.println("정수1입력 : ");
      int num3 = Integer.parseInt(sc.next());
      sc.nextLine(); // 버퍼비우기(엔터를 소모한다)
      System.out.println("정수2입력 : ");
      int num4 = Integer.parseInt(sc.nextLine());
      System.out.println("두 정수의 합은 " + (num3 + num4) + "입니다");
      sc.close();

   }

}
