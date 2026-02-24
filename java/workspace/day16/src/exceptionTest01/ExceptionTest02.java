package exceptionTest01;

//6번 : Exception Basic2
public class ExceptionTest02 {
   public static void main(String[] args) {
      ExceptionTest02 et = new ExceptionTest02();
      System.out.println(et);
      et.printLength("java");
      et.printLength("안녕하세요. 오늘은 16일차 수업입니다. 이제 쉬는시간입니다");
//      et.printLength(15.5);
      // java.lang.Error
//      et.printLength(null);
      // java.lang.NullPointerException
      try {
         et.printLength(null);
//         et.printLength(5.1);
      } catch (NullPointerException e) {
         System.out.println("null은 입력할 수 없습니다");
      } catch (Exception e) {
         System.out.println("알 수 없는 예외가 발생했습니다");
      } finally {
         System.out.println("프로그램 실행 종료");
      }

   }

   public void printLength(String data) {
      int result = data.length(); // 문자열.length() 문자열의 길이 반환
      System.out.println(data + "의 글자수는 " + result + "입니다");
   }
}
