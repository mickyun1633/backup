package task;

public class ProductTest {
	public static void main(String[] args) {

		// ProductTest 실행클래스
		// Product 클래스의 객체 3개 생성
		// Product 배열 사용
		// 가격이 10000원 이상의 상품 출력

//		Product 객체 3개 만들고 Prodouct 배열에 넣은 뒤 가격이 10000원 이상인 상품만 출력

		// Product 객체 3개 생성
		Product p1 = new Product("키보드", 120000);
		Product p2 = new Product("아이패드", 880000);
		Product p3 = new Product("마우스", 9000);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		String[] ar = { "a", "b", "c" };
		System.out.println(ar);

		// Product 배열 사용
		Product[] products = { p1, p2, p3, new Product("핸드폰", 1000000) };
		System.out.println(products);
		for (Product p : products) {
			if (p.price >= 10000) {
				p.printInfo();
			}
		}

	}
}
