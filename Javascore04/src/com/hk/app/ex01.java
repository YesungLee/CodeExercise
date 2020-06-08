package com.hk.app;

import java.util.Random;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random num = new Random(); // Random 클래스 생성
		int a = num.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
