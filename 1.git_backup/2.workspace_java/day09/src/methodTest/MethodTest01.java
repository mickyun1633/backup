package methodTest;

//10번 : 메소드 정의순서
public class MethodTest01 { // 클래스 시작 중괄호
   public static void main(String[] args) { // main메소드 시작 중괄호
      
      MethodTest01 mt01 = new MethodTest01();
      System.out.println(mt01);
      System.out.println(mt01.addTen(10));
      
   } // main 메소드 중괄호 끝

    // 메소드 정의는 메소드 중괄호 밖, 정의시에는 {}가 있어야한다

   // 리턴타입 메소드명(자료형 매개변수){
   // 실행할문장
   // return 리턴값;
   // }

   // 어떤값에 10을 더해주는 기능
   // 1) 리턴타입 생각 => void
   // 2) 메소드명 생각 => 10을 더해주는 기능 addTen
   // 3) 매개변수 생각 => 정수형 매개변수 1개
   // 4) 실행할 문장 생각 => num의 값 출력, return 이용
   // 5) 리턴값을 생각 => return num + 10
   // 6) 리턴타입 수정 => void -> int
   int addTen(int num) {
      System.out.println("num의 값 : " + num);
      return num + 10;
   }

} // 클래스 중괄호 끝
















































