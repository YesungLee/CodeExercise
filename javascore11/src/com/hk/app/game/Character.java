package com.hk.app.game;

public abstract class Character {
	
	int x;
	int y;
	int z;
	
	// 추상 메소드 - { } 대신 abstract를 붙인다.
	abstract void move(int x, int y, int z);
	
	// 파일종류 - docx, jpg, txt - save();
}
