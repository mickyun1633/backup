package method;
//5번 : 메소드 오버로딩2
public class MethodOverloading02 {
   public static void main(String[] args) {
      
      MethodOverloading02 m = new MethodOverloading02();
      System.out.println(m.add(10, 20));
      System.out.println(m.add(10.5, 20.5));
      System.out.println(m.add(10, 20, 30));
   }
   
   int add(int num1, int num2) {
      return num1 + num2;
   }
   
   //매개변수의 개수가 다른 add메소드
   int add(int num4, int num3, int num1) {
      return num4 + num3 + num1;
   }
   //매개변수의 타입이 다른 add메소드
   double add(double num1, double num2) {
//      return (int)(num1 + num2);
      return num1 + num2;
   }
   //매개변수의 순서가 다른 add메소드
   void add(int num1, double num2) {
      System.out.println(num1 + num2);
   }
   //매개변수의 순서가 다른 add메소드   
   void add(double num1, int num2) {
      System.out.println(num1 + num2);
   }
   
   
}