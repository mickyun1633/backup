package accessModifier01;
//5번 : 접근제한자(생성자 확인 위한 클래스)
public class Constructor {
	//기본 생성자 => public
	public Constructor() {
		// 어디서든 객체 생성 가능
	}
	
	protected Constructor(int num) {
		// 같은 패키지 + 자식 클래스에서 객체 생성 가능
	}
	
	Constructor(String data){
		// 같은 패키지에서만 객체 생성 가능
	}
	
	private Constructor(boolean isTrue) {
		// 같은 클래스 내부에서만 가능
	}
}
