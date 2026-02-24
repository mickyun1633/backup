package homework02;
/*7번 : 아래 조건에 맞게 코드를 작성하고 출력하기
[조건]

실수형 변수 num1에 66.8
정수형 변수 num2에 강제 형변환
문자형 변수 ch에 강제 형변환
printf() 1번만 사용
제어문자 \n 사용    */

public class Ex07 {
	public static void main(String[] args) {
		
		double num1 = 66.8;
		int num2 = (int)num1;
		char ch = (char)num2;
		System.out.printf("%d \n%c", num2,ch);
	}
}
