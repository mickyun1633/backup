package objectTest01;

//4번 : Object 클래스 - toString메소드 main
public class ToStringTest {
   public static void main(String[] args) {
      Student st1 = new Student("짱구", 90, 100, 90 + 100);
      System.out.println(st1);
      System.out.println(st1.toString());
      System.out.println(st1.name);
      System.out.println(st1.javaScore);
      System.out.println(st1.dbmsScore);
   }
}
