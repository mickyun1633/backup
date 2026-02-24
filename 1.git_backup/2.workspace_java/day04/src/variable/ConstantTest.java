package variable;

//3번 : 상수
public class ConstantTest {
	public static void main(String[] args) {
		// 변수선언 => 자료형 변수명 = 값;
		int maxAge = 150;
		System.out.println(maxAge); // 150
		maxAge = 100;
		System.out.println(maxAge); // 100
		// 1) 상수 선언
//		final 자료형 상수명 = 값;
//		상수명은 대문자와 스네이크 표기법 사용
		final int MAX_AGE = 150;
		System.out.println(MAX_AGE); // 150
//		MAX_AGE = 100;
//	The final local variable MAX_AGE cannot be assigned. It must be blank and not using a compound assignment
		System.out.println(MAX_AGE);

		// 2) 초기화 필수(상수는 재할당 불가능, 초기화된 값으로만 사용한다)
		final int LIMIT = 10;
		System.out.println(LIMIT);

		// 3) 불변성(값 변경 불가능)
//		MAX_AGE = 5;
//		LIMIT = 20;

	}
}
