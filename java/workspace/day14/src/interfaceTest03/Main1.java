package interfaceTest03;
// 10 : 인터페이스 다중구현

interface InterA {
   void methodA();
}

interface InterB {
   void methodB();
}

class ClassC implements InterA, InterB {

   @Override
   public void methodB() {
      // TODO Auto-generated method stub
      System.out.println("InterB의 메소드 구현");
   }

   @Override
   public void methodA() {
      // TODO Auto-generated method stub
      System.out.println("InterA의 메소드 구현");
   }

}

public class Main1 {
   public static void main(String[] args) {
      ClassC c = new ClassC();
      InterA a = new ClassC(); // 업캐스팅
      InterB b = new ClassC(); // 업캐스팅
      a.methodA();
//      a.methodB();
      b.methodB();
      ((ClassC) a).methodB(); // 다운캐스팅

   }
}
