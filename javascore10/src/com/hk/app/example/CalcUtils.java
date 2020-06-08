package com.hk.app.example;

public class CalcUtils {
	int left;
	int right;
	int third;
	
	void setOprands(int a, int b) {
		left = a;
		right = b;
	}
	void setOprands(int a, int b, int c) {
		left = a;
		right = b;
		third = c;
	}
	void sum() {System.out.println(left+right+third);}
	void avg() {
		if (third == 0) {
			System.out.println((left+right)/2);
		} else {
			System.out.println((left+right+third)/3);
		}
	}
	void substract() {System.out.println(left-right);}
	
}
