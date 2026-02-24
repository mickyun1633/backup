package classBasic2;
//11-2 : 클래스 특징1(사용자 정의 타입이다)
public class StudentMain {
   public static void main(String[] args) {
      //자료형 변수명 = 값;
      //클래스명 참조변수(객체) = new 클래스명();
      Student st1 = new Student();
      System.out.println(st1); //classBasic2.Student@5305068a
      
      st1.name = "홍길동";
      st1.age = 17;
      st1.gpa = 4.5;
      
      System.out.println("이름 : " + st1.name);
      System.out.println("나이 : " + st1.age);
      System.out.println("학점 : " + st1.gpa);
      
      Student st2 = new Student();
      System.out.println(st2); //classBasic2.Student@816f27d
      System.out.println("이름 : " + st2.name);
   }
}
