package com.hk.app;

import java.util.Scanner;

public class SelectMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "선택안함";
		Scanner scan = new Scanner(System.in);
		System.out.print("먹고 싶은 메뉴는? 1~4 > ");
		int menu = scan.nextInt();
		
		if (menu == 1) {
			result = "중식";
		} else if (menu == 2) {
			result = "일식";
		} else if (menu == 3) {
			result = "양식";
		} else if (menu == 4) {
			result = "스파게티";
		} else {
			result = "선택안함";
		}
		System.out.println("오늘의 저녁 메뉴 : " + result);
	}

}
