package inheritanceTest02;

//14번 : 상속 기초2
public class AnimalMain {
	public static void main(String[] args) {

		// 슈퍼클래스 Animal 클래스의 객체 생성
		Animal animal = new Animal();
		System.out.println(animal);
		// inheritanceTest02.Animal@5305068a

		// Animal 클래스에 있는 필드와 메소드 사용 가능
		animal.name = "사자야";
		System.out.println(animal.name);
		animal.sleep(7, "초원");
//		animal.speek();
//		부모클래스의 객체는 자식클래스에서 만들어진 멤버를 사용할 수 없다
		
		// 서브클래스 Dog클래스의 객체 생성
		Dog dog = new Dog();
		System.out.println(dog);
		// inheritanceTest02.Dog@119d7047
		dog.name = "달이";
		dog.eat("간식");
		// 부모클래스의 멤버는 자식 클래스의 객체가 사용가능하다
		// 상속받았기 때문
		dog.speek();

		// 서브클래스 Cat클래스의 객체 생성
		Cat cat = new Cat();
		System.out.println(cat);
		// inheritanceTest02.Cat@7699a589
		cat.name = "별이";
		cat.age = 5;
		cat.eat("츄르");
//		cat.speek();
		cat.meow();

	}
}
