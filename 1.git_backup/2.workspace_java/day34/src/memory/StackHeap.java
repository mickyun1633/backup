package memory;

public class StackHeap {
   public static void main(String[] args) {
      //지역변수 - stack 메모리에 생성
      //Stack(1)
      int number1 = 10;
      int number2 = 20;
      int sum;
      
      //Stack(2)
      sum = addNum(number1, number2);
      //Stack(3)e
      System.out.println("sum : " + sum);
      //Stack(4) - 메인 메소드 종료 후, Stack 메모리에서 변수들이 사라짐
   }
   
   public static int addNum(int num1, int num2) {
      //Stack(2)  내부에서 사용되는 지역변수
      int result = num1 + num2;
      return result; //메소드 호출이 종료되면 result 변수와 함수 호출 스택 프레임이 제거됨
   }
}
