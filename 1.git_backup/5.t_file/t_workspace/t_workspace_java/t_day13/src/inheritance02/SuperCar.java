package inheritance02;

//2번 : 상속관계 - 생성자 확인
public class SuperCar extends Car {
	// 필드
	boolean booster;

	// 생성자
	public SuperCar(String brand, String color, int price, boolean booster) {
		super(brand, color, price);
		this.booster = booster;
	}

	public SuperCar(int price, boolean booster) {
		super("KIA", "red", price); // 부모 생성자
		this.booster = booster;
	}

	// 메소드
	void boosterOn() {
//		super.enginStart();
		System.out.println(this.brand + " 부스터 가동");
	}

	void boosterOff() {
		System.out.println(this.brand + " 부스터 중지");
//		super.enginStop();
	}

	@Override
	void enginStart() {
		super.enginStart();
//		System.out.println(this);
		System.out.println(this.brand + "의 시동이 자동으로 켜집니다");

	}

}
