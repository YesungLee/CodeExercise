package com.hk.app.game;

public class Leaner {
	
	int score;
	
	public String calculate() {
		if (score >= 60) return "pass";
		else return "fail";
	}
}
