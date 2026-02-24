package com.koreait.userDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1번 : DB연결
public class DBConnector {
	public static Connection getConnection() {
		// getConnetion() static 메소드를 만든다

		Connection connection = null;

		// 연결에 필요한 정보
		String userName = "hr";
		String password = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// URL은 정해져 있는 것(DBMS마다 다른 값을 넣는다)
		// JDBC로 연결할 때 구글링하면 나온다
		// URL주소 / 어디로 전달할래? URL을 정확하게 작성해야한다!!

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 이 부분이 문제없으면 메모리에 올라간다 -> 관리할 수 있게 된 것을 의미함
			// 커넥션 객체가 드라이버로 오게된다

			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 정보 오류");
		}

		return connection;

	}
}
