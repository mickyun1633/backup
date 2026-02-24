package ifTest;

import java.util.Scanner;

//6번 : 조건문(if ~ else문)
public class IfTest02 { // 클래스 시작
   public static void main(String[] args) { // main 메소드 시작

      System.out.println("출력시작");

      // 사용자로부터 점수를 입력받아서 60점 이상이면 합격 아니면 불합격 여부 출력하기
      //1) 입력클래스 import
      //2) 어떤값을 입력받을지 출력메시지
      Scanner sc = new Scanner(System.in);
      System.out.println("점수 입력 : ");
      int score = sc.nextInt(); //입력메소드로 변경 sc.nextInt();

      if (score >= 60) {
         // 조건이 true 일 때 if문 영역 실행
         System.out.println("합격");
      } else {
         // 조건이 false 일 때 else문 영역 실행
         System.out.println("불합격");
      }

      System.out.println("출력끝");
      sc.close(); //스캐너닫기
      
   } // main 메소드 끝
} // 클래스 끝












