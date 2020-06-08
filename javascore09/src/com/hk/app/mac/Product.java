package com.hk.app.mac;

public class Product {
	// 자판기 제품 가격
	final int red = 3000;
	final int yellow = 3500;
	final int brown = 4000;
	final int violet = 5000;
	
	// 투입된 금액
	int inMoney;
	
	public void enterMoney(int money) {
		inMoney = money;
	}
	
	// 구매 메소드
	public void buy(int kind) {
		
		switch(kind) {
		case 1:
			if(compute(red)==true) { System.out.println("1번 딸기맛");}
			break;
		case 2:
			if(compute(yellow)==true) { System.out.println("2번 바닐라맛");}
			break;
		case 3:
			if(compute(brown)==true) { System.out.println("3번 초코맛");}
			break;
		case 4:
			if(compute(violet)==true) { System.out.println("4번 블루베리맛");}
			break;
		default: System.out.println("잘못 선택");
		}
	}
	
	// 자판기 금액 차감 메소드
	public boolean compute(int money) {
		if(inMoney < money) {
			System.out.println("금액이 부족합니다.");
			return false;
		}
		else {
			inMoney -= money;
			return true;
		}
	}
	// 잔액 표시 메소드
	public void printMoney() {
		int temp = inMoney;
		int m10000 = 0;
		int m5000 = 0;
		int m1000 = 0;
		int m500 = 0;
		int m100 = 0;
		int m50 = 0;
		int m10 = 0;
		
		m10000 = temp / 10000;
		temp %= 10000;
		m500 = temp / 5000;
		temp %= 5000;
		m1000 = temp / 1000;
		temp %= 1000;
		m500 = temp / 500;
		temp %= 500;
		m100 = temp / 100;
		temp %= 100;
		m50 = temp / 50;
		temp %= 50;
		m10 = temp / 10;
		temp %= 10;
		System.out.println("거스름 돈 총 : " + inMoney + "원");
		System.out.println("10000원 : " + m10000);
		System.out.println("5000원 : " + m5000);
		System.out.println("1000원 : " + m1000);
		System.out.println("500원 : " + m500);
		System.out.println("100원 : " + m100);
		System.out.println("50원 : " + m50);
		System.out.println("10원 : " + m10);
		System.out.println("입니다.");
	}
}
