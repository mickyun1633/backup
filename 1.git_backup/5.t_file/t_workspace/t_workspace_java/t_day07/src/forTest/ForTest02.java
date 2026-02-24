package forTest;

//2번 : 반복문 - for문 기초2
public class ForTest02 {
	public static void main(String[] args) {

//		//for (초기식; 조건식; 증감식) {}
//		for(int i = 5; i > 0; i--) {
//			System.out.println(i);
//		}
//초기 i의 값 0		
//	현재 i의 값	조건식 i < 3	조건식결과		실행문여부		증감식i++
//	10			0 < 3		true		0	출력		10-- => 9		첫번째 반복
//	9			1 < 3		true		1	출력		1++			두번째 반복
//	2			2 < 3		true		2	출력		2++			세번째 반복
//  3			3 < 3		false

//		//for (초기식; 조건식; 증감식) {}
		// 초기식 값을 0으로 시작
		// 조건식 10보다 작을 동안 반복
		// 증감식 1씩 증가

		// [출력결과]
		// 1번째 홍길동
		// 2번째 홍길동
		// ...
		// 10번째 홍길동
//		for(int i = 0; i < 10; i++) {
//			System.out.println((i+1) + "번째 홍길동");
//		}

		// 아래 출력결과처럼 만들기
		// [출력결과]
		// 10번째
		// 9번째
		// 8번째
		// ...
		// 1번째

		// 초기식 int i = 10
		// 조건식 i > 0
		// 증감식 i--
		// 출력 i + "번째"

		for (int i = 10; i > 0; i--) {
			System.out.println(i + "번째");
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(10 - i + "번째");
		}
//	반복횟수	현재 i의 값	조건식	결과		실행문			증감식	
//	1번째		i = 0		0 < 10	true	10 - i +"번째"	0++	=> 1
// 	2번째		i = 1		1 < 10 	true	10 - i +"번째"	1++ => 2

		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
		// 1부터 10까지의 합 구하기(for문 x) => 55
		int total = 1;
		System.out.println(total);
		total = total + 2;
		System.out.println(total);
		total = total + 3;
		System.out.println(total);
		total = total + 4;
		System.out.println(total);
		total = total + 5;
		System.out.println(total);
		total = total + 6;
		System.out.println(total);
		total = total + 7;
		System.out.println(total);
		total = total + 8;
		System.out.println(total);
		total = total + 9;
		System.out.println(total);
		total = total + 10;
		System.out.println(total);

		System.out.println(total);
		// 현재 total +1 합산한 total
		// 1 2

		// 1부터 10까지의 합 구하기(for문)
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
////			System.out.println(i);
//			sum += i; // sum = sum + i;
//			// = 0 + 1
//			System.out.println("총합 : " + sum);
//		}
		// System.out.println(i);
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			sum += i;
		}
//		System.out.println(i);
		System.out.println(sum);

	}
}
