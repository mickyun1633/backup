package interfaceTest01;
//1번 : 인터페이스 표준화
public class KakaoPayment implements Payment{

   @Override
   public void pay(int amount) {
      System.out.println("카카오페이로 " + amount + "원 결제");
   }
   
}
