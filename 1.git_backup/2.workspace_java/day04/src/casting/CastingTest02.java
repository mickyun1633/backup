package casting;
//10번 : 자동 형변환 규칙 + 문자와 숫자
public class CastingTest02 {
	public static void main(String[] args) {
		
		//자동형변환
		double number = 1 + 0.0;
		System.out.println(number);
		int num1 = 10;
		double num2 = 0.5;
		double number2 = num1 + num2;
						//10 + 0.5
		System.out.println(number2);
		System.out.println(num1 + num2); //정수 + 실수 => 실수
		char ch = 65;
		System.out.println(ch); //A
		char ch2 = 97;
		System.out.println(ch2); //a
		char ch3 = 'A' + 1;
		System.out.println(ch3); //B
		System.out.println('a' + 1); //98
		//문자형 + 정수 => 정수
		//문자형 변수 = 문자형 + 정수 => 문자
		int number3 = 'Z';
		System.out.println(number3); //정수
	}
}
