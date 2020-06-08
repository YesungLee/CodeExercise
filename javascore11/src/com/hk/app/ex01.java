package com.hk.app;

public class ex01 {
	int hour;
	int rate;
	int pay;
	
	// 생성자를 통해 시간과 단가를 초기화
	ex01() {
		hour = 0;
		rate = 10000;
	}
	
	// 페이 계산 함수
	int calPay(int hour, int rate) {
		pay = hour*rate;
		return pay;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(String id, String pw, int rate) {
		if (id == "admin" && pw == "8090") this.rate = rate; 
		else System.out.println("관리자만 변경 가능합니다.");
	}
	
	
}
