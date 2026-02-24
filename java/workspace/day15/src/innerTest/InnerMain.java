package innerTest;

import innerTest.Outer.Inner;

//6번 : 내부클래스 Main 클래스
public class InnerMain {
   public static void main(String[] args) {
      // 외부 클래스의 객체 생성
      Outer outer = new Outer();
      System.out.println("외부 클래스의 참조값 : " + outer);
      System.out.println("외부 클래스의 데이터 값 : " + outer.var1);
//      System.out.println("내부 클래스의 데이터 값 : " + outer.var2);
      // 컴파일 에러 : var2는 Inner 객체의 멤버, Outer 객체로 접근 불가
//      //외부 클래스의 객체로는 내부 클래스 멤버에 접근 불가
//      
//      //내부 클래스의 객체 생성
//      내부 클래스는 외부 클래스의 인스턴스를 통해 생성해야한다!!
//      Inner inner = new Inner();
//      No enclosing instance of type Outer is accessible. 
//      Must qualify the allocation with an enclosing instance of type Outer 
//      (e.g. x.new A() where x is an instance of Outer)
//      Outer 타입의 외부 인스턴스가 존재하지 않는다
//      Inner 객체를 생성하려면 반드시 Outer 객체를 지정해야한다
//      (outer.new Inner())

      // 외부 객체를 통해 내부 클래스 생성
      Outer.Inner inner = outer.new Inner();
      Outer.Inner inner2 = new Outer().new Inner();
      System.out.println(inner);
      System.out.println(inner2);
      System.out.println(inner2.var2);
//      System.out.println(inner2.var1);

   }
}

