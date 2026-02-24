package anonymousTest;
//7번 : 인터페이스 구현 클래스
public class ClassA implements InterA{

   @Override
   public void printText() {
      System.out.println("구현하는 클래스에서 메소드 오버라이딩");
   }

}