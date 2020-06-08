package com.hk.app;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		JavaFunction(n);
	}
	public static void JavaFunction(int x) {
		for (int i=0; i<x; i++) {
			System.out.println("Java Function");
		}
	}
}
