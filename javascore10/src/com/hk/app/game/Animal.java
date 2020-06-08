package com.hk.app.game;

public class Animal extends Unit {
	String sound;
	int wing;
	int leg;
	Animal() {
		x=1;
		y=1;
		initPos();
		setSound("멍멍");
	}
	
	void setSound(String s) {
		sound = s;
	}
}
