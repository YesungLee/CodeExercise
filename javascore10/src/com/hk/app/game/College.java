package com.hk.app.game;

public class College extends Leaner {
	
	int toeic;
	College() {
		super(); // 부모의 생성자를 호출할 때(제일 먼저 쓰여야 함)
		toeic = 600;
	}
	
	void test() { super.calculate(); }
	
	public String calculate() { // 리턴타입, 함수명, 매개변수 갯수, 타입
		String grade = "D";
		if (score >= 90) grade = "A";
		else if (score >= 80) grade = "B";
		else if (score >= 70) grade = "C";
		return grade;
	}
}
