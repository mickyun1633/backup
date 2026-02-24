//package objectTask; //01.22 - 코드 비교해서 코드 보충해서 작성
//
//public class Users {
///*	private 필드 : 이름, 나이, 직업, 성별
//	생성자 : 기본 생성자
//	메소드 : toString 오버라이딩, equals 오버라이딩 번호가 같으면 객체로 판단	
//	
//	Student 클래스 Users 클래스 상속
//	private 필드 : 학교명, 학년, java점수, dbms점수
//	메소드 : toString / equals 오버라이딩 이름과 번호, 학년이 같으면 같은 객체로 판단
//	
//	Student 클래스의 객체 4개 생성
//	Stream.of 스트림 생성
//	스트림을 이용하여 grade가 2인 학생만 선택, 선택된 학생의 이름만 출력(SteamAPI만 사용)
//	
//	Users와 Student 객체를 섞어서 Stream.of()로 스트림 생성 -> 7개 생성
//	Student 객체만 필터링, java점수가 60점 이상인 학생 이름 출력								*/
//		
//		// private 필드 : 이름, 나이, 직업, 성별
//		private String name;
//		private int age;
//		private String job;
//		private String gender;
//		// 생성자 : 기본 생성자
//		public Users(String name, int age, String job, String gender) {
//			super();
//			this.name = name;
//			this.age = age;
//			this.job = job;
//			this.gender = gender;
//		}
//		// toString 오버라이딩, 번호가 같으면 객체로 판단
//		@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return super.toString();
//		}
//		// equals 오버라이딩, 번호가 같으면 객체로 판단
//		@Override
//		public boolean equals(Object obj) {
//			// TODO Auto-generated method stub
//			return super.equals(obj);
//		}
//}

package objectTask;

import java.util.Objects;

public class Users {
   // private 필드 : 번호, 이름, 나이, 직업, 성별
   // 생성자 : 기본생성자
   // 메소드 : toString / equals 오버라이딩 번호가 같으면 같은 객체로 판단

//   Users 객체 3개, Student객체 4개

   // Student 클래스 Users 클래스 상속
   // private 필드 : 학교명, 학년, java점수, dbms점수
   // 메소드 : toString / equals 오버라이딩 이름과 번호, 학년이 같으면 같은 객체로 판단

   // Student 클래스의 객체 4개 생성
   // Stream.of 스트림 생성
   // 스트림 이용하여 grade가 2인 학생만 선택, 선택된 학생의 이름만 출력(StreamAPI만 사용)

   // Users와 Student 객체를 섞어서 Stream.of()로 스트림 생성 => 7개생성
   // Student 객체만 필터링, java점수가 60점 이상인 학생 이름 출력

   // 필드 : private 번호, 이름, 나이, 직업, 성별
   private int number;
   private String name;
   private int age;
   private String job;
   private String gender;

   // 생성자
   public Users() {
      super();
   }

   // setter, getter
   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getJob() {
      return job;
   }

   public void setJob(String job) {
      this.job = job;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }
   // toString 오버라이딩

   @Override
   public String toString() {
      return "Users [number=" + number + ", name=" + name + ", age=" + age + ", job=" + job + ", gender=" + gender
            + "]";
   }

   // 번호가 같으면 같은 객체 equals 오버라이딩
   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
         return false;
      }

      Users users = (Users) obj; // 다운캐스팅
      return number == users.number;

   }

   @Override
   public int hashCode() {
      // TODO Auto-generated method stub
      return Objects.hash(number);
   }

}





























