package constructorBasic01;

//1번 : 생성자 기초
public class TvMain {
	public static void main(String[] args) {

		Tv tv = new Tv();
		System.out.println(tv); // constructorBasic01.Tv@5305068a

//		tv.brand = "LG";
//		tv.color = "black";
//		tv.ch = 998;
//		tv.vol = 5;
//		System.out.println(tv.brand + "의 색상은 " + tv.color + "입니다");
//		tv.powerOnOff();
//		tv.nextChannel();
//		tv.nextChannel();
//		tv.nextChannel();

		Tv sTv = new Tv(100, 25, "gray", "삼성");
//				int ch, int vol, String color, String brand
		System.out.println(sTv); // constructorBasic01.Tv@1f32e575
		sTv.brand = "삼성";
		System.out.println(sTv.brand);

	}
}
