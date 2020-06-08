package com.hk.app.game;

public class Cordi3d extends Cordi{
	
	int z;
	
	void where_are_you() {
		getCordi(); // Cordi를 상속받았으나 자기 자신 것을 출력
		super.getCordi(); // 상속받은 걸  출력
	}
	
	// override
	@Override
	String getCordi() {
		return "("+ r + "," + c + "," + z + ")";
	}
}
