package task;
//성적관리 프로그램

//enum Grade : 학생 성적 상태를 나타내는 열거형
//	학점 A B C D F

enum Grade {
	// 필드
	A, B, C, D, F;

	// 메소드 합격 여부 판단
	boolean isPass() {
		return this != F;
	}
}

//점수 int[]를 성적 Grade[]로 변환하는 클래스
//객체를 만들지 않고 사용 => 유틸리티 클래스
//모든 멤버가 static
public class GradeUtil {

	// 성적 기준의 정적 배열
	static int[] SCORE = { 90, 80, 70, 60, 0 };
	// 90점이상 A
	// 80점이상 B
	// 70점이상 C
	// 60점이상 D
	// 0점이상 F
	static Grade[] GRADE = { Grade.A, Grade.B, Grade.C, Grade.D, Grade.F };

	// 점수배열을 성적 배열로 변환하는 기능 정적 메소드 => 클래스명.메소드명
	// 리턴타입 메소드명(자료형 매개변수){}
	// static 리턴타입 메소드명(자료형 매개변수){}

	static Grade[] grades(int[] scores) // 선언부
	{ // grades 메소드 시작 중괄호 (구현부)

		// enum 타입의 참조변수 = Grade enum 배열 생성
		// 5칸짜리 배열 생성 Grade[] g 참조변수에 시작주소값을 대입
		Grade[] g = new Grade[scores.length];
		// 입력한 점수만큼 성적배열 생성
		// 점수1개 - 성적1개 매칭

		for (int i = 0; i < scores.length; i++) {
			// 각 학생의 점수를 하나씩 처리하기 위한 바깥 for문
			// i => 0 ~ ? => scores[i]; 현재 처리중인 점수
			for (int j = 0; j < SCORE.length; j++) {
				// j => 0 ~ 4
				// 현재 점수를 성적 기준과 비교, 가장 높은 점수 기준부터 순서대로 검사
				if (scores[i] >= SCORE[j]) {
//					socres[i] == 79;

					g[i] = GRADE[j];
					break;
				}
			}
		}

		return g;
	}

	// GradeUtil 클래스
	// static 메소드만 정의하며 점수배열을 성적(enum) 배열로 변환하는 기능

	// 구현 조건
	// Grade enum에서는 논리형 타입의 isPass() 인스턴스 메소드 구현
	// GradeUtil 클래스에서는 정적 배열 반드시 구현
	// GradeTest 점수배열을 생성, enum배열변환, 합격자 수 출력

	// GradeTest 실행 클래스

	// 점수배열 int[]
	// GradeUtil 클래스를 이용해 Grade[]로 변환
	// 합격자 수 체크

}
