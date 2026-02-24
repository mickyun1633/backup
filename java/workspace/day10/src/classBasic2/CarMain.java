package classBasic2;
//13-2 : 클래스의 특징3(객체 생성의 틀)
//Car 클래스의 객체 생성할 클래스
public class CarMain {
	public static void main(String[] args) {
		
		
		
		//객체화(인스턴스화)
		Car myCar = new Car();
		
		
		myCar.model = "Tesla Model X";
		myCar.color = "red";
		myCar.speed = 200;
		
		System.out.println("모델명 : " + myCar.model);
		System.out.println("모델명 : " + myCar.color);
		System.out.println("모델명 : " + myCar.speed);
		
		
	     // 매개변수 o, 리턴값 x 메소드 호출 => 객체명.메소드명(인수);
	     myCar.accelerate(50);

	     // 운행중지
	     myCar.stop();

	     myCar.accelerate(10);
	      // 속도 감소
	     myCar.decrease();
		
		
		
		
		
		
	}
}
