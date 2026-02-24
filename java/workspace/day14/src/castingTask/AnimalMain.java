package castingTask; //day14

public class AnimalMain { //(default) 접근 제한자를 사용한 부코 클래스
	//Animal 부모 클래스 생성
	//println 줄바꿈 출력
	//public 다른 패키지에서도 접근 가능. 리턴 타입 없음
	//cry라는 메소드명
	class Animal {
	    public void cry() {
	        System.out.println("Animal sound");
	    }
	}
	//Animal 부모 클래스 불러오기
	class Cat extends Animal {
	    @Override
	    public void cry() {
	        System.out.println("Meow");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void cry() {
	        System.out.println("Woof");
	    }
	}

	class Mouse extends Animal {
	    @Override
	    public void cry() {
	        System.out.println("Squeak");
	    }
	}

	public class AnimalMain {
	    public static void main(String[] args) {
	        Animal animal = new Animal();
	        Cat cat = new Cat();
	        Dog dog = new Dog();
	        Mouse mouse = new Mouse();

	        printCrying(animal);
	        printCrying(cat);
	        printCrying(dog);
	        printCrying(mouse);
	    }

	    public static void printCrying(Animal animal) {
	        if (animal instanceof Cat) {
	            Cat cat = (Cat) animal;
	            cat.cry();
	        } else if (animal instanceof Dog) {
	            Dog dog = (Dog) animal;
	            dog.cry();
	        } else if (animal instanceof Mouse) {
	            Mouse mouse = (Mouse) animal;
	            mouse.cry();
	        } else {
	            animal.cry();
	        }
	    }
	}

}
