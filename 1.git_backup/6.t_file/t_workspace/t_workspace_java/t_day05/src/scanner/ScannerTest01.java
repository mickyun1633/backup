package scanner;

import java.util.Scanner;

//3번 : 입력 클래스(Scanner)
public class ScannerTest01 { // 클래스 중괄호 시작
	public static void main(String[] args) { //main 메소드 중괄호 시작
//		System.out.println(); //출력하는 기능 => 출력메소드
//		String name = "김영선";
		//자료형 변수명 대입연산자 값;
		
		//입력 클래스 + import
		//자동 import 단축키 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
//		String name1 = sc.next();
		//입력메소드 : 입력을 받고 입력받은 값을 String 타입으로 가져오는 기능을 한다
//		System.out.println(name1 + "님 환영합니다!");
		String name2 = sc.nextLine();
		System.out.println(name2 + "님 환영합니다!");
		
	} //main 메소드 중괄호 끝
} //클래스 중괄호 끝
