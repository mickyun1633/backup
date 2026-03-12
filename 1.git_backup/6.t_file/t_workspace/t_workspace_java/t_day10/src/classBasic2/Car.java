package classBasic2;

//13-1 : 클래스의 특징3(객체 생성의 틀)
public class Car {

	// 바퀴, 제조사, 핸들, 종류, 속도, 모델명, 엔진, ...
	// 필드
	String model; // 모델명(제조사)
	String color; // 색상
	int speed; // 속도

	// 메소드(행동, 행위, 기능)
	// 속도 증가시키는 메소드(매개변수 o, 리턴값 x 메소드 정의 => 객체.메소드명(인수);
	void accelerate(int value) {
		speed += value;
		System.out.println("현재 속도 : " + speed);
	}

	// 주행 멈추는 메소드(매개변수 x, 리턴값 x 메소드 정의 => 객체명.메소드명();)
	void stop() {
		speed = 0;
		System.out.println("주행을 멈춥니다. 속도 : " + speed);
	}

	// 속도 감소시키는 메소드(매개변수 x, 리턴값 x 메소드 정의 => 객체명.메소드명();)
	// 속도 감소시키는 메소드를 한 번 호출 시 마다 -5진행
	void decrease() {
		speed -= 5;
		if (speed < 0) {
			speed = 0;
			System.out.println("주행을 멈췄습니다");
		}
	}

}
