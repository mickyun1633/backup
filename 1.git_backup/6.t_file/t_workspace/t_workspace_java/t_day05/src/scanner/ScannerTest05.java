package scanner;

import java.util.Scanner;

//7번 : next(), nextInt(), nextDouble(), nextLine()
public class ScannerTest05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String msg1 = "좋아하는 숫자 : ", msg2 = "좋아하는 동물 : ", animal = "";
		int number = 0;

		System.out.println(msg1);
		number = sc.nextInt();
		sc.nextLine(); // 버퍼비우기
		System.out.println(msg2);
		animal = sc.nextLine();

		System.out.println("내가 좋아하는 숫자는 " + number + "이고, " 
		+ "내가 좋아하는 동물은 " + animal + "이다.");
		sc.close();

	}

}











