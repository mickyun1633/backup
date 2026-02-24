package basicTask01;

import java.util.Scanner;

/*문제1 : 한 곡당 300원인 코인 노래방이다.
		사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 출력하는 프로그램 작성하기
			
		[입력 예시]
		금액입력 : 1000

		[출력 예시]
		3곡을 부를 수 있으며 잔돈은 100원입니다 */

public class SingTask01 {
	public static void main(String[] args) {
		 
/*   [사용할 문법]  // add : 빼먹은 내용인데 코드 작성하면서 추가한 내용
 	 입력 스캐너 import, next(), 출력 메소드
     문자열  정수형 변수선언, 나눗셈 연산, 스캐너 해제
 	 add : 나머지 연산 % 
 																		*/
	
/*   [로직 구성]  // add : 빼먹은 내용인데 코드 작성하면서 추가한 내용
	 1) 입력 클래스 import
	 2) 출력메시지 - "금액입력 : "
	 3) 입력 받은 문자열 변수 선언 next()
	 4) 입력받은 문자열 정수형 변수 선언
	 5) 한 곡당 금액 정수형 변수 선언
	 6) add : 잔돈 금액 정수형 변수 선언, 나머지 연산자 % 
	 7) add : 곡 수 정수형 변수 선언, 나눗셈 /
	 8) 출력메소드
	 9) 스캐너 해제	 	 	 	  					  */
	
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액입력 : ");
		String money = sc.next();
		int result = Integer.parseInt(money);
		int price = 300;
		int change = result % price;
		int count = result / price;
		System.out.println(count  + "곡을 부를 수 있으며 잔돈은 " + change + "원입니다");
		sc.close();
		
		
		
		
		
		
		
		
		
	
	
	
	
	}
	
	
}
