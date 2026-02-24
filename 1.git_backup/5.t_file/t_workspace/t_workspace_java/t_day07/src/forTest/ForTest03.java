package forTest;

// 3번 : for문과 기타 제어문(break, continue)
public class ForTest03 {
	public static void main(String[] args) {
		// for문과 break문
		for (int i = 1; i < 11; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		// for문과 continue문
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(i);
		}

		// 1~10까지 중 홀수일 때만 출력
		// for문
		// 초기식 int i = 1 조건식 i <= 10 증감식 i++ 실행문 i출력
		// 초기식 int i = 0 조건식 i < 10 증감식 i += 2 실행문 i + 1 출력
		// 초기식 int i = 9 조건식 i >= 1 증감식 i -= 2 실행문 i 출력
		// 초기식 int i = 1, count = 0; count < 5; i++, count++ 실행문 i * 2 - 1 출력

		// for문과 조건문 + 기타제어문
		// for(){}
		// 초기식 int i = 1 조건식 i <= 10 증감식 i++
		// if(짝수 i % 2 == 0){
		// 기타제어문 continue문
		// }
		// 출력 i

	}
}
