package oper;

import java.util.Scanner;

public class OperTask02 {
   public static void main(String[] args) {
      // 1. 이름과 나이, 취미를 순서대로 입력받기
//      (입력메소드 이름과 취미 nextLine()사용, 나이는 next()사용)
//      출력 시 printf 사용, 형변환 반드시 적용해서 출력할 것, 덧셈연산자 사용

      // 이름입력 : 홍길동
      // 나이입력 : 20
      // 취미입력 : 여행
      // [출력]
      // 홍길동은 20살이고 취미는 여행입니다.
      // 홍길동은 2026년에 21살입니다.
	   
	  // 1.[로직구성] 
	  // 1) 입력클래스 import
	   Scanner sc = new Scanner(System.in);
	   
	  // 2) 이름 입력하라는 메시지 출력
	   System.out.println("이름입력 : ");
	   
	  // 2-1) 문자형 이름 입력
	   String name = sc.nextLine();
	   
	  // 3) 나이 입력하라는 메시지 출력
	   System.out.println("나이입력 : ");
	   
	  // 3-1) 정수형 나이 입력
	   int age = sc.nextInt();
	   
	  // 3) 취미 입력하라는 메시지 출력
	   System.out.println("취미입력 : ");
	   
	  // 4) 취미 입력하라는 메시지 출력
	   String hobby = sc.nextLine(); 
	   
	  // 5) 입력된 값 이름, 나이, 취미 출력
	   System.out.println(name + "은 " + age + "살이고 취미는" + hobby + "입니다.");
	
	   
	   
	   
	   
	   

      // 2. 코인노래방 프로그램
      // 사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
      // 금액입력 :
      // 노래 1곡당 가격 : 600원
      // [출력]
      // 0곡을 부를 수 있으며 잔돈은 00원 입니다
	   
	  //1.[로직구성]
	  //1). 입력 클래스 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

   }
}
