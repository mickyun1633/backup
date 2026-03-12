package methodOverride;
//3번 : 오버라이딩(메인 클래스)
public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("동물");
		System.out.println(animal);
		animal.sound();
		
		Cat cat = new Cat("별이");
		System.out.println(cat);
		cat.sound();
		
		Dog dog = new Dog("달이");
		System.out.println(dog);
		dog.sound();
	}
}
