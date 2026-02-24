package review;

import java.util.Scanner;

public class SingTask04 {
	public static void main(String[] args) {
//      한 곡당 가격은 200원, 음료 가격은 100원이다.
//      사용자로부터 금액을 입력받아 음료를 구매하지 않을 경우 부를 수 있는 곡 수와 잔돈 출력하기
//      음료를 구매할 경우 부를 수 있는 곡 수와 잔돈 출력하기

//		[입력 예시]
//		금액입력 : 1000
//
//		[출력 예시]
//		5곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다

		// 사용할 문법
		// 입력 Scanner클래스, nextInt(), 스캐너 닫기
		// 출력 println, printf
		// 조건문 if~else
		// 연산 산술연산자, 관계연산자
		// 상수 final

		// 1) 입력 클래스 import
		// 2) 노래가격과 음료 상수로 선언
		// 3) 금액변수 입력 메소드 .nextInt()
		// ===음료구매x===
		// 4) 부를수있는곡변수 금액변수 / 한곡당 가격
		// 5) 잔돈변수 금액 % 한곡당가격
		// 6) 출력
		// 7) if음료 금액보다 잔액이 크거나 같을경우
		// 7-1) 음료를 마시고 싶으면 곡을 부를수있으며 잔돈은 원입니다 출력
		// 8) else if음료를 마시기 위해 노래곡수를 한 곡 줄이는 경우
		// 8) (노래 곡 수 > 0) && (금액 - ((노래곡수 -1 )*노래가격)) >= 음료금액)
		// 8-1) 음료마실경우 노래곡수 = 노래곡수 - 1
		// 8-2) 음료마실경우 잔돈 = 금액 - (음료마실경우 노래곡수 * 노래가격 + 음료금액)
		// 8-3) 출력

		Scanner sc = new Scanner(System.in);
		final int PRICE = 200, PRICE_DRINK = 100;
		int money = 0, song = 0, change = 0, drinkSong = 0, drinkChange = 0;
		System.out.println("금액 입력 : ");
		money = sc.nextInt();
		song = money / PRICE;
		change = money % PRICE;
		drinkSong = song - 1;
		System.out.printf("%d곡을 부를 수 있고 잔돈은 %d원 입니다.\n", song, change);

		if (change >= PRICE_DRINK) {
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원 입니다.\n", song, change - PRICE_DRINK);
		} else if ((song > 0) && (money - (drinkSong * PRICE)) >= PRICE_DRINK) {
			drinkChange = money - (drinkSong * PRICE + PRICE_DRINK);
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원 입니다.\n", drinkSong, drinkChange);

		}
		sc.close();

	}
}
