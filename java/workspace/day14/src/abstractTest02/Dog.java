package abstractTest02;
//7번 : 추상클래스와 강제성
public class Dog extends Animal {

   @Override
   void crying() {
      System.out.println(this.name + " 멍멍!!");
   }
   

}
