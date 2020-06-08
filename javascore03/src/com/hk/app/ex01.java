package com.hk.app;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	int apple = 123, a;
		if (apple % 10 == 0) {
			a = apple / 10;
		} else
			a = (apple / 10) + 1;
		System.out.println(a); */
		
		int apple = 123, a;
			a = (apple % 10 == 0)? apple / 10 : (apple/10)+1;
		System.out.println(a);
	}

}
