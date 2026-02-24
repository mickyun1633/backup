package abstractTest02;
//7번 : 추상클래스와 강제성
public class AnimalMain {
   public static void main(String[] args) {

//      Animal animal = new Animal();
//      추상 클래스는 객체화 할 수 없다

//      상속받은 자식 클래스에서 메소드 오버라이딩이 되면
//      부모타입(추상클래스타입)의 참조변수에 자식의 참조값을 넣어서 객체화 가능하다
//      업캐스팅

      Animal dog = new Dog();
      dog.crying(); // 오버라이딩 된 메소드가 호출된다!!
      

   }
}
