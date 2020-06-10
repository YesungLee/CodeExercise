package com.hk.app;

import java.sql.*;

public class MemberReg {

	static String url ="jdbc:oracle:thin:@localhost:1521:xe";
	static String user="java";
	static String password="1234";
	
	static Connection conn = null;
	static Statement stmt = null;
	
	public static void main(String[] args) {

		// jdbc 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO MEMBER \r\n" + 
					"(ID, PWD, NAME, GENDER, REGDATE)\r\n" + 
					"VALUES \r\n" + 
					"('kimgun', '1234', '김건우', 'm', sysdate)"; //;
			int success = stmt.executeUpdate(sql);
			System.out.println("접속성공="+success);
			
		}catch(ClassNotFoundException e  ) {
			System.out.println("드라이버 로딩실패");
		}catch(SQLException e2) {
			System.out.println("접속실패"+e2.getMessage());
		}
			
	}

}
