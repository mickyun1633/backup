package inheritanceTest02;
//14번 : 상속기초2
public class Cat extends Animal{

	//고양이 고유 메소드
	void meow() {
		System.out.println(this.age + "살의 " + this.name +
				"이/가 야옹하고 웁니다");
	}
}
