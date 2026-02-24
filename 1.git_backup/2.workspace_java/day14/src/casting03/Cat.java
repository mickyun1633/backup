package casting03;
//3번 : 캐스팅 특징 - 자식클래스1
public class Cat extends Animal{
   //생성자
   public Cat(String name, int age) {
      super(name, age);
   }
   //메소드 오버라이딩

   @Override
   void crying() {
      System.out.println("야옹");
   }
   

}
