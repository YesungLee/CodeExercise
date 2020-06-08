package com.hk.app.example;

import java.util.*;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=0; i<10; i++) {
			int n = (int)(Math.random()*10);
			try {
				double result = num / n;
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("계산 불가능");
			}
		} 
	}

}
