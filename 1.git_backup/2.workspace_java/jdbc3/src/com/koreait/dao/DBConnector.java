package com.koreait.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
		   public static Connection getConnection() {

		      Connection connection = null;

		      // 연결에 필요한 정보
		      String userName = "kdt";
		      String password = "1234";
		      String url = "jdbc:oracle:thin:@localhost:1521:xe";
		      // jdbc url 구글링하면 다 나옴
		      // url은 주소/어디로 전달할래

		      try {
		         // 드라이버를 메모리에 할당
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         // 문제가 없으면 getConnection객체에 정보를 알려준다(url, userName, password)
		         connection = DriverManager.getConnection(url, userName, password);
		         // SQLException 연결 정보가 잘 못 되었을 때 연결 정보 예외
		         System.out.println("연결성공");
		      } catch (ClassNotFoundException e) {
		         // TODO Auto-generated catch block
		         System.out.println("드라이버 로딩 실패");
		         e.printStackTrace();
		      } catch (SQLException e) {
		         // TODO Auto-generated catch block
		         System.out.println("연결 정보 오류");
		         e.printStackTrace();
		      }

		      return connection;

		   }
		}

	
	
	

