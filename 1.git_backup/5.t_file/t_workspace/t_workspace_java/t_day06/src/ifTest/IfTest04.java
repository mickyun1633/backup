package ifTest;

//8번 : if ~ if문, if ~ else if문, 중첩 if문
public class IfTest04 {
	public static void main(String[] args) {
		// if ~ if문(독립 조건문)
		// 모든 if 조건식을 각각 검사, 앞의 if문이 true라도 뒤의 if문을 무조건 검사
		// 여러 조건이 동시에 실행될 수 있음

		int score = 100;

		if (score >= 60) {
			System.out.println("합격");
		}
		if (score == 100) {
			System.out.println("만점으로 합격");
		}

		// if ~ else if(선택 조건문)
		// 위에서부터 조건을 하나씩 검사 true가 나오면 그 아래 조건들은 전부 스킵
		// 단 하나의 블록만 실행

		if (score >= 60) {
			System.out.println("합격");
		} else if (score == 100) {
			System.out.println("만점으로 합격");
		}

		//중첩 if문
		// 점수 잘못입력, 만점으로 합격, 합격, 불합격
		if (score >= 0 && score <= 100) { // 조건식1 : 점수 유효성 검사
			// 0 ~ 100 값일 때만 중괄호 안으로 들어옴
			if (score >= 60) { // 조건식2 : 합격 여부
				if (score == 100) { // 조건식3 : 만점 여부
					System.out.println("만점으로 합격");
				} else {
					System.out.println("합격");
				}
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("점수 잘못 입력");
		}

	}
}














