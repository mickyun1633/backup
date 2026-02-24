package variable;

//2번 : 변수명 주의사항
public class VariableTest02 { // 클래스 시작
	public static void main(String[] args) { // main메소드 시작
		// 변수 선언시 주의사항
		// 1. 같은 영역에서 같은 이름의 변수 선언 불가
		int age = 20;
//		int age = 10;
		// Duplicate local variable age
		// 같은 영역(Scope)안에서 이미 선언된 age 변수를 또 선언 시 발생하는 오류
		// 해결방법 => 변수명을 바꾸거나 기존 변수를 선언하지 말고 값만 변경한다

		// 2. 소스코드 위쪽에 한꺼번에 선언
//		int userAge;
//		int userHeight;
//		boolean isStudent;

		// 3. 선언과 동시에 초기화(권장)
		int userAge = 25;
		int userHeight = 100;
		boolean isStudent = true;

		// 변수명 작성시 주의사항

//		1. 문자로 시작해야한다
		int count;
		int _count;
		int $count;
//		int 1count; //불가능

//		2. 특수문자 불가능하다(단, _ $만 가능)
		int user_age;
//		int user-age; 특수문자 불가능
//		int user!@#$%;

//		3. 공백 사용 불가능하다
//		변수, 메소드 선언시 : 카멜케이스
		String userName = "홍길동";
//		클래스 선언시 : 파스칼케이스
		String UserName = "짱구";
		System.out.println(userName);
		System.out.println(UserName);

//		4. 예약어 사용 불가
//		int int; (x)
//		int class; (x)
//		int for; (x)

//		5. 소문자로 시작 (권장)
		int totalScore = 100;

//		6. 의미없는 이름 지양
		int number = 1;
		int grade = 2;

//		7. 한글 사용 가능하나 지양
//		int 나이 = 20;
//		System.out.println(나이);

	} // main메소드 끝
} // 클래스 끝
