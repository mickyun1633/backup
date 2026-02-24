package castingTask;

public class Student extends Person {
   // 필드
   private boolean stu;

   // 생성자
   public Student(String name, boolean stu) {
      super(name);
      this.stu = stu;
   }

   // boolean 필드인 경우 getter는 is + 필드명
   public boolean isStu() {
      return stu;
   }

   // 메소드 오버라이딩
   @Override
   void introduce() {
      System.out.println(this.getName() + "이/가 학생입니다");
   }

   void study() {
      System.out.println(this.getName() + "이/가 공부합니다");
   }

}
