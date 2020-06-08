package com.hk.app;

public class UnitTestDal {

	public static void main(String[] args) {
		Dalmuti king = new Dalmuti();
		king.kind = 1;
		
		Dalmuti minister = new Dalmuti();
		Dalmuti minister2 = new Dalmuti();
		minister.kind = 2;
		
		Dalmuti[] leader = new Dalmuti[3];
		leader[0] = new Dalmuti();
		leader[0].kind = 3;
		
		Dalmuti Baron = new Dalmuti(4);
	}

}
