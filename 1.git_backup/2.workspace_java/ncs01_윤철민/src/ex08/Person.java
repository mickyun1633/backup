package ex08;
// 8번 윤철민
/*	필드 : String name
	생성자 : 이름을 매개변수로 받아 초기화
	메소드 : getName() - 이름 반환					*/

public class Person {
	//필드
	private String name;
	//생성자
	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
