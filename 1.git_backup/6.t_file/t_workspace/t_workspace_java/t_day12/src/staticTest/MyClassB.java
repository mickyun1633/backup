package staticTest;

//3-2 : 정적변수와 정적 메소드 Main 클래스(호출할 클래스)
public class MyClassB {
	public static void main(String[] args) {

		// 1. 인스턴스 변수 출력 => 객체 생성 필수
		MyClassA a = new MyClassA();
//		System.out.println(a); // 참조값
//		System.out.println(a.instanceVar); // 0
//		a.instanceVar = 10;
//		System.out.println(a.instanceVar); // 10

		MyClassA aa = new MyClassA();
//		System.out.println(aa);
//		System.out.println(aa.instanceVar); // 0
//		System.out.println(a.instanceVar); // 10

		// 2. 정적 변수 출력 => 객체 생성으로 접근 가능하지만 권장하지 않음
		// 클래스명.정적변수명으로 접근한다!! => 공통된 저장공간을 사용한다
//		a.staticVar = 20;
//		System.out.println(a.staticVar); //20
//		aa.staticVar = 200;
//		System.out.println(aa.staticVar); //200
//		System.out.println(a.staticVar);
		MyClassA.staticVar = 100;
//		System.out.println(MyClassA.staticVar);

		// 3. 다른 클래스에서 인스턴스 메소드 호출
		a.instanceMethod1();
//		aa.instanceMethod2();
//		a.staticMethod1();
//		a.staticMethod2();

		// 4. 다른 클래스에서 스태틱 메소드 호출
//		MyClassA.staticMethod1();
//		MyClassA.staticMethod2();
//		MyClassA.instanceMethod1(); 인스턴스 메소드는 객체 생성이 필요함 
		// 객체명.메소드명으로 호출가능

	}
}
