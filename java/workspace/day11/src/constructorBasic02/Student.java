package constructorBasic02;

//2번 : 기본 생성자 확인
class Student {
   // 필드
   String name;
   int age;

   // 기본생성자
   // alt + shift + s , o
   public Student() {
      System.out.println("기본 생성자가 호출되었습니다");
   }

   // 매개변수 1개 있는 생성자
   public Student(String name) {
      this.name = name;
//      System.out.println("매개변수가 1개인 생성자가 호출되었습니다");
      System.out.println(this);
   }

}

public class Student {
   public static void main(String[] args) {
      StudentMain st1 = new StudentMain();
      System.out.println(st1);
//      st1.name ="철수";

      StudentMain st2 = new StudentMain("짱구");
//      st2.name = "짱구";
      System.out.println(st2);

   }
}
