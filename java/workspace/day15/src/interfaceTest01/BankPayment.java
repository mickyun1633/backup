package interfaceTest01;
//1번 : 인터페이스 표준화
public class BankPayment implements Payment {

   @Override // alt + shift + s + v
   public void pay(int amount) {
      System.out.println("계좌이체로 " + amount + "원 결제");
   }

}