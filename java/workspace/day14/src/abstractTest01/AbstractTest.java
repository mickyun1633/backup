package abstractTest01;

//6-4 : 일반 클래스와 추상 클래스 객체화
public class AbstractTest {
   public static void main(String[] args) {
      // 일반클래스 객체화 바로 가능
      ClassA a = new ClassA();
      System.out.println(a);
      a.method1();

      // 추상클래스 객체화 불가능 - 미완성된 클래스
//      ClassB b = new ClassB();

      // 추상클래스 ClassB를 상속받은 일반 클래스 ClassC 객체화
      ClassC c = new ClassC();
      System.out.println(c);
      c.method2();
      // 추상클래스에 정의된 추상메소드(미완성된 메소드), 상속받은 자식클래스(ClassC) 재정의(오버라이딩)
      c.methodTest();
      // 추상클래스에 정의된 일반 메소드(완성된 메소드), 상속받은 자식클래스 객체로 호출 가능
      c.printNumber();
      // 추상클래스를 상속받은 일반 클래스의 멤버 일반 메소드 호출 가능

      // 업캐스팅
      ClassB b = new ClassC();
      System.out.println(b);
//      b.printNumber();
      b.method2(); // 오버라이딩 된 메소드 호출
      // 다운캐스팅
      ((ClassC) b).printNumber();

   }
}
