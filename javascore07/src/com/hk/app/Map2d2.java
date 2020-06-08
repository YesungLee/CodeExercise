package com.hk.app;

public class Map2d2 {

	public static void main(String[] args) {
		int n = 3;
		int arr[][] = new int[n][n];
		int a = 1, x = 0, y = n/2;

		for (int i=0; i<(n*n); i++) {
			arr[x][y] = a;
			if (a%n == 0) {
				x++;
			} else {
				x--;
				y++;
				if (x<0) {
					x = n - 1;
				}
				if (y>=n) {
					y = 0;
				}
			}
			a++;
		}
				
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" " + arr[i][j] + " ");
				} else {
				System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
