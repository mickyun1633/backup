package accessModifier02;

import accessModifier01.Constructor;
import accessModifier01.MethodTest;

//5-3번 : 필드 접근제한자 확인 위한 다른패키지의 상속받은 자식 클래스
//5-4번 : 생성자 접근제한자 확인 위한 다른패키지의 상속받은 자식 클래스
//다른 패키지의 다른 클래스(상속O)
public class AccessTest02 extends MethodTest {

	// 다른 패키지에서는 protected 생성자를 new로 직접 호출 불가능
	// 자식 생성자에서 super() 부모의 생성자를 이용하여 호출 가능
//	public AccessTest02(int num) {
//		super(num);
//	}

	public static void main(String[] args) {
		// 필드 접근 제한자 확인 => public, protected 가능
//		FiledTest f = new FiledTest();
//		//부모의 객체로는 protected 접근제한자 필드에 접근 불가능
//		System.out.println(f.publicField);
//		AccessTest02 a = new AccessTest02();
//		//상속받은 자식 클래스의 객체로 protected 접근 제한자 필드에 접근가능
//		System.out.println(a.protectedField);
////		System.out.println(a.defaultField);

		// 생성자 접근 제한자 확인 => public은 슈퍼 클래스 객체로도 접근 가능, proteced는 서브 클래스 객체로만 접근 가능
		// protected 생성자에 접근하려면 생성자에서 super()사용해야한다
//		AccessTest02 aa = new AccessTest02(10);

		Constructor c1 = new Constructor();
		System.out.println(c1);
//		Constructor c2 = new Constructor(10);
//		System.out.println(c2);
//		Constructor c3 = new Constructor("data");
//		System.out.println(c3);
//		Constructor c4 = new Constructor(true);
//		System.out.println(c4);
//		private 접근제한자가 붙은 것은 같은 클래스 내부에서만 가능

		// 메소드 접근 제한자 확인 => 서브클래스 객체로 확인 public, protected 가능
		MethodTest m = new MethodTest();
		AccessTest02 a2 = new AccessTest02();
		m.publicMethod();
//		m.protectedMethod();
		a2.protectedMethod();

	}

}
