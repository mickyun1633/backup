package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koreait.dto.StudentDTO;

/* 학생 CRUD
 * StudentDAO 역할
 * - 학생 테이블(TBL_STUDENT)에 접근해서 SQL을 실행한다
 * - INSERT / SELECT / UPDATE / DELETE DB 작업만 담당한다
 * - Scanner 입력, System.out 출력은 절대 하지 않는다(View에서 담당)
*/
public class StudentDAO {

   // DB연결객체
   public Connection connection;
   // sql실행 객체
   public PreparedStatement preparedStatement;
   // SELECT 결과 저장 객체
   public ResultSet resultSet;

   /*
    * 학생 등록 : INSERT - 시퀀스를 이용해 STU_NUMBER [PK] 를 자동 생성한다 - 이름, 전공 사용자 입력을 받아서 ?에
    * 바인딩한다
    * 
    * 반환 값 boolean true /false int 1(삽입된 행 1개) / 0 (실패)
    * 
    */
   public boolean stuInsert(StudentDTO stuDTO) {
      String query = "INSERT INTO TBL_STUDENT " + "VALUES (SEQ_STUDENT.NEXTVAL, ?, ?)";
      int result = 0;

      try {
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         // ?바인딩
         preparedStatement.setString(1, stuDTO.getStuName());
         preparedStatement.setString(2, stuDTO.getStuMajor());

         // 쿼리 실행
         result = preparedStatement.executeUpdate();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("stuInsert() SQL 오류!!");
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
            System.out.println("stuInsert() 연결 종료 오류!");
            e.printStackTrace();
         }

      }
      return result > 0;
   }

   /*
    * 학생 전체 조회 - tbl_student 테이블의 전체 데이터를 리스트로 반환한다
    * 
    * 반환값 데이터가 있으면 : StudentDTO 가 담긴 List 데이터가 없으면 : 빈 리스트로 반환(null로 주지 않는다)
    * 
    */
   public List<StudentDTO> selectAll() {
      String query = "SELECT STU_NUMBER, STU_NAME, STU_MAJOR FROM TBL_STUDENT";

      List<StudentDTO> stuList = new ArrayList<>();

      try {
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();

         while (resultSet.next()) {
            StudentDTO stu = new StudentDTO();
            stu.setStuNumber(resultSet.getInt(1));
            stu.setStuName(resultSet.getString(2));
            stu.setStuMajor(resultSet.getString(3));

            stuList.add(stu);

         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("selectAll() sql 오류!!");
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
            System.out.println("selectAll() 연결 종료 오류!!");
            e.printStackTrace();
         }
      }
      return stuList;
   }

   /*
    * 학번 존재 확인 - 출결 등록 전에 학생이 존재하는지 체크해서 FK 오류 예방 반환값 boolean 존재하면 true 없으면 false
    * 
    */
   public boolean stuExists(int stuNumber) {
      String query = "SELECT STU_NUMBER FROM TBL_STUDENT WHERE STU_NUMBER = ?";

      try {
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1, stuNumber);

         resultSet = preparedStatement.executeQuery();

         if (resultSet.next()) {
            return true;
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
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
            e.printStackTrace();
         }
      }

      return false;

   }

}
