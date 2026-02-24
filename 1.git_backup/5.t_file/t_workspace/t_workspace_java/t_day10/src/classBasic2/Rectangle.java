package classBasic2;
//12-1 : 클래스의 특징2(연관성 있는 데이터와 기능을 한 곳에 통합)
public class Rectangle {
	//직사각형 정보와 관련된 기능
	//필드
	int width; //너비
	int height; //높이
	
	//메소드
	//넓이를 계산하는 메소드 정의(매개변수 x, 리턴값 o)
	int getArea() {
		return width * height;
	}
	
	//둘레를 계산하는 메소드 정의(매개변수 x, 리턴값 x)
	void getPerimeter() {
		System.out.println((width + height) * 2);
	}
	
}
