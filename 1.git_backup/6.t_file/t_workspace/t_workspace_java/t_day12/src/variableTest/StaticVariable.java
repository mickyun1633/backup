package variableTest;
//8번 : 정적 변수
public class StaticVariable {
	//정적 변수 선언
	static int staticVar;
	
	public static void main(String[] args) {
		StaticVariable.staticVar = 100;
		System.out.println(StaticVariable.staticVar);
	}
}
