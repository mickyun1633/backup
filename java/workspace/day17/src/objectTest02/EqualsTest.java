package objectTest02;
//5번 : Object 클래스 - equals() 메소드 main
public class EqualsTest {
   public static void main(String[] args) {
      User u1 = new User("짱구", 1);
      User u2 = new User("철수", 2);
      User u3 = new User("짱구", 1);
      
      System.out.println(u1);
      System.out.println(u2);
      System.out.println(u3);
      
      //equals()가 오버라이딩 되어있지 않을 때 참조값으로 비교한다
      //만약 이름이 같은 객체라면 equals()메소드를 재정의해야한다
      System.out.println(u1 == u2);
      System.out.println(u1 == u3);
      System.out.println(u2 == u3);
      
      System.out.println(u1.equals(u3)); //true
      System.out.println(u1.equals(u2));
      System.out.println(u2.equals(u3));
      
      System.out.println(u1.hashCode());
      System.out.println(u2.hashCode());
      System.out.println(u3.hashCode());
   }
}
