package com.hk.app;
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		myABS(n);
	}
	
	public static void myABS(int num) {
		if (num < 0) {
			num = -num;
		}
		System.out.println(num);
	}
}
