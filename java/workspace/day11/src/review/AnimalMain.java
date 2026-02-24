package review;
//복습 

class Animal {
	//필드
	String name;		//동물이름
	int age;			//동물나이
	String species; 	//동물의 종
	
	//메소드
	void sleep() {
		System.out.println(this.name + "이/가 잠을 잡니다");
	}
	
	
	
	
	
	
}
public class AnimalMain {
	public static void main(String[] args) {
		Animal dog = new Animal();
		System.out.println(dog.name);
	}
}
