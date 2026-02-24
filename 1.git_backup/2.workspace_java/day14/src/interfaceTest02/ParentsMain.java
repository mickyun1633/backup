package interfaceTest02;
//9-2 : 단일 상속 - 부모클래스와 자식클래스 객체
public class ParentsMain {
   public static void main(String[] args) {
      Parents p = new Parents();
      Child c = new Child();
      p.hello();
      c.hello();
      c.childMethod();
   }
}