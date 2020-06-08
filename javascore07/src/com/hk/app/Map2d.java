package com.hk.app;
import java.io.IOException;
public class Map2d {

	public static void main(String[] args) {
		int map[][] = new int[5][5];
		int k = 1;
		
		for (int r=0; r<5; r++) {
			for (int c=0; c<5; c++) {
				map[r][c] = k;
				k++;
			}
		}
		
		for (int y=0; y<5; y++) {
			if (y % 2 == 0) {
				for (int x=0; x<5; x++) {
				 	if (map[y][x] <=9) {
						System.out.print(map[y][x] + "  ");
					} else {
						System.out.print(map[y][x] + " ");
					}
				}
			} else {
				for (int x=4; x>=0; x--) {
					if (map[y][x] <=9) {
						System.out.print(map[y][x] + "  ");
					} else {
						System.out.print(map[y][x] + " ");
					}
				}
		}
			System.out.println();
		}
	}
}
