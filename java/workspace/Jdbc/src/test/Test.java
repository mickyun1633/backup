package test;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class Test {
   public static void main(String[] args) {
      
      //연결 테스트
//      try {
//         Connection connection = DBConnector.getConnection();
//         connection.close();
//      } catch (SQLException e) {
//         // TODO Auto-generated catch block
//         System.out.println("connection 연결 해제 오류");
//         e.printStackTrace();
//      }
      
      UserDAO userDAO = new UserDAO();
      UserDTO userDTO = new UserDTO();
      
//      userDTO.setUserId("abc");
//      userDTO.setUserPw("qwer1234");
//      userDTO.setUserName("짱구");
//      userDTO.setUserAge(5);
//      userDTO.setUserGender("M");
//      userDTO.setUserBirth("20000101");
//      System.out.println(userDTO);
      
      //회원가입
//      userDAO.join(userDTO);
      
      //로그인
      System.out.println(userDAO.login("abc", "qwer1234") + "님 환영합니다!!");
      
      //아이디 중복 확인
      UserDTO newUser = new UserDTO();
      Scanner sc = new Scanner(System.in);
      //아이디 입력
      System.out.println("아이디 입력 : ");
      newUser.setUserId(sc.nextLine());
      //아이디 중복체크
      if(userDAO.checkId(newUser.getUserId())) {
         System.out.println("중복된 아이디입니다");
      }else {
         System.out.println("가입 가능한 아이디입니다");
      }
   
      //비밀번호 입력
      System.out.println("비밀번호 입력 : ");
      newUser.setUserPw(sc.nextLine());
      System.out.println("나이 입력 : ");
      newUser.setUserAge(sc.nextInt());
      sc.nextLine();
      System.out.println("성별 입력 : ");
      newUser.setUserGender(sc.nextLine());
      System.out.println("생일 입력 : ");
      newUser.setUserBirth(sc.nextLine());
      
      //회원가입 메소드 호출
      if(userDAO.join(newUser)) {
         System.out.println("회원가입 성공");
      }else {
         System.out.println("회원가입 실패");
      }
      
      
      
   }
}




















