package com.hk.app;

public class ParamByArray {

	public static void main(String[] args) {
		int score[] = {100, 60, 90, 70, 80};
		int sum = add(score);
		System.out.println(sum);
		
		
	}
	
	public static int add(int[] x) {
		int result = 0;
		for (int i=0; i<x.length; i++) {
			result += x[i];
		}
		return result;
	}

}
