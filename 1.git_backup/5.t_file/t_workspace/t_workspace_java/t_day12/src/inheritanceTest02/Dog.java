package inheritanceTest02;
//14번 : 상속기초2
public class Dog extends Animal{
	
	//강아지 고유 메소드
	void speek() {
		System.out.println(this.age + "살의 " + this.name +
				"이/가 멍멍하고 웁니다");
	}
	
	
}
