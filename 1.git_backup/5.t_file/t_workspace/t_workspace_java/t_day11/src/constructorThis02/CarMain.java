package constructorThis02;

//4번 : this
public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car("BMW");
		System.out.println(car1);
		car1.printInfo();

		Car car2 = new Car(10);
		car2.printInfo();

	}
}

class Car {
	// 필드
	String brand;
	int speed;

	// 생성자 : alt + shift + s , o
	public Car(String brand) {
		this.brand = brand;
		System.out.println("생성자 호출 : " + this);
	}

	// 매개변수의 타입이 다르다 => 생성자 오버로딩
	public Car(int speed) {
		this.speed = speed;
	}

	// 매개변수의 개수가 다르다 => 생성자 오버로딩
	public Car(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	// 매개변수의 순서가 다르다 => 생성자 오버로딩
	public Car(int speed, String brand) {
		this.speed = speed;
		this.brand = brand;
	}

	// 메소드
	void printInfo() {
		System.out.println("모델 : " + this.brand);
		System.out.println("속도 : " + this.speed);
	}
}
