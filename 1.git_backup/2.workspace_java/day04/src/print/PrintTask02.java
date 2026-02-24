package print;
//8번 : 실습2
public class PrintTask02 {
	public static void main(String[] args) {
//		문제1. 아래 값을 이용하여 자리수를 맞춰 출력하기(10자리기준, printf()만 사용)
//		상품명		가격
//		노트북		1200000
//		마우스		55000

//		[출력예시]
//		상품명    가격
//		노트북  1200000
//		마우스    25000
		System.out.printf("%-10s %s\n", "상품명", "가격");
		System.out.printf("%-10s %d\n", "노트북", 1200000);
		System.out.printf("%-10s %d\n", "마우스", 55000);

//		문제2. 아래 조건을 만족하는 프로그램 작성하기
//		변수 : 이름(String), 나이(int), 키(double, 170.32)
//		상수	: 최대나이 = 100
//		출력 printf()사용, 키는 소수점 첫째자리까지 사용
		String name = "홍길동";
		int age = 20;
		double height = 170.32;
		final int MAX_AGE = 100;

		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f, 최대 나이 : %d\n", name, age, height, MAX_AGE);

//		문제3. 에러가 발생하는 이유를 주석으로 작성하기
//		final int MAX = 10;
//		MAX = 20;
		// final로 선언된 상수는 한 번만 값 할당이 가능하다
		// 이미 10으로 초기화된 MAX에 다시 값을 대입하려 해서 에러발생

//		문제4. 다음 조건에 맞는 상수를 선언하고 출력하기(상수명 규칙 반드시 지킬것)
//		최대 인원수 : 30
//		원주율 : 3.1415
//		학교이름 : 코리아학교

		final int MAX_COUNT = 30;
		final double PI = 3.1415;
		final String SCHOOL_NAME = "코리아학교";

		System.out.println("최대 인원수 : " + MAX_COUNT);
		System.out.println("원주율 : " + PI);
		System.out.println("학교이름 : " + SCHOOL_NAME);

	}
}
