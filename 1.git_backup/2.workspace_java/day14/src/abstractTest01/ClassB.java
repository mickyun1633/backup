package abstractTest01;
//6-2번 : 추상클래스(추상메소드와 일반메소드)
public abstract class ClassB {
   //일반메소드
   void methodTest() {
      System.out.println("추상클래스의 methodTest (일반메소드)");
   }
   
   //추상메소드
   abstract void method2();
}
