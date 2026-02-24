package casting03;
//3번 : 캐스팅 특징 - 자식클래스2
public class Dog extends Animal{
   //생성자
   public Dog(String name, int age) {
      super(name, age);
   }
   //메소드 오버라이딩
   @Override
   void crying() {
      System.out.println("멍멍!!");
   }
   //자식클래스의 추가 메소드
   void walk() {
      System.out.println("산책가자!!");
   }
}
