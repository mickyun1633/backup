package ex08;
// 8번 윤철민
/*	Person 클래스를 상속받을 것
	ScoreCalculable 인터페이스를 구현할 것		
	필드 : 
	int javaScore
	int dbmsScore
	int htmlScore
	Major major (선택 사항 적용 시 String 사용 가능)
 	생성자 : 
	이름, 전공, 세 과목 점수를 매개변수로 받아 초기화
	부모 클래스의 생성자를 반드시 호출할 것
	메소드 : 
	인터페이스에 정의된 총점 및 평균 계산 메소드 구현
	getMajor() - 전공 반환						*/

public class Student extends Person{
	//필드
	private int javaScore;
	private int dbmsScore;
	private int htmlScore;
	private String major;
	//생성자
	public Student(int javaScore, int dbmsScore, int htmlScore, String major) {
		super();
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major;
	}
	
	

}
