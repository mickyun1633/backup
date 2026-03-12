package scanner;

import java.util.Scanner;

// 5번 : 입력 메소드 활용
public class ScannerTest03 {
	public static void main(String[] args) {
		// 이름을 입력해주세요 : 000
		// 000님 안녕하세요
		// 000님 안녕히가세요
		
		//로직구성
		//1) 입력 클래스 import
		Scanner sc = new Scanner(System.in);
		//2) 입력 메시지 출력메소드(print)
		System.out.print("이름을 입력해주세요 : ");
		//3) 문자열 변수  = 입력메소드 next(), nextLine()
		String name = sc.nextLine();
		//4) 출력
		System.out.printf("%s님 안녕하세요\n%s님 안녕히가세요", name, name);
		//5) sc.close() 입력클래스 해제
		sc.close();
		
	}
}
