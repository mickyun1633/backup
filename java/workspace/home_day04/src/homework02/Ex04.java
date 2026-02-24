package homework02;
/*4번 : 제어문자와 printf(한번만사용)를 사용하여 아래와 동일하게 출력하기

[출력결과]
A
B	C  */

public class Ex04 {
	public static void main(String[] args) {
		
		int Num = 65;
		char ch = (char)Num;
		int Num1 = 66;
		char ch1 =(char)Num1;
		int Num2 = 67;
		char ch2 = (char)Num2;
		System.out.printf("%c\n%c  %c", ch, ch1, ch2);
	}
}
