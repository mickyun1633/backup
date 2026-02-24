package interfaceTest01;
//1번 : 인터페이스 표준화
public class PaymentMain {
   public static void main(String[] args) {
      Payment pay1 = new CardPayment(); //업캐스팅
      Payment pay2 = new KakaoPayment();
      Payment pay3 = new BankPayment();
      
      pay1.pay(10000);
      pay2.pay(2000);
      pay3.pay(500);
   }
}
