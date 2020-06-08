package com.hk.app.game;

public class Exami extends Leaner {
	
	void test() { calculate(); }
	
	public String calculate() {
		if (score >= 80) return "pass";
		else return "fail";
	}
}
