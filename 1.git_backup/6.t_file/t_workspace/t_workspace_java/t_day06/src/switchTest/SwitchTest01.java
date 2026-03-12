package switchTest;

// 9번 : 조건문(switch문)
public class SwitchTest01 { // 클래스 시작
	public static void main(String[] args) {// 메인메소드 시작

		int menu = 2;

		switch (menu) {
		case 1:
			System.out.println("김밥");
			break;
		case 2:
			System.out.println("라면");
			break;
		case 3:
			System.out.println("떡볶이");
			break;
		default: //어느 case에도 해당하지 않을 때 실행(else와 같은 역할)
			System.out.println("메뉴가 없습니다");
			break;
		}
		System.out.println("프로그램 종료");

	}// 메인메소드 끝
}// 클래스 끝




