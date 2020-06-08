package com.hk.app.dice;
import java.util.*;
public class Dices {
	// 상태
	static int width=3;
	int faceValue1;
	int faceValue2;
	
	// 행동
	void roll() {
		Random rnd = new Random();
		faceValue1 = rnd.nextInt(6)+1;
		faceValue2 = rnd.nextInt(6)+1;
	}
	
	int getDice1() {
		return faceValue1;
	}
	
	int getDice2() {
		return faceValue2;
	}
}
