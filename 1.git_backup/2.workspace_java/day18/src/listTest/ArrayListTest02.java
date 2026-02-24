package listTest;
// 2번 : 제네릭이 필요한 이유
// 제네릭 클래스를 사용해서 하나의 클래스로 여러 타입(Integer, String, ..)을 타입 안정성있게 처리할 수 있다
class MyClass<T> {
// MyClass는 제네릭 클래스로 선언(MyClass는 아직 타입이 정해지지 않았고 나중에 T자리에 실제 타입을 넣겠다)
// T (Type) 관례
	
	// field
	T data;	//data 타입은 아직 모름(나중에 정해짐)
	
	// 생성자
	public MyClass(T data) {	// T 사용가능 => 나중에 들어오는 타입 그대로 받음
		super();
		this.data = data;
	}
	// method
	void printData() {
		System.out.println(this.data);
	}
}
public class ArrayListTest02 {
		public static void main(String[] args) {
		// 첫번째 MyClass의 객체
		MyClass<Integer> mc1 = new MyClass<>(1);
		// T => Integer로 결정했다
		// data는 Integer 전용
		System.out.println(mc1);
		mc1.printData();
		
		// 두번째 MyClass의 객체
		MyClass<String> mc2 = new MyClass<>("문자열");
		// T => String으로 결정했다
		
			
		}
}
