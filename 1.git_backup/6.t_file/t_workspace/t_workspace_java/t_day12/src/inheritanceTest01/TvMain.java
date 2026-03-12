package inheritanceTest01;

//13번 : 상속기초(Tv클래스의 객체와 Tv2 클래스 객체 생성할 Main 클래스)
public class TvMain {
	public static void main(String[] args) {

		Tv sTv = new Tv();
		sTv.ch = 10;
		sTv.vol = 5;
		sTv.power = true;

		System.out.println(sTv);

		Tv2 lTv = new Tv2();
		System.out.println(lTv);

		lTv.ch = 5;
		lTv.vol = 10;
		lTv.power = true;

		sTv.powerOnOff();
//		sTv.netflex();
//		netflex() 메소드는 Tv2 자식 클래스에서 추가된 멤버이므로
//		부모 클래스의 객체로는 접근이 불가능하다
		lTv.powerOnOff();
		lTv.netflex();

	}
}
