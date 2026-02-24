package print;

//6번 : 출력메소드(printf)
public class PrintTest02 {
	public static void main(String[] args) {
		// 변수 선언후 초기화
//		int age = 20;
//		double height = 150.53;
		String name = "홍길동";
//		char grade = 'A';
//		boolean isStudent = true;
//		
//		//이름 : 홍길동
//		//나이 : 20
//		//키 : 150.53
//		//학점 : A
//		//학생여부 : true
//		
//		System.out.println("이름 : " + name); //문자열 연결
//		System.out.println("나이 : " + age);
//		System.out.println("나이 : " + (age + 1));
//		System.out.println("키 : " + height);
//		
//		System.out.printf("이름 : %s\n나이 : %d\n학생여부 : %b\n"
//				+ "키 : %.2f", name, age, isStudent, height);
		// 소수점 둘째자리까지 출력 : %.2f
//		System.out.println(); // \n을 쓴 것과 동일
//		자리수(폭)지정
		int num1 = 10;
		int num2 = 200;
		System.out.printf("%d\n%d", num1, num2);

		System.out.printf("\n%5d\n%5d", num1, num2);
		// %5d => 5칸 확보, 오른쪽 정렬

		System.out.printf("\n%-5.2s\n%-5d", name, num2);

	}
}













