package Lambda;	//01.21 윤철민
/*	1. 아래의 인터페이스를 구현하여 이름을 전달받아 “000님 환영합니다”를
	출력하는 람다식 객체를 생성하는 코드 작성하시오		
	@FunctionalInterface
	interface Greeting {
		void sayHello(String name);					
	}											*/

public class Ex01 {
	public static void main(String[] args) {
		//익명 클래스로 객체 생성
		Greeting gr = new Greeting() {
			
			//오버라이드 
			@Override
			public void sayHello(String name) {
				System.out.println(name + "님 환영합니다.");
			}

		};
		gr.sayHello("홍길동");
	}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
