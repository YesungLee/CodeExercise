package com.hk.app;

public class ExceptMethod {

	public static void main(String[] args) {

		ExceptMethod test = new ExceptMethod();
		try {
			test.loadJDBC();
		} catch(ClassNotFoundException e) {
			e.printStackTrace(); // 단계별로 에러 메시지를 출력
		}
	}
	
	// 드라이버 로딩
	public void loadJDBC() throws ClassNotFoundException { // 예외처리를 하여 try-catch를 안 쓰게 할 수 있음
		
		// 예외 발생 가능 예측 가능
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}

}
