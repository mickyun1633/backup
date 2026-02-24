package accessModifier04;

//7번 : final
public class Car {
	// final : 최종을 의미하는 키워드
	// final 상수 : 최종적인 값 => 값 변경 불가
	// final 클래스 : 최종적인 클래스 => 더 이상 상속 불가(자식(서브)클래스 만들 수 없다)
	// final 메소드 : 최종적인 메소드 => 오버라이딩 불가

	// final 상수(클래스상수)
	public static final int MIN_SPEED = 0;
	public static final int MAX_SPEED = 300;

	// 필드
	// 인스턴스 변수(객체마다 고유한 값을 가진다)
	private final String brand;
	private int speed;

	// final 필드를 초기화 하는 방법 => 선언시, 생성자에서, 초기화 블록
	public Car(String brand) {
		this.brand = brand;
		this.speed = MIN_SPEED;
	}

	// getter, setter : alt + shift + s , r
	public String getBrand() {
		return brand;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// final 메소드 : 브랜드명 차가 출발합니다 출력 메소드
	public final void start() {
		System.out.println(this.brand + " 차가 출발합니다");
	}

	// 인스턴스 메소드 : 속도를 10씩 증가하여 현재속도와 증가된 속도를 출력하는 메소드
	// 매개변수로 값을 설정하지 못하도록 하는 방법(객체 스스로 상태 관리, 외부는 행동만 요청)
	public void speedUp() {
		System.out.println("현재 속도 : " + this.speed);

		if (this.speed + 10 <= MAX_SPEED) {
			this.speed += 10;
		}

		System.out.println("증가 후 속도 : " + this.speed);
	}

	// 외부에서 값 설정을 허용
	// 규칙은 setter에서 강제
//	public void setSpeed(int speed) {
//		if ( speed < MIN_SPEED) {
//			this.speed = speed;
//		}else if(speed > MAX_SPEED) {
//			this.speed = MAX_SPEED;
//		}else {
//			this.speed = speed;
//		}
//	}

	// 정적 메소드 : 차가 멈춥니다 출력 메소드
	public static void stop() {
		System.out.println("차가 멈춥니다");
	}

}
