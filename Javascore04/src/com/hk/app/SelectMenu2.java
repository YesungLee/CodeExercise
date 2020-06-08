package com.hk.app;

import java.util.Scanner;

public class SelectMenu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "선택안함";
		Scanner scan = new Scanner(System.in);
		System.out.print("먹고 싶은 메뉴는? 1~4 > ");
		int menu = scan.nextInt();
		
		switch (menu) {
		case 1:
			result = "중식";
			break;
		case 2:
			result = "일식";
			break;
		case 3:
			result = "양식";
			break;
		case 4:
			result = "스파게티";
			break;
		default:
			result = "선택안함";
			break;
		}
		System.out.println("오늘의 저녁 메뉴 : " + result);
	}

}
