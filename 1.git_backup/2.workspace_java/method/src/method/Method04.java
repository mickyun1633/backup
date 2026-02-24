package method;
// 4. 정수 하나를 매개변수로 받아 1부터 해당 정수까지 출력하는 메소드 작성하기
public class Method04 {
	public static void main(String[] args) {
		// 매개변수 선언
		// 정수 int
		int num = 5;
		// for문 (반복출력)
		// int i 변수 선언하고 - 1로 초기화; 변수 i가 num보다 작거나 같을 떄까지;
		// i++ 증감식
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
