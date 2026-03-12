package variableTest;
//5번 : 지역변수
public class LocalVariable {
	public static void main(String[] args) {
		LocalVariable l = new LocalVariable();
		l.myMethod();
//		System.out.println(localVar);
		int number = 1;
	}
		
	void myMethod() {
		//지역변수 선언
		int localVar = 10;
		System.out.println("지역변수 localVar : " + localVar);
//		System.out.println(number);
		
	}
}
