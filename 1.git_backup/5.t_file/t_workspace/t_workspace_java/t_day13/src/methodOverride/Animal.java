package methodOverride;
//3번 : 오버라이딩(슈퍼클래스)
public class Animal {
	//필드
	String name;
	
	//생성자
	public Animal(String name) {
		super();
		this.name = name;
	}	
	
	//메소드
	void sound() {
		System.out.println(this.name + "이/가 소리를 냅니다");
	}

	
}
