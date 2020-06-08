package com.hk.app;

import java.util.*;

public class TripleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random num = new Random(); // Random 클래스 선언
		// choice1 : 시스템 선택, choice2 : 상대방 선택, choice3 : 플레이어 선택
		int choice1, choice2, choice3;
		String result = "";
		choice1 = (num.nextInt(49) + 1) % 3; // 50개의 구슬 중 랜덤한 숫자를 choice1에 저장
		
		// 상대방의 선택
		choice2 = num.nextInt(3); // 상대방의 선택을 choice2에 저장
				
		// 플레이어의 선택
		// 플레이어의 선택을 입력 받기 위한 Scanner 클래스 선언
		Scanner scan = new Scanner(System.in);
		System.out.print("50이하의 예상되는 구슬의 개수를 입력하세요 > ");
		choice3 = scan.nextInt() % 3; // 입력받은 구슬의 개수를 choice3의 저장
		
		// 시스템, 상대방, 플레이어의 선택 공개
		System.out.println("랜덤으로 뽑은 구슬의 개수 : " + choice1 + "개");
		System.out.println("시스템의 선택 : " + choice1 + "개");
		System.out.println("상대방의 선택 : " + choice2 + "개");
		System.out.println("나의 선택 : " + choice3 + "개");
		
		// 결과처리
		if (choice1 == choice2) { // 시스템과 상대방의 선택이 동일하면
			if (choice2 == choice3) { // 시스템과 상대방의 선택이 동일하면 플레이어의 선택  같은지 한 번 더 비교
				result = "무승부"; // 시스템, 상대방, 플레이어의 선택이 모두 동일하면 무승부
			} else
			result = "상대방 승리";
		} else if (choice1 == choice3) {
			result = "플레이어 승리";
		} else {
			result = "무승부";
		}
		System.out.println(result);
	}

}
