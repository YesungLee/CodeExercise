package com.hk.app.example;

import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		
		int n;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 > ");
			try {
				n = sc.nextInt();
				System.out.println("입력값 : " + n);
				break;
				}
			catch(InputMismatchException e) {
				System.out.println("입력한 값은 정수가 아닙니다.");
				continue;
				}
		}
	}

}
