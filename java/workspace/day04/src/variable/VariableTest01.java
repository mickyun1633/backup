package variable;
//1번 : 변수 선언과 초기화
public class VariableTest01 { //클래스 시작 중괄호
	public static void main(String[] args) { //메인메소드 시작 중괄호
		//정수값을 저장할 수 있는 변수 num1을 선언
		int num1; //정수형 값을 저장할 수 있는 num1 저장공간 선언
		
		//출력 syso + ctrl + space bar + enter
//		System.out.println(num1); 
//		The local variable num1 may not have been initialized
//		지역변수 num1이 초기화 되지 않았을 수 있다
		num1 = 10; //num1 저장공간에 10이라는 정수형 값을 대입
		System.out.println(num1); //num1 변수에 저장된 값이 출력
		
		long num2; //정수형 값을 저장할 수 있는 num2 변수 선언
		num2 = 10L; //num2 변수에 10L이라는 정수형 값을 대입
		System.out.println(num2); //num2 변수에 저장된 값이 출력
		
		double num3 = -3.14; //실수형 값을 저장할 num3 변수를 선언하고 동시에 -3.14값으로 초기화
		System.out.println(num3); //num3 변수에 저장된 값이 출력
		float num4 = -3.14f; //실수형 값을 저장할 num4 변수를 선언하고 동시에 -3.14f값으로 초기화
		System.out.println(num4); //num4 변수에 저장된 값이 출력
		
		//여러개의 변수를 선언과 동시에 초기화 가능
		//자료형은 1개로 동일해야한다
		char alpha1='a', alpha2='b';
		//문자를 저장할 수 있는 변수 alpha1, alpha2를 선언하고 동시에 'a', 'b'로 초기화한다 
//		alpha1 = 'a';
//		alpha2 = 'b';
		System.out.println(alpha1);
		System.out.println(alpha2);
		
	} //메인메소드 끝 중괄호
} //클래스 끝 중괄호

