package casting01;

//1번 : casting main 클래스
public class TvMain {
   public static void main(String[] args) {
      // 각각 클래스 객체
      Tv tv = new Tv();
      System.out.println(tv); // casting01.Tv@5305068a
//      tv.netflix(); //부모 객체의 값은 자식 클래스에 있는 멤버 사용 불가능
      tv.chUp();

      SmartTv sTv = new SmartTv();
      System.out.println(sTv); // casting01.SmartTv@279f2327
      sTv.netflix(); // 자식객체의 값은 자식 클래스에 있는 멤버 사용가능
      sTv.chUp(); // 자식 객체의 값은 부모 클래스에 있는 멤버도 사용가능

      // Up casting : 자식 값 -> 부모 타입
      // 방법1)
      // SmartTv()는 Tv 클래스의 참조변수 tv1에 할당
      // 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 참조값을 대입하는 것이다

      Tv tv1 = (Tv) new SmartTv(); // 부모 타입의 객체에 자식의 참조값을 대입
      System.out.println(tv1);
      tv1.chUp();
//      tv1.netflix(); 업캐스팅 되면 자식 클래스에 만들어진 멤버는 사용 불가능

      // 방법2)
      Tv tv2 = (Tv) sTv;
      // tv2는 SmartTv 클래스의 객체를 참조하지만 업캐스팅으로 인해
      // Tv 타입으로 취급된다
      // 따라서 Tv 클래스의 있는 멤버에만 접근할 수 있다

      // 방법3)
      Tv tv3 = new SmartTv();
      Tv tv4 = sTv;
      // 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 객체를 참조한다
      // 부모 클래스 타입의 참조 변수에 자식 클래스 타입의 객체의 주소값(참조값)을 저장한다

      // Down Casting
      // 자식클래스타입 참조변수 = 업캐스팅된 객체
      SmartTv stv3 = (SmartTv) tv3;
      stv3.netflix();

      // 잘못된 Down Casting
//      SmartTv stv4 = (SmartTv) new Tv();
//      System.out.println(stv4);
//      빨간 밑줄이 나타나지 않고 실행해야 오류가 나는 것을 알 수 있다
//      Down Casting은 반드시 Up Casting 된 값으로 해야한다
//      즉, Up casting 된 값을 다시 원래 자식 타입으로 되돌리는 것이 Down Casting이다

   }
}
