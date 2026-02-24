package com.koreait.userDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.koreait.userDTO.UserDTO;

//사용자 데이터를 메모리에 저장하고 조회하는 기능
//List<UserDTO> 사용하여 정보를 저장

//UserDAO는 메모리에 사용자 정보를 저장하고 회원가입/로그인 시 조회
public class UserDAO {

   // ArrayList 객체 userList 생성
//   private List<UserDTO> userList = new ArrayList<>();

//   // 회원가입 메소드
//   public boolean signUp(UserDTO user) {
//      // for-each문 for(자료형 변수명 : 배열또는 리스트)
//      for (UserDTO u : userList) {
//         // 리스트에 저장된 아이디와 지금 작성한 아이디가 같다면
//         if (u.getUserId().equals(user.getUserId())) {
//            return false;
//         }
//      }
//      userList.add(user);
//      System.out.println(userList);
//      return true;
//   }
   
   Connection conn;
   PreparedStatement ps;
   ResultSet rs;
   
   
   //1) 아이디 중복검사
   public boolean checkId(String userId) {
      String query = "SELECT 1 FROM TBL_USER WHERE USER_ID = ?";
      boolean isDuplicate = false;
      
      try {
         conn = DBConnector.getConnection();
         ps = conn.prepareStatement(query);
         ps.setString(1, userId);
         rs = ps.executeQuery();
         
         if(rs.next()) {
            isDuplicate = true;
         }
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         try {
            if(rs != null) {
               rs.close();
            }
            if(ps != null) {
               ps.close();
            }
            if(conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
      return isDuplicate;
   }
   
   
   // 회원가입 메소드
   public void insertUser(UserDTO user) {
      String query = "insert into tbl_user values(seq_user.nextval, ?, ?, ?, ?)";
      
      try {
         conn = DBConnector.getConnection();
         ps = conn.prepareStatement(query);
         ps.setString(1, user.getUserId());
         ps.setString(2, user.getUserPw());
         ps.setString(3, user.getUserName());
         ps.setString(4, user.getUserEmail());
         ps.executeUpdate();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         try {
            if(ps != null) {
               ps.close();
            }
            if(conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
      
   }

   // 로그인 메소드
   public String login(String userId, String userPw) {
      String query = "select user_name from tbl_user where user_id = ? and user_pw = ?";
      String userName = null;
      
      try {
         conn = DBConnector.getConnection();
         ps = conn.prepareStatement(query);
         ps.setString(1, userId);
         ps.setString(2, userPw);
         rs = ps.executeQuery();
         if(rs.next()) {
            userName = rs.getString("user_name");
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         try {
            if(rs != null) {
               rs.close();
            }
            if(ps != null) {
               ps.close();
            }
            if(conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      return userName;
   }

}








