package anonymousTest02;

//2번 : 익명 클래스를 이용한 객체화
public class AnimalMain {
   public static void main(String[] args) {

      Animal cat = new Animal() { // 내부 클래스 중괄호 시작

         @Override
         public void speak() { // 내부 클래스의 메소드 중괄호 시작
            System.out.println("야옹");
         } // 내부 클래스의 메소드 중괄호 끝
      }; // 내부 클래스 중괄호 끝

      System.out.println(cat);
//      anonymousTest02.AnimalMain$1@1f32e575
//      패키지명         .클래스명    $내부클래스 1 익명클래스 @참조값

      Animal dog = new Animal() {

         @Override
         public void speak() {
            System.out.println("멍멍");
         }
      };
      System.out.println(dog);

      cat.speak();
      dog.speak();

   }
}

