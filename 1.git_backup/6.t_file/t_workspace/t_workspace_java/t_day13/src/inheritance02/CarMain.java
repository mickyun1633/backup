package inheritance02;
//2번 : 상속관계 - 생성자 확인
public class CarMain {
	public static void main(String[] args) {
		//부모 클래스의 객체 생성
//		Car c1 = new Car();
		Car c1 = new Car("BMW", "black", 1000000);
		System.out.println(c1);
		
		//자식 클래스의 객체 생성
		SuperCar kia = new SuperCar("KIA2", "white", 1500000, false);
		System.out.println(kia);
		SuperCar s = new SuperCar(5000000, true);
		System.out.println(s);
		System.out.println(s.brand);
		System.out.println(s.color);
		
		kia.boosterOn();
		kia.enginStart();
		c1.enginStart();
	}
}
