package method;
// 8. 문자열과 정수 하나를 매개변수로 받아 문자열을 정수만큼 반복 출력하는 메소드 작성하기
public class Method08 {
	public static void main(String[] args) {
		//매개변수 선언
		// 문자열 String 
		// text에 "A" 저장
		String text = "A";
		// 정수 int
		// num에 5 저장
		int num = 5;
		// for문 (반복실행)
		// int i 변수 선언하고 - 1로 초기화; 변수 i가 num보다 작거나 같을때(=정수만큼)
		// i++ 증감식
		for (int i = 1; i <= num; i++) {
			System.out.println(text);
		}
		
		
	}
}
