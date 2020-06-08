package com.hk.app;

public class ArrCopy2 {

	public static void main(String[] args) {
		int src[] = {1,2,3,4,5};
		int des[][] = new int[5][5];
		
		for (int i=0; i<5; i++) {
			des[2][i] = src[i];
		}
		
		for (int i=0; i<5; i++) {
			des[i][4] = src[i];
		}
		
		for (int r=0; r<des.length; r++) {
			for (int c=0; c<des[0].length; c++) {
			System.out.print(des[r][c] + " ");
			}
			System.out.println();
		}
	}

}
