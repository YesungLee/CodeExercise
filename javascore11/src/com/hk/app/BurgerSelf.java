package com.hk.app;

public class BurgerSelf extends FoodSelf {
	
	boolean idSet; // 세트 메뉴 여부
	String side; // 사이드 메뉴
	String drink; // 음료수 메뉴
	
	// 세트가 아닌 경우 초기화 생성자
	BurgerSelf() {
		name = null;
		price = 0;
	}
	/*
	// 가격 변경 함수
	void setPrice() {
		if (idSet == false) BurgerSelf();
		else price = price*0.8;
	}
	*/
	
}
