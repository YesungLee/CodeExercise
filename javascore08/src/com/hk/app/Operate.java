package com.hk.app;

public class Operate {
	// 상태
	int sum; // iv -> 인스턴스 변수
	int count; // iv
	int avg; // iv
	
	static int max; // cv
	static int min; // cv
	
	// 지역 변수 lv
	private static double plus(double f, double s) {
		double r = f + s; // lv
		return r;
	}
		
	private static double minus(double f, double s) {
		double r = f - s; // lv
		return r;
	}
		
	private static double mul(double f, double s) {
		double r = f * s; // lv
		return r;
	}
		
	private static double div(double f, double s) {
		double r = f / s; // lv
		return r;
	}
		
	private static double pow(double f, double s) {
		double r = 1;
		for(int i=0; i<(int)s; i++) {
			r = r * s;
		}
		return r;
	}
}
