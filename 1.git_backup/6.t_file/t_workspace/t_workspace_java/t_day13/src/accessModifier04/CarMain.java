package accessModifier04;

public class CarMain {
	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car("KIA");
		
		//브랜드와 현재 속도 확인
		System.out.println("브랜드 : " + car.getBrand());
		System.out.println("현재 속도 : " + car.getSpeed());
		car.start();
		car.speedUp();
		car.speedUp();
		
		Car.stop();
		
		SuperCar s = new SuperCar("현대");
		System.out.println(s.getBrand());
		System.out.println(s.getSpeed());
		s.speedUp();
	}
}
