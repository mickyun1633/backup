package task;

public class Product {
//	/Product 클래스
	// 필드
	// 문자열 상품명
	// 정수형 가격
	String name;
	int price;

	// 생성자
	// 모든 필드의 값을 받는 생성자 1개
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 메소드
	// 인스턴스메소드 printInfo
	// 매개변수x 리턴값x
	// 필드의 값 출력 예시 => 000의 가격은 000원입니다
	void printInfo() {
		System.out.println(this.name + "의 가격은 " + this.price + "입니다");
	}

}
