package com.hk.app;

// 탈 것의 핸들
public interface Handle {
	
	final int max = 10;

	public void moveLeft();
	public void moveRight();
	
	public void pullIn();
	public void putOut();
}
