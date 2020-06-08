package com.hk.app;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random zen = new Random(); // Random 클래스
		// 임의의 숫자
		int anynum = zen.nextInt();
		System.out.println("임의의 숫자 : " + anynum);
		
		// 0~9
		int num1 = zen.nextInt(10);
		System.out.println("0~9까지의 임의의 숫자 : " + num1);
		
		// 1~10
		int num2 = zen.nextInt(10) + 1;
		System.out.println("1~10까지의 임의의 숫자 : " + num2);
		
		// 주사위 눈 1~6
		int num3 = zen.nextInt(5) + 1;
		System.out.println("1~6까지의 임의의 숫자 : " + num3);
	}

}
