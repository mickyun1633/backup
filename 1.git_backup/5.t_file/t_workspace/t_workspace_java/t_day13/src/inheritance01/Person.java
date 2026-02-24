package inheritance01;
//1번 : this, this(), super, super()
public class Person {
	//필드
	String name;
	int age;
	
	//기본생성자
	public Person() {
		super();
		System.out.println("Person 기본생성자 호출");
	}
	
	//매개변수 2개있는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person 매개변수 생성자 호출");
	}
	
	//메소드
	void introduce() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}
}
