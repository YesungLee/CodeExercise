package com.hk.app;
import java.util.*;
public class Map2dex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 번호를 입력하세요 > ");
		int num = sc.nextInt();
		int arr[][] = new int[num][num];
		int n = 1, x = 0, y = 1;

		for (int i=0; i<num*num; i++) {
			if (arr[x][y] == 0) {
				arr[x][y] = n;
				x--;
				y++;
				
				if (x < 0) {
					x = 2;
				}
				if (y >= 3) {
					y = 0;
				}
			} else {
				x++;
				arr[x][y] = n;
				x--;
				y++;
				if (x < 0) {
					x = 2;
				}
				if (y >= 3) {
					y = 0;
				}
			}
			n++;
		}
		
		for (int i=0; i<num; i++) {
			for (int j=0; j<num; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
