package review;
//복습

class Animal {
	// 필드
	String name; // 동물이름
	int age; // 동물나이
	String species; // 동물의 종

	// 메소드
	// 동물이름 + 잠을 잡니다를 출력하는 메소드(매개변수x, 리턴값x)
	void sleep() {
		System.out.println(this.name + "이/가 잠을 잡니다");
	}

	// 동물이름 + 00을 먹습니다 출력하는 메소드(매개변수 o, 리턴값 x)
	void eat(String name) {
		System.out.println(this.name + "이/가 " + name + "을/를 먹습니다");
	}

	// 동물이름 + 00으로 산책을 갑니다(매개변수 o, 리턴값 x)
	void walk(String place) {
		System.out.println(this.name + "이/가 " + place + "으로 산책을 갑니다");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Animal dog = new Animal();
		System.out.println(dog.name);
		// 필드에 값 넣기
		dog.name = "멍멍이";
		dog.age = 1;
		dog.species = "시츄";
		System.out.println(dog.name);
		// 메소드 호출해보기
		dog.sleep();
		dog.eat("개껌");

		dog.walk("한강");
	}
}
