package objectTest02;

import java.util.Objects;

//5번 : Object 클래스 - equals() 메소드
public class User {
   // 필드
   String name;
   int userNumber;

   // 생성자
   public User(String name, int userNumber) {
      super();
      this.name = name;
      this.userNumber = userNumber;
   }

   @Override
   public int hashCode() {
      return Objects.hash(name);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      User other = (User) obj;
      return Objects.equals(name, other.name);
   }

   // 메소드
   // toString() : alt + shift + s , s
//   @Override
//   public String toString() {
//      return "User [name=" + name + ", age=" + age + "]";
//   }

   // equals()
   // name과 userNumber가 둘 다 같으면 같은 객체로 판단
//   @Override
//   public boolean equals(Object obj) {
//
//      // 1. 자기자신과 비교
//      if (this == obj) {
//         return true;
//      }
////      // 2. null체크
////      if (obj == null) {
////         return false;
////      }
////      // 3. 클래스 타입 비교
////      if (getClass() != obj.getClass()) {
////         return false;
////      }
////      // 4. 다운캐스팅(형변환)
////      User user = (User) obj;
////
////      // 필드 비교
////      if (this.userNumber != user.userNumber) {
////         return false;
////      }
////
////      if (this.name == null) {
////         return user.name == null;
////      } else {
////         return this.name.equals(user.name);
////      }
//
//      
//      // 두번째 객체비교방법
////      //이름이 같은 경우 => 같은 객체로 판단
////      if(obj instanceof User) {
////         String other = ((User)obj).name;
////         if(this.name.length() == other.length()) {
////            for(int i = 0; i < this.name.length(); i++) {
////               if(this.name.charAt(i) != other.charAt(i)) {
////                  return false;
////               }
////            }
////            return true;
////         }
////      }
////      return false;
//
//      // 더 짧은 코드 가능(이름이 같은 경우)
////      if(obj instanceof User) {
////         String other = ((User)obj).name;
////         return this.name.equals(other);
////      }
////      return false;
////      
//      // 실무용(이름이 같은 경우)
////      if(this == obj) {
////         return true;
////      }
////      
////      if (obj == null || getClass() != obj.getClass()) {
////         return false;
////      }
////      
////      User user = (User)obj;
////      return this.name == user.name;
//
//   }

   // eqauls를 재정의하면 hashCode도 재정의해야한다
   // 동일객체에 대해 같은 hashCode값이 반환되도록 한다
   // 이름을 해시코드 값으로 쓸 때는 name.hashCode()
   // 나이를 해시코드 값으로 쓸 때는 Integer.hashCode(age)
//   @Override
//   public int hashCode() {
//      // TODO Auto-generated method stub
//      return Objects.hash(name, userNumber);
//   }

}
