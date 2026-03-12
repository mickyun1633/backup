package classBasic2;
//12-2번 : 클래스의 특징2(연관성 있는 데이터와 기능을 한 곳에 통합)
//Rectangle 클래스 main
public class RectangleMain {
	public static void main(String[] args) {
		
		//객체화(인스턴스화)
		Rectangle r1 = new Rectangle();
		System.out.println(r1); //classBasic2.Rectangle@5305068a
		
		//객체명.필드명 = 값;
		r1.width = 10;
		r1.height = 20;
		
		//매개변수x 리턴값o 넓이구하는 메소드 호출
		//syso(객체명.메소드명());
		System.out.println(r1.getArea());
		
		//매개변수x 리턴값x 둘레구하는 메소드 호출
		//객체명.메소드명();
		r1.getPerimeter();
		
	}
}
