package variableTest;

//7번 : 인스턴스 변수
public class InstanceVariable {
	// 필드
	// 인스턴스 변수 선언
	int instanceVar;

	// 메소드
	// 인스턴스 변수의 값 설정 해주는 메소드(매개변수 o, 반환값 x)
	void setInstanceVar(int instanceVar) {
		this.instanceVar = instanceVar;
	}

	// 인스턴스 변수의 값 반환 해주는 메소드(매개변수 x, 반환값 o)
	int getInstanceVar() {
		return this.instanceVar;
	}

	public static void main(String[] args) {
		InstanceVariable i = new InstanceVariable();
		i.instanceVar = 10; // 인스턴스변수에 값 바로 대입
		System.out.println(i.instanceVar);
		i.setInstanceVar(20); // 매개변수를 이용하여 값 대입
//		System.out.println(i.instanceVar);
		System.out.println(i.getInstanceVar());

	}

}
