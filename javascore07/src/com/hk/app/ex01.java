package com.hk.app;

public class ex01 {

	public static void main(String[] args) {
		String[][] arr = new String[5][5];
		String star = "*";
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				arr[i][j] = star;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
