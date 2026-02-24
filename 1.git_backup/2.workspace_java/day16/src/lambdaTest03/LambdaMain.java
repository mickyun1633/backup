package lambdaTest03;
//4번 : 익명클래스로 객체화, 람다식으로 객체화
public class LambdaMain {
   public static void main(String[] args) {
      
//      인터페이스명 : CombInter(함수형 인터페이스)
//      두 문자열을 연결하는 추상 메소드를 만든다(명령문 1줄)
//      메인 메소드에서 익명 클래스로 객체화
      CombInter c1 = new CombInter() {
         
         @Override
         public String combine(String a, String b) {
            return a + b;
         }
      };
      
//      메인 메소드에서 람다식으로 객체화
//      String combine(String str1, String str2) {
//         return str1 + str2;
//      }
      
      CombInter c2 = (a, b) -> a + b;
//      c2.add(100, 200);
      
//      CombInter c3 = new CombInter();
//      c3.add(10, 30);
      
   }
}
