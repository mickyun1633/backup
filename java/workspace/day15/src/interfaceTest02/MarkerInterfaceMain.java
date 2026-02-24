package interfaceTest02;

public class MarkerInterfaceMain {
   public static void main(String[] args) {
      SomeClass s = new SomeClass("마커 인터페이스 구현");
      
      //instanceof 연산자를 사용하여 클래스가 마커인터페이스의 타입인지 확인
      if(s instanceof MarkerInterface) {
         System.out.println("s는 MarkerInterface를 구현한 클래스입니다");
      }else {
         System.out.println("s는 MarkerInterface를 구현하지 않은 클래스 입니다");
      }
   }
}
