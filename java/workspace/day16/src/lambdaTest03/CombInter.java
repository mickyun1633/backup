package lambdaTest03;
/*	2시 40분까지
	인터페이스명 : CombInter(함수형 인터페이스)
	두 문자열을 연결하는 추상 메소드를 만든다(명령문 1줄)
	인 메소드에서 익명 클래스로 객체화
	메인 메소드에서 람다식으로 객체화					*/

@FunctionalInterface
public interface CombInter {
	String combine(String a, String b); //(추상메소드 리턴값 o 매개변수 o)
//	void combine(String a, String b);	//(추상메소드 리턴값 x 매개변수 o)
	// default void add(int num1, int num2) {
//  System.out.println(num1 + num2);
//	}
}

