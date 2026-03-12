package accessModifier01;
//5-2번 : 접근제한자(필드 확인 위한 클래스)
public class FiledTest {
	//필드
	public int publicField = 10;		//어디서든 접근 가능
	protected int protectedField = 20;  //같은 패키지 + 다른패키지(상속받은 자식클래스)
	int defaultField = 30;				//같은 패키지
	private int privateField = 40;		//같은 클래스
	
	//getter, setter
	//매개변수x 리턴값o => 필드 값을 반환하는 메소드
	//getter는 get + 필드명	반환값이 있다
	public int getPrivateField() {
		return privateField;
	}
	//매개변수o, 리턴값x => 필드에 값을 저장하는 메소드
	//setter는 set + 필드명(자료형 매개변수){
	//		필드 값을 저장
	//}
	public void setPrivateField(int privateField) {
		this.privateField = privateField;
	}
	
	
	
}
