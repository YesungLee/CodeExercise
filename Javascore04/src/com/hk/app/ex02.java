package com.hk.app;

import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random num = new Random(); // Random 클래스 선언
		int result1, result2, result3;
		// choice1 : 시스템 선택, choice2 : 상대방 선택, choice3 : 플레이어 선택
		int choice1, choice2, choice3;
		String result4 = "";
		choice1 = (num.nextInt(49) + 1) % 3; // 50개의 구슬 중 랜덤한 숫자를 choice1에 저장
		
		// 상대방의 선택
		choice2 = num.nextInt(3); // 상대방의 선택을 choice2에 저장
		/*
		if (choice2 == 1) {
			result2 = 1;
		} else if (choice2 == 2) {
			result2 = 2;
		} else {
			result2 = 3;
		}
		*/
		
		// 플레이어의 선택
		// 플레이어의 선택을 입력 받기 위한 Scanner 클래스 선언
		Scanner scan = new Scanner(System.in);
		System.out.print("예상되는 구슬의 개수를 입력하세요 > ");
		choice3 = scan.nextInt() % 3; // 입력받은 구슬의 개수를 choice3의 저장
		/*
		if (choice3 % 3 == 1) {
			result3 = 1;
		} else if (choice2 % 3 == 2) {
			result3 = 2;
		} else {
			result3 = 3;
		}
		*/
		// 결과 비교
		/*
		if (choice1 % 3 == 1) {
			result1 = 1;
		} else if (choice1 % 3 == 2) {
			result1 = 2;
		} else {
			result1 = 3;
		}
		*/
		System.out.println("랜덤으로 뽑은 구슬의 개수 : " + choice1 + "개");
		System.out.println("시스템의 선택 : " + choice1 + "개");
		System.out.println("상대방의 선택 : " + choice2 + "개");
		System.out.println("나의 선택 : " + choice3 + "개");
		
		if (choice1 == choice2) {
			if (choice2 == choice3) {
				result4 = "무승부";
			} else
			result4 = "상대방 승리";
		} else if (choice1 == choice3) {
			result4 = "플레이어 승리";
		} else if (choice2 == choice3) {
			result4 = "무승부";
		} else {
			result4 = "무승부";
		}
		
		/*
		if (result1 == result2) {
			if (result2 == result3) {
				result4 = "무승부";
			} else
			result4 = "상대방 승리";
		} else if (result1 == result3) {
			result4 = "플레이어 승리";
		} else if (result2 == result3) {
			result4 = "무승부";
		}
		*/
		
		System.out.println(result4);
	}

}
