package whileTest;

import java.util.Scanner;

//7번 : 반복문 - do ~ while문
public class DoWhileTest {
   public static void main(String[] args) {
      
      int i = 1;
      while (i > 3) {
         System.out.println("i의 값 : " + i);
         i++;
      }
      
      int j = 1;
      do {
         System.out.println("j의 값 : " + j);
         j++;
      }while(j > 3);
      
      //사용자가 100보다 큰 수를 입력할 때까지 반복
      //입력 클래스 import
      //정수형 변수 선언
      //do ~ while문 사용
      //do {
      //   언제 탈출가능한지 출력
      //   숫자 입력 메시지 출력
      //   변수 = nextInt()
      // }while(조건식 변수 <= 100);
      
      Scanner sc = new Scanner(System.in);
      int num;
      do {
         System.out.println("100보다 큰 수를 입력하면 반복문 탈출합니다");
         System.out.println("숫자 입력 : ");
         num = sc.nextInt();
         System.out.println("입력한 수는 " + num + "입니다");
      }while(num <= 100);
      
   }
}