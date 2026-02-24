package accessModifier01;
//5-5번 : method 확인하기위한 클래스
public class MethodTest {
	//필드
	//생성자
	//메소드
	public void publicMethod() {
		System.out.println("public 메소드 호출");
	}
	
	protected void protectedMethod() {
		System.out.println("protected 메소드 호출");
	}
	
	void defaultMethod() {
		System.out.println("default 메소드 호출");
	}
	
	private void privateMethod() {
		System.out.println("private 메소드 호출");
	}
	
	public static void main(String[] args) {
		MethodTest m = new MethodTest();
		m.publicMethod();
		m.defaultMethod();
		m.protectedMethod();
		m.privateMethod();
		//같은 클래스 내부에서는 전부 사용 가능
	}
}
