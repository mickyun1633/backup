package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.UserDTO;

public class UserDAO {
   // 1) 객체 만든다
   // C insert 삽입, R select 조회, U update 수정, D delete 삭제
   public Connection connection; // db 연결 => 메소드마다 사용, 처음에 연결시 사용(연결 성공시키기 위해)
   public PreparedStatement preparedStatement; // 쿼리문 실행
   public ResultSet resultSet; // select문의 결과를 담아줄 객체(테이블 전체를 담는다)
   // 한 행씩 가져오기 위해서는 while(resultSet.next()) 또는 if(resultSet.next())

   // 2) 필요한 메소드를 만든다
   // 회원가입(i), 아이디 중복검사(s), 로그인(s), 비밀번호 찾기(s), 비밀번호 변경(u), 회원정보 수정(u), 회원탈퇴(d)

   // [1] 아이디 중복검사
   public boolean checkId(String id) { // String id 매개변수 사용자가 입력한 값을 받아온다
      // 문자열로 쿼리문 작성한다
      String query = "SELECT user_number FROM TBL_USER WHERE USER_ID = ?";

      try {
         // 우리가 만든 DBConnector에서 커넥션 객체를 얻어온다(DB와 연결완료)
         connection = DBConnector.getConnection();
         // 쿼리를 보내기 위한 preparedStatement 객체를 커넥션 객체에서 가져온 값을 저장한다
         preparedStatement = connection.prepareStatement(query);
         // 쿼리에 ?가 있다(미완성 상태)
         // ?를 메소드의 매개변수로 받은 id가 매꿔줘야한다
         // 바인딩 set자료형(물음표순서, 넣을 값)
         preparedStatement.setString(1, id);

         // 완성된 쿼리를 실행하는 방법
         // 1) executeQuery() => SELECT 할 때 반환되는 결과값을 받기 위해 사용한다
         // 반환타입은 ResultSet이다

         // 2) executeUpdate() => INSERT, UPDATE, DELETE할 때 사용한다
         // 반환타입은 int이다

         resultSet = preparedStatement.executeQuery();
         // resultSet은 쿼리의 결과(테이블)를 저장하고 있다
         // 각 데이터에 접근하는 방식은 Iterator와 동일하게 커서를 사용한다
         // next() : 현재 커서 다음에 데이터가 존재하는지를 true/ false로 반환한다

         if (resultSet.next()) {
            return false; // 이미 아이디가 존재한다
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("checkId() sql 오류!!");
         e.printStackTrace();
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }

            if (preparedStatement != null) {
               preparedStatement.close();
            }

            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("checkId() 연결 해제 오류");
            e.printStackTrace();
         }
      }

