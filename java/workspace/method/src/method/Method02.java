package method;
// 2. 하나의 정수를 매개변수로 받아 짝수인지 홀수인지 출력하는 메소드 작성하기
public class Method02 {
	public static void main(String[] args) {
		// 매개변수 선언
		// 정수 int
		// num에 5 저장
		int num = 5;
		// if ~ else 문 (true, false)
		// num을 2로 % 었을때 값이 == 0 이면
		if(num % 2 == 0) {	
			// 값이 true 이면 짝수입니다 실행
			System.out.println(num + "은 짝수입니다.");
		} else {	
			// 값이 false 이면 홀수입니다 실행
			System.out.println(num + "은 홀수입니다.");
			
		}
	
	}
}
