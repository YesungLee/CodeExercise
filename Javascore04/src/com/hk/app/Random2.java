package com.hk.app;

public class Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = Math.random(); // Math 클래스 생성
		System.out.println("임의의 실수 숫자 : " + num);
		
		// 0~9
		double num2 = num * 10;
		int num3 = (int)num2;
		System.out.println("0~9까지의 숫자 : " + num3);
		
		// 주사위 : 1~6
		double num4 = num * 6;
		int num5 = (int)num4 + 1;
		System.out.println("1~6까지의 숫자 : " + num5);
	}

}
