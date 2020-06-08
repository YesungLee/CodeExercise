package com.hk.app;

public class e03 {

	public static void main(String[] args) {
		String star = "*";
		for (int i=0; i<5; i++) {
			for (int k=0; k<i; k++) {
				System.out.print(" ");
				}
			for (int j=0; j<5-i; j++) {
				System.out.print(star);
				}
			System.out.println();
		}
	}

}
