package memory;

public class Heap {
   public static void main(String[] args) {
      int[] number = {1, 2, 3, 4, 5}; // 배열 객체 heap
      System.out.println(number);  //[I@28a418fc //heap 주소값
      
      //MyClass 객체 생성
      MyClass refVar = new MyClass(); //new로 생성된 객체 heap
      System.out.println(refVar);
      //MyClass 객체의 메소드 호출
      refVar.myMethod();
      //heap 메모리에서 생성된 객체는 사용이 끝날 때 까지 유지됨
   }
}

class MyClass{
   public void myMethod() {
      System.out.println("MyClass의 myMethod 호출");
   }
}
