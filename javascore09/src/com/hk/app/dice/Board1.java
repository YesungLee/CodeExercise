package com.hk.app.dice;

public class Board1 {

	public static void main(String[] args) {
		Dices myDices = new Dices();
		myDices.roll();
		System.out.println("첫 번째 주사위 : " + myDices.faceValue1);
		System.out.println("두 번째 주사위 : " + myDices.faceValue2);
		System.out.println("두 수의 합 : " + (myDices.faceValue1 + myDices.faceValue2));
		System.out.println("첫 번째 주사위 : " + myDices.getDice1());
		System.out.println("두 번째 주사위 : " + myDices.getDice2());
		System.out.println("두 수의 합 : " + (myDices.getDice1() + myDices.getDice2()));
	}

}
