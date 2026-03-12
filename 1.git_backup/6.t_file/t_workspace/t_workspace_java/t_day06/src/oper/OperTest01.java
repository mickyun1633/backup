package oper;

import java.util.Scanner;

//1번 : 삼항 연산자
public class OperTest01 {
	public static void main(String[] args) {

		// 조건식 ? 참일 때의 값 : 거짓일 때의 값;
		// 조건식은 반드시 boolean 결과를 반환해야한다(true, false)
		// 삼항 연산자는 값을 반환하므로 변수에 저장하거나 바로 출력할 수 있다

		System.out.println(true ? "참입니다" : "거짓입니다");
		System.out.println(false ? "참입니다" : "거짓입니다");

		System.out.println(10 > 5);
		System.out.println(10 > 5 ? "10이 더 큰 수 입니다" : "10이 큰 수가 아닙니다");
		String result1 = 10 > 5 ? "10이 더 큰 수 입니다" : "10이 큰 수가 아닙니다";
		System.out.println(result1);
		System.out.println(10 > 5 && 10 == 5 ? "true입니다" : "false입니다");

		int number = 1 < 2 ? 1 : -1;
		System.out.println(number);

		// 정수 2개를 입력받아서 큰 수 구하기
		// 정수형 변수 2개, 입력 클래스 import, 관계연산자, 삼항연산자, 출력메소드
		// 1) 입력클래스 import
		Scanner sc = new Scanner(System.in);
		// 1-1) 정수형 변수 2개 선언 num1, num2
		int num1, num2;
		// 2) 정수1 입력
		System.out.println("정수1 입력 : ");
		// 3) num1 입력 메소드(nextInt()) Integer.parseInt(sc.nextLine());
		num1 = sc.nextInt();
		// 4) 정수2 입력
		System.out.println("정수2 입력 : ");
		// 5) num2 입력 메소드(nextInt())
		num2 = sc.nextInt();
		// 6) 입력받은 값들을 비교 => 관계 연산자
		System.out.println(num1 > num2);
		// 두수 비교 값 출력 => true, false
		// 7) true ? num1 + "이 큽니다" : num2 + "가 큽니다"
		System.out.println(num1 > num2 ? num1 + "이/가 큽니다" : num2 + "이/가 큽니다");

	}
}
