package methodOverride;
//3번 : 오버라이딩(서브클래스2)
public class Dog extends Animal{
	//생성자
	public Dog(String name) {
		super(name);
	}

	//메소드 오버라이딩 : alt + shift + s + v
	//@Override : 오버라이딩 의도를 명시하는 어노테이션
	//컴파일러가 확인해줌
	@Override
	void sound() {
		System.out.println(this.name + " 멍멍!!");
	}
	
}
