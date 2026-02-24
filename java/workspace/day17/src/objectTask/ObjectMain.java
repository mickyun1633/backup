package objectTask;

import java.util.stream.Stream;

public class ObjectMain {
   public static void main(String[] args) {
      // Student 객체 4개 생성
      Student st1 = new Student();
      st1.setNumber(1);
      st1.setName("짱구");
      st1.setAge(5);
      st1.setGrade(1);
      st1.setJavaScore(10);
      Student st2 = new Student();
      st2.setNumber(2);
      st2.setName("철수");
      st2.setAge(5);
      st2.setGrade(2);
      st2.setJavaScore(77);
      Student st3 = new Student();
      st3.setNumber(3);
      st3.setName("유리");
      st3.setAge(5);
      st3.setGrade(2);
      st3.setJavaScore(50);
      Student st4 = new Student();
      st4.setNumber(4);
      st4.setName("맹구");
      st4.setAge(5);
      st4.setGrade(1);
      st4.setJavaScore(100);
      System.out.println(st1);
      System.out.println(st2);
      System.out.println(st3);
      System.out.println(st4);

      // Stream.of 스트림 생성
      // 스트림 이용하여 grade가 2인 학생만 선택, 선택된 학생의 이름만 출력(StreamAPI만 사용)
      Stream.of(st1, st2, st3, st4).filter(st -> st.getGrade() == 2).map(Users::getName).forEach(System.out::println);

      // Users 클래스 객체 3개 생성
      Users u1 = new Users();
      Users u2 = new Users();
      Users u3 = new Users();
      u1.setNumber(1);
      u2.setNumber(1);
      u3.setNumber(2);
//      u1.setNumber(1);

      System.out.println(u1.equals(u3));
      System.out.println(u1.equals(u2));
      System.out.println(st1.equals(u1));
      System.out.println(u1.equals(st1));

      // Users + Student 객체 섞어서 스트림 생성
      Stream.of(st1, st2, st3, st4, u1, u2, u3).filter(obj -> obj instanceof Student).map(obj -> (Student) obj)
            .filter(score -> score.getJavaScore() >= 60).map(Users::getName).forEach(System.out::println);

   }
}
