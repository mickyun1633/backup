package staticTest;

//3-1번 : 정적 변수와 정적 메소드
public class MyClassA {
	// 필드(인스턴스 변수, 스태틱 변수, 상수)
	// 인스턴스 변수
	int instanceVar;
	// 스태틱 변수
	static int staticVar;

	// 생성자 => 컴파일러가 기본 생성자를 만든다

	// 메소드(인스턴스 메소드, 스태틱 메소드)
	// 인스턴스 메소드1
	void instanceMethod1() {
		System.out.println("인스턴스 메소드1 호출되었습니다");
		this.instanceVar = this.instanceVar;
		System.out.println("인스턴스 메소드1에서의 인스턴스 변수 값 : " + this.instanceVar);
		staticVar = 100;
		System.out.println("인스턴스 메소드1에서의 스태틱 변수 값 : " + staticVar);
		this.instanceMethod2();
		staticMethod1();
	}

	// 인스턴스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드2 호출되었습니다");
	}

	// 스태틱 메소드1
	static void staticMethod1() {
		System.out.println("스태틱 메소드1 호출되었습니다");
//		instanceMethod1(); //스태틱 메소드에서 인스턴스 메소드 호출 불가
//		this.instanceVar = 10; //스태틱 메소드에서 인스턴스 변수 접근불가
		staticVar = 1000;
		System.out.println("스태틱 메소드1에서 스태틱 변수 값 : " + staticVar);
		staticMethod2();
	}

	// 스태틱 메소드2
	static void staticMethod2() {
		System.out.println("스태틱 메소드2 호출되었습니다");
	}

}