      return true; // 중복된 아이디가 없음을 의미

   }

   // [2] 회원가입
   public boolean join(UserDTO userDTO) {

      // 쿼리문
      String query = "INSERT INTO TBL_USER(USER_NUMBER, USER_ID, USER_PW, USER_NAME, USER_AGE, USER_BIRTH) "
            + "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?)";
      int result = 0;

      try {
         // db연결
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         // 물음표 채우기(바인딩)
         preparedStatement.setString(1, userDTO.getUserId());
         preparedStatement.setString(2, userDTO.getUserPw());
         preparedStatement.setString(3, userDTO.getUserName());
         preparedStatement.setInt(4, userDTO.getUserAge());
         preparedStatement.setString(5, userDTO.getUserBirth());

         result = preparedStatement.executeUpdate();
         // 성공 true, 실패 false

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("join() sql 오류");
         e.printStackTrace();
      } finally {
         try {
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("join() 연결 종료 오류");
            e.printStackTrace();
         }
      }

      return result > 0;
   }

   // [3] 로그인
   public String login(String userId, String userPw) {

      String query = "SELECT user_name FROM tbl_user WHERE user_id = ? AND user_pw = ?";
      String name = null;

      try {
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userId);
         preparedStatement.setString(2, userPw);
         resultSet = preparedStatement.executeQuery();

         if (resultSet.next()) {
            name = resultSet.getString(1);
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("login() sql 오류");
         e.printStackTrace();
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }

            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("login() 연결 종료 오류!");
            e.printStackTrace();
         }
      }

      return name;
   }

   // [4] 아이디 찾기 : 이름과 생일로 아이디 찾기
   // 이름과 생일이 같은 사람이 여러명일 수도 있다 => List로 반환
   public List<String> findId(String userName, String userBirth) {
      String query = "SELECT user_id FROM tbl_user "
            + "WHERE user_name = ? AND user_birth = TO_DATE(?, 'YYYY-MM-DD')";
//      user_birth가 "YYYY-MM-DD" 형식인 경우
//      SQL문에서 TO_DATE(?, 'YYYY-MM-DD') 형식으로 작성한다
//      JAVA 코드에서는 java.sql.Date.valueOf(userBirth) 형식으로 작성한다

      List<String> userIds = new ArrayList<>();

      try {
         // 연결
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userName);
         preparedStatement.setString(2, userBirth); // YYYY-MM-DD 형식으로 입력되어야한다
         resultSet = preparedStatement.executeQuery();

         while (resultSet.next()) {
            String userId = resultSet.getString("user_id");
            userIds.add(userId);
         }

         if (userIds.isEmpty()) {
            System.out.println("해당하는 사용자 아이디를 찾을 수 없습니다");
         } else {
            System.out.println("찾은 사용자 아이디 : ");
//            for (String userId : userIds) {
//               System.out.println(userId);
//            }
            userIds.forEach(System.out::println);
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("findId() sql 오류!!");
         e.printStackTrace();
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("findId() 연결 종료 오류!!");
            e.printStackTrace();
         }
      }
      return userIds;
   }

   // [5] 1명의 회원 조회
   // 쿼리문에서 전체 컬럼이라고 *을 사용하지 않는다!!(성능 저하문제 발생)
   public UserDTO findUser(int userNumber) {
      String query = "SELECT USER_ID, USER_NAME, USER_AGE, USER_GENDER " + "FROM USER_NUMBER = ?";
      UserDTO userDTO = null;

      try {
         // 연결
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1, userNumber);
         resultSet = preparedStatement.executeQuery();

         if (resultSet.next()) {
            userDTO = new UserDTO();
            userDTO.setUserNumber(userNumber);
            userDTO.setUserId(resultSet.getString(1));
            userDTO.setUserName(resultSet.getString(2));
            userDTO.setUserAge(resultSet.getInt(3));
            userDTO.setUserGender(resultSet.getString(4));
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("findUser() SQL 오류!!");
         e.printStackTrace();
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }

            if (preparedStatement != null) {
               preparedStatement.close();
            }

            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("findUser() 연결 종료 오류!!");
            e.printStackTrace();
         }
      }

      return userDTO;
   }

   // [6] 회원탈퇴
   public boolean delete(int userNumber) {
      String query = "DELETE FROM TBL_USER WHERE USER_NUMBER = ?";
      int result = 0;

      // 연결
      try {
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1, userNumber);
         result = preparedStatement.executeUpdate();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("delete() SQL 오류!!");
         e.printStackTrace();
      } finally {
         try {
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("delete() 연결 종료 오류!!");
            e.printStackTrace();
         }
      }

      return result > 0;
   }

   // [7] 비밀번호 변경 메소드
   // 기존 비밀번호 확인 후 변경
   public boolean updatePw(int userNumber, String oriPw, String newPw) {

      String query = "update tbl_user set user_pw = ? " + "where user_number = ? and user_pw = ?";

      try {
         // 연결
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, newPw);
         preparedStatement.setInt(2, userNumber);
         preparedStatement.setString(3, oriPw);

         int result = preparedStatement.executeUpdate();

         return result > 0;
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("updatePw() sql 오류!!");
         e.printStackTrace();
      } finally {
         try {
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("updatePw() 연결 종료 오류!!");
            e.printStackTrace();
         }
      }

      return false;

   }

}
