package print;

// 7번 : 자료형 & 변수 & 상수 & 제어문자 & 출력메소드 실습문제
public class PrintTask01 {
	public static void main(String[] args) {
		// 문제1. println()을 한번만 사용해서 아래와 같이 출력하기
//		이름 : 홍길동
//		나이 : 20
//		키 : 170.5
		System.out.println("이름 : 홍길동\n" + "나이 : 20\n" + "키 : 170.5");
		System.out.println("이름 : 홍길동\n나이 : 20\n키 : 170.5");
		

		// 문제2. print()을 3번 사용해서 한 줄로 출력하기
//		이름 : 홍길동 나이 : 20 키 : 170.5
		System.out.print("이름 : 홍길동 ");
		System.out.print("나이 : 20 ");
		System.out.print("키 : 170.5");
		System.out.println();

		// 문제3. print()와 제어문자를 사용하여 아래와 같이 출력하기
//		이름		나이		지역
//		홍길동	20		서울
		System.out.print("이름\t나이\t지역\n");
		System.out.print("홍길동\t20\t서울\n");
		
		
		// 문제4. 다음 조건에 맞게 변수를 선언하고 값을 저장한 후 출력하기
//		이름 userName		=> 본인이름
//		나이 userAge		=> 본인나이
//		학생여부 isStudent => true
//		학점	userGrade	=> A
//		키	userHeight	=> 130.52
		String userName = "김영선";
		int userAge = 20;
		boolean isStudent = false;
		char userGrade = 'A';
		double userHeight = 130.52;

//		println(), printf() 두가지 모두 사용하여 각각 출력하기
//		출력형식
//		이름은 000이고 나이는 0살입니다
//		학생여부는 true이고 학점은 A학점입니다
		System.out.println("이름은 " + userName + "이고 나이는 " + userAge + "살입니다.");
		System.out.println("학생여부는 " + isStudent + "이고 학점은 " + userGrade + "학점입니다.");
		System.out.printf("이름은 %s이고 나이는 %d살입니다."
				+ "\n학생여부는 %b이고 학점은 %c학점입니다.", userName, userAge, isStudent, userGrade);
		
	}
}
