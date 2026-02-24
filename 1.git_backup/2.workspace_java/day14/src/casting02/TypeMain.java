package casting02;

//2번 : 자식 객체의 타입이 여러개인지 확인 - 메인 클래스
public class TypeMain {
   public static void main(String[] args) {

      Parents p = new Parents();
      Child c = new Child();

      System.out.println(p); // casting02.Parents@1f32e575
      System.out.println(c);// casting02.Child@279f2327

      // 객체명 instanceof 클래스명 => boolean타입 true
      // instanceof : 객체가 특정 클래스나 해당 클래스의 자식 클래스인지 확인할 때 사용
      System.out.println(p instanceof Parents); // true
      // 참조변수 p는 Parents 클래스의 객체이므로 true출력
      System.out.println(p instanceof Child); // false
      // 참조변수 p는 Child 클래스의 객체가 아니므로 false출력
      System.out.println(c instanceof Child); // true
      // 참조변수 c는 Child 클래스의 객체이므로 true 출력
      System.out.println(c instanceof Parents); // true
      // 참조변수 c는 Parents 클래스의 객체이므로 true 출력

      // 자식 클래스 타입의 객체는 부모 클래스 타입도 동시에 갖는다!!

      Parents pp = new Child();
      // pp는 Parents 타입의 참조 변수
      // Child 클래스의 객체가 할당되었으므로 업캐스팅이 발생
//      Child cc = (Parents) new Parents();
      Child cc = (Child) pp;
      // cc는 Child 타입의 참조 변수
      // 업캐스팅된 pp를 다운캐스팅(강제 형변환)한 값을 대입

   }
}
