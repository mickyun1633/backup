package method;
// 5. 정수 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드 작성하기
public class Method05 {
	public static void main(String[] args) {
		// 매개변수 선언
		// 정수 배열 선언
		// 선언와 동시에 배열에 1,2,3,4,5 값 저장
		int[] number = { 1, 2, 3, 4, 5 };
		// for문 (반복실행)
		// int i 변수 선언하고 - 1로 초기화; 변수 i가 number 길이(.length 사용)보다 작거나 같을 떄까지;
		// i++ 증감식
		for(int i = 1; i <= number.length; i++) {
			System.out.println(i);
		}
		
		
		
	}
}
