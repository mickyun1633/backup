package day_34_윤철민;

/* ① Student 클래스 요구사항
필드 : name(String), korean(int), english(int), math(int)
생성자 : 전체 필드 초기화
메서드
getTotal() : 국어 + 영어 + 수학 합계 반환
getAverage() : 평균 반환 (소수점 첫째 자리까지)
getGrade() : 평균 90 이상이면 "우수", 미만이면 "일반" 반환
toString() : 아래 형식으로 출력

이름: 홍길동 | 국어: 90 | 영어: 85 | 수학: 92 | 총점: 267 | 평균: 89.0 | 등급: 일반

예외처리
각 점수가 0 미만이거나 100 초과이면 IllegalArgumentException 발생
메시지 : "점수는 0~100 사이여야 합니다." 									*/

public class Student {

	// 필드 생성
	private String name;
	private int korean;
	private int english;
	private int math;

	// 전체 필드 초기화
	private Student(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;

	}
	
	// 예외처리
	// 각 점수가 0 미만이거나 100 초과이면 IllegalArgumentException 발생
	// 메시지 : "점수는 0~100 사이여야 합니다


	// 국어 + 영어 + 수학 합계 반환
    private int getTotal() {
		return korean + english + math;
	}

	// 평균 반환(소수점 첫째 자리까지)
    private double getAverage() {
		double avg = getTotal() / 3.0;
		return Math.round(avg * 10) / 10.0;
	}

	// 평균 90 이상이면 "우수", 미만이면 "일반" 반환
    private String getGrade() {
		return getAverage() >= 90 ? "우수" : "일반";
	}

	// 아래 형식으로 출력
	// 이름: 홍길동 | 국어: 90 | 영어: 85 | 수학: 92 | 총점: 267 | 평균: 89.0 | 등급: 일반
	@Override
	public String toString() {
		return String.format("이름: %s\n국어: %d\n영어: %d\n수학: %d\n총점: %d\n평균: %.1f\n등급: %s", name, korean, english, math,
				getTotal(), getAverage(), getGrade());

	}

}
