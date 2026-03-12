package accessModifier04;

public class SuperCar extends Car{
	//생성자
	public SuperCar(String brand) {
		super(brand); //부모 생성자 호출
	}
	//새로운 기능 추가
	public void turbo() {
//		this.brand = "A"; 
//		final 필드는 한 번 초기화되면 변경 불가
//		
		System.out.println("터보모드 ON");
	}
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
//		super.speedUp();
		System.out.println("supercar 속도 올립니다");
	}
	
// final 메소드는 상속은 되지만 재정의(오버라이딩) 불가!!	
//	@Override
//	public final void start() {
//		System.out.println(this.brand + " 차가 출발합니다");
//	}
	


}
