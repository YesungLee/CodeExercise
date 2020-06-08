package com.hk.app;

public class e01 {

	public static void main(String[] args) {
		String star = "*";
		for (int i=0; i<5; i++) {
			for (int k=i; k<4; k++) {
				System.out.print(" ");
				}
			for (int j=0; j<=i; j++) {
				System.out.print(star);
				}
			System.out.println();
		}
	}

}
