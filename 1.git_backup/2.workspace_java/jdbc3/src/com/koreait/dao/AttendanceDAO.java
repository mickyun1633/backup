package com.koreait.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koreait.dto.AttendanceDTO;

/*
 * AttendanceDAO 역할
 * - 출석 테이블에 접근해서 SQL 실행
 * - 출결 등록(INSERT)
 * - 학생 + 출결(SELECT JOIN)
 * 
 * */

public class AttendanceDAO {
   
   public Connection connection;
   public PreparedStatement preparedStatement;
   public ResultSet resultSet;
   
   /*
    * 출결등록
    * - 출석 번호는 시퀀스로 생성
    * - 학번은 학생 테이블의 학번을 참조하는 FK라서 반드시 존재해야한다(NOT NULL)
    * - 날짜는 YYYY-MM-DD 문자열을 Date로 변환해서 넣는다
    * 
    * */
   
   public boolean atInsert(AttendanceDTO attDTO) {
      String query = "INSERT INTO TBL_ATTENDANCE " +
               "VALUES (SEQ_ATTENDANCE.NEXTVAL, ?, ?, ?)";
      int result = 0;
      
      try {
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1, attDTO.getStuNumber());
         preparedStatement.setDate(2, Date.valueOf(attDTO.getAttAdate()));
         preparedStatement.setString(3, attDTO.getAttStatus());
         result = preparedStatement.executeUpdate();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         System.out.println("atInsert() SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      return result > 0;
      
   }
   
   
   /* join 조회
    * - 학생(이름, 전공) + 출결정보(날짜, 상태) 한번에 보기 위해 join 사용
    * 반환값 List<String>
    * 
    * */
   
   public List<String> selectJoin(){
      String query = "SELECT s.stu_number, s.stu_name, s.stu_major, a.att_adate, a.att_status "
            + "FROM TBL_STUdent s JOIN tbl_attendance A "
            + "ON s.stu_number = a.stu_number";
      
      List<String> list = new ArrayList<>();
      
      try {
         connection = DBConnector.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()){
            String row = 
                  resultSet.getInt("STU_NUMBER") + " , " + 
                  resultSet.getString("STU_NAME") + " , " +
                  resultSet.getString("STU_MAJOR") + " , " +
                  resultSet.getDate("ATT_ADATE") + " , " +
                  resultSet.getString("ATT_STATUS");
            list.add(row);
                  
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return list;
   }
   
   
  
}

















