package switchTest;

//11번 : java14버전 이상부터 switch Expression
//화살표 문법
public class SwitchTest03 {
	public static void main(String[] args) {

		int date = 7;

		switch (date) {
		case 5 -> System.out.println("월요일");
		case 6 -> System.out.println("화요일");
		case 7 -> System.out.println("수요일");
		case 8 -> System.out.println("목요일");
		case 9 -> System.out.println("금요일");
		default -> System.out.println("기타");
		}

		int month = 1;

		switch (month) {
		case 12, 1, 2 -> System.out.println("겨울");
		case 3, 4, 5 -> System.out.println("봄");
		case 6, 7, 8 -> System.out.println("여름");
		case 9, 10, 11 -> System.out.println("가을");
		}

		int score = 80;
		// 변수에 switch 표현식을 저장하는 것이 가능하다
		// 단, switch 표현식은 반드시 모든 경우에 값을 반환해야한다
		// default를 무조건 작성해야 오류가 발생하지 않는다(처리되지 않는 값이 존재하면 컴파일 오류 발생)
		String result = switch (score / 10) {
		case 10, 9, 8 -> "A";
		case 7, 6 -> "B";
		default -> "F";
		};
		System.out.println(result);

//		switch(month) {
//		case 1, 2, 12:
//			System.out.println("겨울");
//			break;
//		case 3, 4, 5:
//			System.out.println("봄");
//		    break;
//		}

	}
}
