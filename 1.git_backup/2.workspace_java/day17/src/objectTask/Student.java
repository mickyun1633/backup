//package objectTask;  //01.22 - 코드 비교해서 코드 보충해서 작성
//
///*	Student 클래스 Users 클래스 상속
//	private 필드 : 학교명, 학년, java점수, dbms점수
//	메소드 : toString / equals 오버라이딩 이름과 번호, 학년이 같으면 같은 객체로 판단
//	
//	Student 클래스의 객체 4개 생성
//	Stream.of 스트림 생성
//	스트림을 이용하여 grade가 2인 학생만 선택, 선택된 학생의 이름만 출력(SteamAPI만 사용)
//	
//	Users와 Student 객체를 섞어서 Stream.of()로 스트림 생성 -> 7개 생성
//	Student 객체만 필터링, java점수가 60점 이상인 학생 이름 출력		
//	//super.toString() +												*/
//		
//		// Student 클래스 Users 클래스 상속
//public class Student extends Users {
//		// private 필드 : 학교명, 학년, java점수, dbms점수
//		private String schoolName;
//		private int grade;
//		private int javaScore;
//		private int dbmsScore;
//		// Student 클래스의 객체 4개 생성
//		// 생성자, Users 생성자 호출
//		// this.필드명 으로 필드 초기화
//		public Student(String name, int age, String job, String gender) {
//		super(name, age, job, gender);
//				this.schoolName = schoolName;
//				this.grade = grade;
//				this.javaScore = javaScore;
//				this.dbmsScore = dbmsScore;
//				}
//		// toString 오버라이딩, 이름과 번호, 학년이 같으면 같은 객체로 판단
//		@Override
//		public String toString() {
//			return super.toString();
//		}
//		// equals 오버라이딩, 이름과 번호, 학년이 같으면 같은 객체로 판단
//		@Override
//		public boolean equals(Object obj) {
//			return super.equals(obj);
//		}
//	}

package objectTask;

import java.util.Objects;

public class Student extends Users {
   // private필드 : 학교명, 학년, java점수, dbms점수
   private String schoolName;
   private int grade;
   private int javaScore;
   private int dbmsScore;

   // 기본생성자
   public Student() {
   }

   // setter, getter
   public String getSchoolName() {
      return schoolName;
   }

   public void setSchoolName(String schoolName) {
      this.schoolName = schoolName;
   }

   public int getGrade() {
      return grade;
   }

   public void setGrade(int grade) {
      this.grade = grade;
   }

   public int getJavaScore() {
      return javaScore;
   }

   public void setJavaScore(int javaScore) {
      this.javaScore = javaScore;
   }

   public int getDbmsScore() {
      return dbmsScore;
   }

   public void setDbmsScore(int dbmsScore) {
      this.dbmsScore = dbmsScore;
   }
   // toString 오버라이딩

   @Override
   public String toString() {
      return "Student [ " + super.toString() + "schoolName=" + schoolName + ", grade=" + grade + ", javaScore="
            + javaScore + ", dbmsScore=" + dbmsScore + "]";
   }

   // equals 오버라이딩 : 이름 + 학년 + 번호이 같으면 같은 객체
   @Override
   public boolean equals(Object obj) {
      // TODO Auto-generated method stub
//      return super.equals(obj);
      if (this == obj) {
         return true;
      }

      if (obj == null || getClass() != obj.getClass()) {
         return false;
      }

      Student stu = (Student) obj;
      return getNumber() == stu.getNumber() && Objects.equals(getName(), stu.getName()) && grade == stu.grade;
   }

}








