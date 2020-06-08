package com.hk.app;

public class Arr2Score {

	public static void main(String[] args) {
		int score[][] = { {100,100,100},
						{50,50,50},
						{70,70,70},
						{80,80,80},
						{60,60,60} };
		int x = 2;
		for (int i=0; i<3; i++) {
			System.out.println(score[x][i]);
			}
		System.out.println();
		
		// 전체 출력
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[0].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}
