package methodTest;

//11번 : 메소드 호출방법 4가지
public class MethodTest02 {
   public static void main(String[] args) {

      // 클래스명 참조변수 = new 클래스명();
      MethodTest02 mt02 = new MethodTest02();
      // 매개변수 x, 리턴값 x 메소드 호출 => 객체명.메소드명();
      mt02.printHello();

      // 매개변수 o, 리턴값 x 메소드 호출 => 객체명.메소드명(인수);
      mt02.greet("홍길동");
      mt02.greet("신짱구");
      mt02.greet("이유리");

      // 매개변수 x, 리턴값 o 메소드 호출 => syso(객체명.메소드명());
      // 자료형 변수명 = 객체명.메소드명();
      System.out.println(mt02.printTotal()); // 값!!!!!
      
      // 매개변수 o, 리턴값 o 메소드 호출 => 
      // syso(객체명.메소드명(인수));
      // 자료형 변수명 = 객체명.메소드명(인수);
      int result = mt02.printNum(10);
      System.out.println(result);

   }

   // 매개변수 x, 리턴값 x 메소드 정의
   // 안녕하세요 출력하는 메소드
   void printHello() {
      for (int i = 0; i < 3; i++) {
         System.out.println("안녕하세요");
      }
   }

   // 매개변수 o, 리턴값 x 메소드 정의
   // 000님 환영합니다! 출력하는 메소드
   void greet(String name) {
      System.out.println(name + "님 환영합니다!");
   }

   // 매개변수 x, 리턴값 o 메소드 정의
   // 1부터 10까지의 합을 반환하는 메소드
   int printTotal() {
      // 1부터 10까지의 합 반환
      // 1) 총합구할변수
      int total = 0;
      // 2) for문(초기식 int i = 0; i < 10; i++)
      for (int i = 0; i < 10; i++) {
         // 3) 실행문 총합구할변수 += i + 1;
         total += i + 1;
      }
//      System.out.println(total);
      // 4) 반환 리턴값
      return total;
   }

   // 매개변수 o, 리턴값 o 메소드 정의
   // 정수 1개를 입력(넘어)받아 1부터 넘겨받은 정수까지의 합을 반환하는 메소드
   int printNum(int num) {
      // 1) 총합구할 변수
      int total = 0;
      // 2) 반복문 for문
      // 초기식 int i = 1 조건식 i <= num 증감식 i++
      for (int i = 1; i <= num; i++) {
         // { 3) 총합구할변수 += i }
         total += i;
      }
      // 4) return total;
      return total;
   }

}

