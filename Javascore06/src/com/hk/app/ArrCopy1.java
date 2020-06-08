package com.hk.app;

public class ArrCopy1 {

	public static void main(String[] args) {
		int spc[] = {1,2,3,4,5};
		int des[] = new int[10];
		
		for (int i=0; i<spc.length; i++) {
			des[i] = spc[i];
		}
		
		for (int i=0; i<des.length; i++) {
			System.out.print(des[i] + " ");
		}
	}

}
