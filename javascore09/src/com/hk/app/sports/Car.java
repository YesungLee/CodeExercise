package com.hk.app.sports;

public class Car {
	// 상태 - 인스턴스 변수
	String color;
	boolean gear; // true=auto, false=stick
	int door; // 문의 개수
	
	// 생성자 - 변수 초기화 함수
	Car() {}
	Car(String c) {color = c;}
	Car(String c, boolean g) {color = c; gear = g;}
	Car(String c, boolean g, int d) {color = c; gear = g; door = d;}
	
	// 메소드, 동작 - 인스턴스 함수 메소드
}
