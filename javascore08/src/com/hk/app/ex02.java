package com.hk.app;
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		gugudan(n);
	}
	
	public static void gugudan(int dan) {
		for (int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
}
