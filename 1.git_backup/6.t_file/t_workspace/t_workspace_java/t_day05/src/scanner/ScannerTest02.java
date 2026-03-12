package scanner;

import java.util.Scanner;

//4번 : next()와 nextLine() 차이
public class ScannerTest02 { // 클래스 시작 중괄호
	public static void main(String[] args) { // main메소드 시작 중괄호

		// 입력클래스 + import
		Scanner sc = new Scanner(System.in);
//		sc.next();
//		sc.next();
//		sc.next();

//		sc.nextLine();
//		sc.nextLine();
//		sc.nextLine();

		System.out.println("이름 입력 : "); // 김 영선
		String name1 = sc.next();
		System.out.println(name1);
		String name2 = sc.nextLine();
		System.out.println(name2);

	} // main메소드 끝 중괄호
} // 클래스 끝 중괄호
