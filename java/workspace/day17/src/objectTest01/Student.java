package objectTest01;

//4번 : Object 클래스 - toString 메소드
public class Student {
   // 필드
   String name;
   int javaScore;
   int dbmsScore;
   int total;

   // 생성자
   public Student(String name, int javaScore, int dbmsScore, int total) {
      super();
      this.name = name;
      this.javaScore = javaScore;
      this.dbmsScore = dbmsScore;
      this.total = total;
   }

   // 메소드
   // toString 오버라이딩
//   @Override
//   public String toString() {
//      // TODO Auto-generated method stub
//      return "이름 : " + this.name + ", 자바점수 : " + this.javaScore + ", dbms점수 : " + this.dbmsScore;
//   }

   // alt + shift + s , s : toString 오버라이딩
   @Override
   public String toString() {
      return "Student [name=" + name + ", javaScore=" + javaScore + ", dbmsScore=" + dbmsScore + ", total=" + total
            + "]";
   }

}
