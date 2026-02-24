package enumTest;
//10번 : enum

public class EnumTest {

	enum Day {
		MONDAY(false), TUESDAY(false), WEDESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);

		// 필드
		boolean week;

		// 생성자
		private Day(boolean week) {
			this.week = week;
		}

		// 메소드
		boolean weekday() {
			return this.week;
		}
	}

	public static void main(String[] args) {
		Day today = Day.THURSDAY;
		System.out.println("오늘은 " + today + "입니다");

		String result;

//		// switch문을 사용하여 열거형 상수 처리
//		switch (today) {
//		case MONDAY:
//			result = "월요일";
//			break;
//		case THURSDAY:
//			result = "목요일";
//			break;
//		case WEDESDAY:
//			result = "수요일";
//			break;
//		default:
//			result = "다른 요일";
//			break;
//		}
//		System.out.println("오늘은 " + result + "입니다");
		System.out.println(today.weekday());
		// 조건문 오늘이 평일인지 주말인지 확인
		if (today.weekday()) {
			System.out.println("오늘은 주말입니다");
		} else {
			System.out.println("오늘은 평일입니다");
		}
	}
}
