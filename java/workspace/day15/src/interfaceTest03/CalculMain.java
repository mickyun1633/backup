package interfaceTest03;

public class CalculMain {
   public static void main(String[] args) {
      
      Calculator c = new CalculImpl(); //업캐스팅
      System.out.println(c.add(-10, 20));
      System.out.println(c.subtract(10, 20));
      Calculator.info();
      
      
      
   }
}