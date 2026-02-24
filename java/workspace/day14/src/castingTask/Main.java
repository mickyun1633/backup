package castingTask;

public class Main {
   public static void main(String[] args) {
      Person p = new Person("홍길동");
      Student st = new Student("짱구", true);
      Teacher t = new Teacher("철수");
      Employee e = new Employee("유리");
      p.introduce();
      st.introduce();
      t.introduce();
      e.introduce();

      printInfo(new Employee("치타"));
//      Person p = new Employee("치타");
   }

//   static 메소드(printInfo())
//   객체 타입에 따라 다운 캐스팅하여 전용 메소드 실행
   static void printInfo(Person p) {
      p.introduce();
      // 조건문 객체명 instanceof 클래스명
      if (p instanceof Student) {
         ((Student) p).study();
      } else if (p instanceof Teacher) {
         ((Teacher) p).teach();
      } else if (p instanceof Employee) {
         ((Employee) p).work();
      }
   }

}
