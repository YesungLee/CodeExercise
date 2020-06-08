package com.hk.app.example;

public class NewCalcUtils extends CalcUtils {
	
	void avg2() { 
		avg();
	}
	
	void avg() {
		System.out.println((double)(left+right)/2);
	}
	
	public static void main(String[] args) {
		
		CalcUtils c2 = new CalcUtils();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg();
		c2.substract();
	}
}
