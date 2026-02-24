package accessModifier02;

import accessModifier01.Constructor;
import accessModifier01.FiledTest;
import accessModifier01.MethodTest;
//다른 패키지에 있는 클래스의 객체 생성이므로 import 받아와야한다

//5-3번 : 필드 접근제한자 확인 위한 다른패키지의 클래스
//5-4번 : 생성자 접근제한자 확인 위한 다른패키지의 클래스
//5-5번 : 메소드 접근제한자 확인
//다른 패키지의 다른 클래스(상속x)
public class AccessTest01 {
	public static void main(String[] args) {
		// 필드 접근제한자 확인 => public만 가능
		FiledTest f = new FiledTest();
		System.out.println(f.publicField);
//		System.out.println(f.protectedField); //다른패키지, 상속x 접근불가
//		System.out.println(f.defaultField); //다른 패키지 접근 불가
//		System.out.println(f.privateField); //다른 클래스 접근 불가
		System.out.println(f.getPrivateField()); //40
		f.setPrivateField(100);
		System.out.println(f.getPrivateField()); //100
		

		// 생성자 접근 제한자 확인 => public만 가능
		Constructor c1 = new Constructor();
		System.out.println(c1);
//		Constructor c2 = new Constructor(10);
//		System.out.println(c2);
//		Constructor c3 = new Constructor("data");
//		System.out.println(c3);
//		Constructor c4 = new Constructor(true);
//		System.out.println(c4);
		// private 접근제한자가 붙은 것은 같은 클래스 내부에서만 가능

		// 메소드 접근제한자 확인 => public만 가능
		MethodTest m = new MethodTest();
		m.publicMethod();
//		m.protectedMethod(); //다른 패키지인데 상속x
//		m.defaultMethod();	//같은 패키지에서만 가능
//		m.privateMethod(); //같은 클래스에서만 가능
		

	}
}
















