package interfaceTest04;
//4-4번 : 다중상속(모호성 해결방법 예제)
public interface Inter2 {
   default void printText() {
      System.out.println("Inter2 printText() 호출");
   }
}