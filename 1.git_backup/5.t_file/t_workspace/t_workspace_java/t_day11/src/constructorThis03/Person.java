package constructorThis03;

//5번 : this() 자기자신의 생성자 호출
public class Person {
	// 필드
	String name;
	int age;
	String job;

	// 생성자
	// 기본생성자
	public Person() {
		this.age = 21;
		this.job = "학생";
	}

	// 이름을 매개변수로 받는 생성자
	public Person(String name) {
		this();
		this.name = name;
	}

	// 이름과 나이를 매개변수로 받는 생성자
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

	// 이름과 직업을 매개변수로 받는 생성자
	public Person(String name, String job) {
		this(name);
		this.job = job;
	}

	// 이름과 나이와 직업을 매개변수로 받는 생성자
	public Person(String name, int age, String job) {
		this(name, age);
		this.job = job;
	}

	// 메소드
	// greet 000님 안녕하세요를 출력하는 메소드
	String greet() {
		String name = "짱구";
		System.out.println(this.name + "님 안녕하세요");
		System.out.println(name + "님 안녕하세요");
		return this.name + "의 나이는 " + this.age;
	}

	void printInfo() {
		System.out.printf("객체 참조값 : %s\n", this);
		System.out.printf("이름 : %s\n", this.name);
		System.out.printf("나이 : %d\n", this.age);
		System.out.printf("직업 : %s\n", this.job);
		System.out.println("=======================");
	}
}










