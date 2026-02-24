package homework02;
/*6번 : 아래 조건에 맞게 코드를 작성하고 출력하기
[조건]

정수형 변수 num1에 7
정수형 변수 num2에 2
실수형 변수 result에 저장
출력 결과가 3.5가 되도록 작성
출력 메소드 자유   */

public class Ex06 {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 2;
		double result = (float)num1/num2;
		System.out.printf("%.1f",result);								
	}
}
