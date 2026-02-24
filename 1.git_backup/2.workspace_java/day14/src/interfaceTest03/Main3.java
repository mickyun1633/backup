package interfaceTest03;
//12번 : 클래스 상속과 인터페이스 구현은 별개이다

class Parents {
   void parentsMethod() {
      System.out.println("Parents 클래스의 메소드");
   }
}

interface InterA {
   void interMethod1();
}

interface InterB {
   void interMethod2();
}

class ClassAll extends Parents implements InterA, InterB {

   @Override
   public void interMethod2() {
      // TODO Auto-generated method stub
      System.out.println("InterB의 메소드 구현");
   }

   @Override
   public void interMethod1() {
      // TODO Auto-generated method stub
      System.out.println("InterA의 메소드 구현");
   }

   @Override
   void parentsMethod() {
      // TODO Auto-generated method stub
//      super.parentsMethod();
      System.out.println("자식 클래스에서 메소드 오버라이딩");
   }

}

public class Main3 {
   public static void main(String[] args) {
      ClassAll c = new ClassAll();
      c.parentsMethod();
      c.interMethod1();
      c.interMethod2();

      Parents p = new ClassAll(); // 업캐스팅
      p.parentsMethod();
      ((ClassAll) p).interMethod1(); // 다운캐스팅
      ((ClassAll) p).interMethod2();
   }
}
