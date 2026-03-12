package methodOverride;
//3번 : 오버라이딩(서브클래스1)
public class Cat extends Animal{
	//생성자
	public Cat(String name) {
		super(name);
	}

	@Override
	void sound() {
		//부모의 sound() 메소드 호출
		super.sound();
		System.out.println("야옹~");
	}

}
