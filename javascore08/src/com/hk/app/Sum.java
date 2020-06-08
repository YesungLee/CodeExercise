package com.hk.app;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 200;
		System.out.println("1부터 200까지의 합 : " + summation(n));
		System.out.print("n의 값을 입력 하세요 > ");
		int n2 = sc.nextInt();
		System.out.println("1부터 " + n2 + "까지의 합 : " + summation(n2));
		
		int y = 1000;
		summation(y);
	}
	public static int summation(int x) {
		int result = 0;
		for (int i=1; i<=x; i++) {
			result += i;
		}
		return result;
	}
}