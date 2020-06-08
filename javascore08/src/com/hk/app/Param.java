package com.hk.app;

public class Param {

	public static void main(String[] args) {
		int x = 10, y = 20, r=0;
		r = Multiply(x,y);
		System.out.println(r);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
	
	private static int Multiply(int a, int b) {
		int result = a*b;
		a += 10;
		b += 20;
		return result;
	}
}
