package t_day09_task;

public class MethodTask {
	public static void main(String[] args) {

		MethodTask mt = new MethodTask();
		System.out.println(mt);

//		System.out.println("===1번 문제===");
		// 매개변수 o, 리턴값 o 호출 => syso(객체명.메소드명(인수));
		// 자료형 변수명 = 객체명.메소드명(인수);
//		System.out.println(mt.changeSign(10));
//		System.out.println(mt.changeSign(-10));

//		System.out.println(mt.printName(3, "홍길동"));

//		double getAvg(int[] arr) {
//			int total = 0;
//			for(int num : arr) {
//				total += num;
//			}
//			return (double)total / arr.length;
//		}

		System.out.println("===4번문제===");
		int[] ar = { 10, 20, 30, 40, 50 };
		System.out.println(mt.getAvg(ar));
		System.out.println(mt.getAvg(new int[] { 1, 2, 3, 4, 5 }));

		System.out.println("===7번문제===");
// main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
// id가 test 이고 비밀번호가 abcd이면 일반 회원님 환영합니다 출력
// id와 비밀번호 둘 중 하나라도 틀리면 다시 확인하세요 출력
		String id = "test";
		String pw = "abcd";
		// boolean 리턴타입이 되어있으므로 if 조건식 안에 메소드 호출을 값으로 사용할 수 있다
		if (mt.login(id, pw)) {
			if (id.equals("admin")) {
				System.out.println("관리자님 환영합니다");
			} else if (id.equals("test")) {
				System.out.println("일반회원님 환영합니다");
			}
		} else {
			System.out.println("다시 확인하세요");
		}
	}
	// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
	// 매개변수 o, 리턴값 o
	// 메소드명 : changeSign

	// 1) 기능 생각 => 음수면 양수, 양수면 음수 * -1
	// 2) 리턴타입 생각 => void
	// 3) 메소드명 생각 => changeSign
	// 4) 매개변수 생각 => 정수형 1개
	// 5) 구현 실행문 생각 => 매개변수 * -1
	// 6) return => return 매개변수 * -1
	// 7) 리턴타입 수정 => int

	int changeSign(int num) {
		return num * -1;
	}

	// 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
	// 매개변수 o, 리턴값 o
	// 메소드명 : printName

	// 1) 기능 => 전달된 정수만큼 전달된 이름 출력
	// 2) 리턴타입 => void
	// 3) 메소드명 => printName
	// 4) 매개변수 => 2개(int, String) (String, int)
	// 5) 구현부 { 실행문
	// 5-1) for문 //초기식 int i = 1, 조건식 i <= 정수형매개변수, 증감식 i++
	// 5-2) { 출력(문자열 매개변수) return 문자열매개변수 }
	// 6) 리턴값 => "정수 : " + 정수형매개변수 + "이름 : " + 문자열매개변수
	// 7) 리턴타입 수정 => String

//	String printName(int number, String name) {
//		for(int i = 1; i <= number; i++) {
//			System.out.println(name);
//		}
//		return "정수 : " + number + "번, 이름 : " + name;
//	}

	String printName(int number, String name) {
		String result = "";
		for (int i = 1; i <= number; i++) {
			result += name + "\n";
		}
		return result;
	}

	// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
	// 매개변수 o, 리턴값 o
	// 메소드명 : changeNumber

	// 리턴타입 => int
	// 메소드명 => changeNumber
	// 매개변수 => 정수형 1개
	// 실행문 리턴값 => 리턴값 삼항연산자
	int changeNumber(int num) {
		return num <= 10 ? 1 : 100;
	}
	// 호출 : syso(mt.changeNumber(10)); => 1

	// 4. 5개의 정수 중 평균을 반환하는 메소드
	// 매개변수 o(배열), 리턴값 o
	// 메소드명 : getAvg

	// 1) 리턴타입 => void
	// 2) 메소드명 => getAvg
	// 3) 매개변수 => int[] arr
	// 4) 실행문 =>
	// 총합구할 변수 선언
	// 반복문(for-each문)
	// 총합구할 변수 += 반복문변수명
	// 5) 리턴 생각 => (실수형) 총합구할변수 / 배열.length;
	// 6) 리턴타입을 변경 => double

	double getAvg(int[] arr) {
		int total = 0;
		for (int num : arr) {
			total += num;
		}
		return (double) total / arr.length;
	}

	// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
	// 매개변수 o(배열), 리턴값 x
	// 메소드명 : printMinMax

	// 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	// 예시) BanaNA -> bANAna
	// 메소드명 : changeCase
	// 매개변수와 반환값은 자유 => 단, 형 변환 이용할 것!!

	// 7. 아이디와 비밀번호를 입력받아 로그인 하기
	// 매개변수 o 리턴값 o(단, 리턴타입 boolean)
	// 메소드명 : login
	// main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
	// id가 test 이고 비밀번호가 abcd이면 일반 회원님 환영합니다 출력
	// id와 비밀번호 둘 중 하나라도 틀리면 다시 확인하세요 출력

	boolean login(String id, String pw) {
		// 조건문 if(매개변수id.equals("admin") && 매개변수pw.equals("1234"))
		// => return true;
		// else => return false;

		if (id.equals("admin") && pw.equals("1234")) {
			return true;
		} else if (id.equals("test") && pw.equals("abcd")) {
			return true;
		} else {
			return false;
		}

	}

}
