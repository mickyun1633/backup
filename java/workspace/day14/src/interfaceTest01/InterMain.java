package interfaceTest01;
//
public class InterMain {
   public static void main(String[] args) {

      // 인터페이스 객체화 불가능 => 추상 메소드를 구현한 클래스로 객체화
//      Inter i = new Inter();
//      System.out.println(i);

      // 잘못된 다운 캐스팅 => 불가능!! 절대 하면 안됨
//      ClassA a = new Inter();

      ClassA a = new ClassA();
      System.out.println(a);
//      a.VAR1 = 100;
//      a.VAR2 = 200;
      a.method1();
      System.out.println(Inter.VAR1);

      Inter i = new ClassA(); // 업캐스팅
      i.method1();

   }
}