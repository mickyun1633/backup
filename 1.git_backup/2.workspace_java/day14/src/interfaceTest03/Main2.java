package interfaceTest03;
// 11번 : 인터페이스 간 상속

interface ParentInter {
   void method1();
}

interface ChildInter extends ParentInter {
   // 인터페이스는 인터페이스를 상속할 수 있다
   void method2();
}

class ClassA implements ChildInter {
   // 클래스에서 인터페이스의 추상메소드(미구현된 메소드)를 오버라이딩하여 구현한다

   @Override
   public void method1() {
      // TODO Auto-generated method stub
      System.out.println("ParentInter의 메소드 구현");
   }

   @Override
   public void method2() {
      // TODO Auto-generated method stub
      System.out.println("ChildInter의 메소드 구현");
   }

}

public class Main2 {
   public static void main(String[] args) {
      ClassA a = new ClassA();
      a.method1();
      a.method2();
   }

}