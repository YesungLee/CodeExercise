package com.hk.app;

// 초기화 방법
public class InitVari {
	// 인스턴스 변수
	int x;
	int door = 4;
	int[] map = new int[10];
	{ // 초기화 블럭
		for(int i=0; i<10; i++) {
			map[i] = i;
		}
		door = 3; // 초기화 블럭
	}
	
	// InitVari() { } --> 생성자를 알아야 하는 이유
	
	// 인스턴스 메소드
	public void print(int a) {
		int lv = 10;
		System.out.println(lv+a);
	}
}
