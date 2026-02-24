package interfaceTest02;
//9-5 : 인터페이스 다중구현
public class InterClass implements InterA, InterB{
   //자바에서는 여러 인터페이스를 동시에 구현할 수 있음
   //인터페이스는 메소드는 구현이 없기 때문에 충돌 위험이 없음
   //- 구현 클래스에서 메소드를 정의하므로 충돌 문제를 피할 수 있음
   
   @Override
   public void run() {
      System.out.println("run 메소드 직접 구현");
   }

   @Override
   public void methodB() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void methodA() {
      // TODO Auto-generated method stub
      
   }
   
   
}
