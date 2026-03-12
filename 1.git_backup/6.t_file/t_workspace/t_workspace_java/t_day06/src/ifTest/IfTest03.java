package ifTest;

// 7번 : 조건문(if ~ else if ~ else문)
public class IfTest03 {
	public static void main(String[] args) {
		// 0 ~ 100 점수 가능
		// 0 ~ 59 불합격, 60 ~ 100 합격, 그 외 잘못입력했습니다 출력
		System.out.println("프로그램 시작");

		int score = 100;

		if (100 > score && score >= 60) {
			System.out.println("합격");
		} else if (score == 100) {
			System.out.println("만점으로 합격");
		} else if (0 <= score && score < 60) {
			System.out.println("불합격");
		} else {
			System.out.println("점수를 잘못입력했습니다");
		}

		System.out.println("프로그램 끝");

		// 점수 잘못 입력 -> 합격 -> 불합격

		System.out.println("프로그램 시작");

		if (score < 0 || score > 100) {
			System.out.println("점수를 잘못 입력했습니다");
		} else if (score == 100) {
			if(score >= 99 && score >= 60) {
				System.out.println("합격");
			}
			System.out.println("만점으로 합격");
		} else {
			System.out.println("불합격");
		}

		System.out.println("프로그램 끝");

	}
}



