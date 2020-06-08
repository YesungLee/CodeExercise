package com.hk.app;

public class ex02 {

	public static void main(String[] args) {
		int no[] = new int[10];
		int x = 1, result = x;
		for (int i=0; i<no.length; i++) {
			no[i] = x;
		}
		for (int i=0; i<no.length; i++) {
			result = result + no[i] * no[i+1];
		}
		System.out.println(result);
	}

}
