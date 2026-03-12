package review;
//1 : 가변길이 매개변수
public class TestA {
	public static void main(String[] args) {
		
		TestA t = new TestA();
		System.out.println(t);
		t.method1(10);
//		t.method1(10, 20);
		t.method2(10);
		t.method2(10, 20);
	}
	
	//필드
	int num;


//	public TestA() {
//		super();
//	}
//
//	public TestA(int num) {
//		super();
//		this.num = num;
//	}

	void method1(int num) {
		System.out.println(num);
	} 
	
	void method2(int ... num) {
		System.out.println(num); 
		for(int i : num) {
			System.out.println(i);
		}
	}
}
