package com.hk.app;
import java.util.Scanner;
public class Keybrd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // scanner 객체 생성
		
		// 문자열 입력 받음
		System.out.print("영문 아이디를 입력하세요. > ");
		String id = scan.nextLine();
		
		// 정수 입력 받음
		System.out.print("토익 점수를 입력하세요. > ");
		int score = scan.nextInt();
		
		// 출력
		System.out.println("아이디\t토익점수");
		System.out.println("---------------");
		System.out.println(id + "\t" + score);
	}

}
