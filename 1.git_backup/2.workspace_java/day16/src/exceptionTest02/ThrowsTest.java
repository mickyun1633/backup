package exceptionTest02;

//8번 : throws(예외던지기)와 throw(예외강제 발생시키기)
// throws 메소드의 선언부에 사용한다
public class ThrowsTest {

   public static void main(String[] args) {

      method1();

   }

   static void method1() {
      for (int i = 0; i < 10; i++) {
         System.out.println(i);
         // try ~ catch 블록 단축키 : 예외발생할 수 있는 코드 드래그 한 상태에서 alt + shift + z
         try {
            Thread.sleep(1000); // 500 => 0.5초, 1000 => 1초
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }

}
