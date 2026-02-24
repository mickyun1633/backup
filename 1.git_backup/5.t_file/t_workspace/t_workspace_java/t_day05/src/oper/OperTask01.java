package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {

		// [실습1] 물건값과 지불금액을 입력받아 거스름돈을 출력하기
		// 단, 거스름돈을 1000원, 500원, 100원 짜리로 나누어 표시하세요.
		// 클래스명 : OperTask01.java
		//
		// [입출력예시]
		// 물건값 : 2700
		// 지불금액 : 5000
		// 거스름돈은 2300원 입니다.
		// 1000원 : 2개
		// 500원 : 0개
		// 100원 : 3개

		// 1) 입력클래스 import
		Scanner sc = new Scanner(System.in);

		// 2) 물건값을 입력하라는 메시지 출력
		System.out.println("물건값 : ");

		// 3) 정수형 물건값 입력(nextInt())
		int price = sc.nextInt();

		// 4) 지불금액 입력하라는 메시지 출력
		System.out.println("지불금액 : ");

		// 5) 정수형 지불금액 입력(nextInt())
		int money = sc.nextInt();

		// 6) 지불금액 - 물건값 => 거스름돈을 계산 후 변수에 저장
		int change = money - price;

		// 7) 계산된 거스름돈의 총액 출력
		System.out.println(change);

		// 8) 거스름돈을 1000원으로 / 1000원 지폐의 개수 저장(변수)
		int count1000 = change / 1000;

		// 9) 1000원 지폐를 제외한 나머지 금액을 % 다시 거스름돈 변수에 저장
		change %= 1000;

		// 10) 남은 거스름돈을 500원으로 / 500원 동전의 개수로 저장
		int count500 = change / 500;

		// 11) 500원 동전을 제외한 나머지 금액을 다시 거스름돈 변수에 저장 %
		change %= 500;

		// 12) 남은 거스름돈을 100원으로 / 100원 동전의 개수로 저장
		int count100 = change / 100;

		// 13) 1000원, 500원, 100원 각각의 개수 출력
		System.out.println("1000원 : " + count1000 + "\n500원 : " + count500 + "\n100원 : " + count100);

		// 14) sc.close() 스캐너 닫기
//		sc.close();
		
		//방법2)
		int change2 = money - price;
		int thousand = change / 1000;
		int fiveHundred = (change - thousand * 1000) / 500;
		int hundred = (change - thousand * 1000 - fiveHundred * 500) / 100;
		
		
		
		
	}
}








