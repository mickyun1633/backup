package accessModifier01;

//5-3번 : 필드 접근제한자 확인
//5-4번 : 생성자 접근제한자 확인
//5-5번 : 메소드 접근제한자 확인
// 같은 패키지의 다른 클래스
public class AccessTest {
	public static void main(String[] args) {
		// 필드 접근제한자 확인
//		FiledTest f = new FiledTest();
//		System.out.println(f.publicField);
//		System.out.println(f.protectedField);
//		System.out.println(f.defaultField);
////		System.out.println(f.privateField); 
//		//다른 클래스에서 접근 불가능한 접근제한자 사용

		// 생성자 접근 제한자 확인
//		Constructor c1 = new Constructor();
//		System.out.println(c1);
//		Constructor c2 = new Constructor(10);
//		System.out.println(c2);
//		Constructor c3 = new Constructor("data");
//		System.out.println(c3);
////		Constructor c4 = new Constructor(true);
////		System.out.println(c4);
//		//private 접근제한자가 붙은 것은 같은 클래스 내부에서만 가능

		// 메소드 접근 제한자 확인
		MethodTest m = new MethodTest();
		m.publicMethod();
		m.protectedMethod();
		m.defaultMethod();
//		m.privateMethod(); //같은 클래스가 아니므로 접근 불가

	}
}
