package com.hk.app;
import java.util.*;
public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int avg[] = {85,79,83,80,78,75};
		int x = 0, y = 0, result = 0;;
		
		System.out.println("1~6반 중, 두 반의 반 번호를 입력하세요 > ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for (int i=0; i<avg.length; i++) {
			if(x == i+1) {
				x = avg[i];
			}
		}
		
		for (int i=0; i<avg.length; i++) {
			if(y == i+1) {
				y = avg[i];
			}
		}
		
		result = x+y;
		System.out.println("두 반의 평균 점수 합 : " + result);
	}

}
