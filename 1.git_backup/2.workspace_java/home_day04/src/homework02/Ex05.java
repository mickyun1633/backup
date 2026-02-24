package homework02;
/*5번 : 아래 조건에 맞게 코드 작성하기
	[조건] 										[출력결과]

	정수형 변수 num1에 10							10 / 3 = 3.333333
	실수형 변수 num2에 3
	자동 형변환이 발생하도록 연산
	printf() 사용
	소수점 6자리까지 출력 */				

public class Ex05 {
	public static void main(String[] args) {
		
		int num1 = 10;
		double num2 = 3;
		double num3 = num1/num2;
		System.out.printf("%d / %.0f = %.6f" , num1, num2, num3);							
	}

}
