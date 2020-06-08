package com.hk.app;

public class Pita {

	public static void main(String[] args) {
		// 피타고라스의 정리
		int a = 4;
		int b = 3;
		System.out.println("빗변의 길이 : " + distance(a,b));
		
		int x = 40;
		int y = 20;
		System.out.println("빗변의 길이 : " + distance(x,y));
	}
	// 피타고라스 거리 구하는 공식
	// public - 어디서든 사용 가능, static - 수학적인 공식
	public static double distance(int a,int b) {
		double result = 0.0d;
		result = Math.sqrt(a*a + b*b);
		return result; // result를 반환	
	}
}
