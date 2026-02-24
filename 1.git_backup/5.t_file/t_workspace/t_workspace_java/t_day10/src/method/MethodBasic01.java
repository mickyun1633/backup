package method;

//1번 : 메소드 사용 이유1(중복된 코드의 제거)
public class MethodBasic01 {
	public static void main(String[] args) {
		// 동일한 작업을 수행하는 코드를 여러번 작성하는 대신 메소드로 정의해두면
		// 코드의 가독성과 효율성이 향상된다

		// 동일한 로직을 여러번 작성
		System.out.println("총합 : " + (5 + 10 * 3));
		System.out.println("총합 : " + (1 + 2 * 1));
		System.out.println("총합 : " + (55 + 40));

		// 매개변수 o, 리턴값 x 메소드 호출 => 객체명.메소드명(인수1, 인수2);
		MethodBasic01 mb = new MethodBasic01();
		mb.printSum(5, 10);
		mb.printSum(10, 10);
		mb.printSum(55, 100);

	}

	// 메소드를 사용한 경우
	// 매개변수 o, 리턴값 x 메소드 정의
	void printSum(int num1, int num2) {
		System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2);
		System.out.println("총합 : " + (num1 + num2));
	}
}
















