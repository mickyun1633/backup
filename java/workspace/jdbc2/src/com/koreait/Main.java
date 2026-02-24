package com.koreait;

import java.util.List;

import com.koreait.model.UserDAO;
import com.koreait.model.UserDTO;

public class Main {
   public static void main(String[] args) {
      UserDTO userDTO = new UserDTO();
      UserDAO userDAO = new UserDAO();
      
      List<UserDTO> users = userDAO.join(userDTO);
      System.out.println(users);
      //객체 3명 추가후 테스트 진행
//      for(int i = 0; i < 3; i++) {
//         System.out.println("===회원가입===");
//         UserDTO user = new UserDTO();
//         userDAO.join(user);
//      }
      
      if(userDAO.login("test", "1234")) {
         System.out.println("로그인 성공");
      }else {
         System.out.println("로그인 실패");
      }
      if(userDAO.loginStream("test", "1234")) {
         System.out.println("스트림 로그인 성공");
      }else {
         System.out.println("스트림 로그인 실패");
      }
      if(userDAO.login("test", "124")) {
         System.out.println("로그인 성공");
      }else {
         System.out.println("로그인 실패");
      }
      if(userDAO.loginStream("test", "134")) {
         System.out.println("스트림 로그인 성공");
      }else {
         System.out.println("스트림 로그인 실패");
      }
      
      
      
      
      
   }
}