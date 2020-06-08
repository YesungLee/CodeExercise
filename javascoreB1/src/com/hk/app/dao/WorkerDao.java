package com.hk.app.dao;

import java.sql.*;

public class WorkerDao {

	// 상태-변수(DB에 접속하는 id, pw, connnection...)
	// 공통적으로 사용하기에 static으로 선언
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "java";
	static String password = "1234";
	// DB 접속 리소스는 4개밖에 없다.
	static Connection conn = null; // 접속
	static Statement stmt = null;
	static ResultSet rs = null; // 결과
	static PreparedStatement pstmt = null;
	
	// 동작-메소드
	// [getconnect()-접속, dbclose()-종료] 같이 따라다님
	static void getconnect() {
		if (conn == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
			} catch(ClassNotFoundException e1) {
				System.out.println("드라이버 에러 : " + e1.getMessage());
			}
			catch(SQLException e2) {
				// System.out.println("접속 에러는 ?");
			}
		}
	}
	
	// 종료 메소드
	static void dbclose() {	
		if (conn != null) {
			try {
				conn.close();
				conn = null;}
			catch(SQLException e) { }
		}
		if (rs != null) {
			try {
				rs.close();
				rs = null;}
			catch(SQLException e) { }
		}
		if (stmt != null) {
			try {
				stmt.close();
				stmt = null;}
			catch(SQLException e) { }
		}
		if (pstmt != null) {
			try {
				pstmt.close();
				pstmt = null;}
			catch(SQLException e) { }
		}
	}
	
	// sql수행 메소드
	// 인원수 구하는 메소드
	public int getTotalWorker() {
		int rst = 0;
		getconnect(); // DB 접속
		try {
			stmt = conn.createStatement(); // 대부분의 에러는 여기서 많이 나옴
			String sql = "SELECT COUNT(*) AS TOTAL FROM WORKER";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				rst = rs.getInt("TOTAL");
			}
		} catch(SQLException e) {
			System.out.println("쿼리 에러 : " + e.getMessage());
		}
		dbclose(); // DB 종료 -> DB 접속과 DB 종료는 항상 해줘야함
		return rst;
	}
	
	// 로그인 체크 메소드
	public int checkLogin(String id, String pwd) {
		int rst = 0;
		getconnect(); // DB 접속
		try {
			
			// SQL 구문
			String sql = "SELECT COUNT(*) AS CNT FROM WORKER WHERE ID=? AND PWD=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); // 첫 번째 물음표에 id를 넣음
			pstmt.setString(2, pwd); // 두 번째 물음표에 pwd를 넣음
			rs = pstmt.executeQuery();
			if (rs.next()) {
				rst = rs.getInt("CNT"); // CNT에 있는 결과를 읽음
			}
		} catch(SQLException e) {
			System.out.println("쿼리 에러 : " + e.getMessage());
		}
		dbclose(); // DB 종료 -> DB 접속과 DB 종료는 항상 해줘야함
		return rst;
	}
	
	// 로그인 후 전화 번호 수정을 하기전에 아이디 체크 메소드
	public int idcheck(String id) {
		int rst = 0;
		getconnect();
		try {
			String sql = "SELECT COUNT(*) AS ID FROM WORKER WHERE ID = '" + id + "'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				rst = rs.getInt("ID");
			}
		} catch(SQLException e) {
			System.out.println("쿼리 에러 : " + e.getMessage());
		}
		dbclose();
		return rst;
	}
	
	// 핸드폰 번호 업데이트 메소드
	public int updatePhone(String id, String phone) {
		int rst = 0;
		getconnect(); // DB 접속
		try {
			String sql = "UPDATE WORKER SET PHONE ='"+ phone + "'WHERE ID ='" + id + "'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch(SQLException e) {
			System.out.println("쿼리 에러 : " + e.getMessage());
		}
		dbclose(); // DB 종료 -> DB 접속과 DB 종료는 항상 해줘야함
		return rst;
	}	
}
