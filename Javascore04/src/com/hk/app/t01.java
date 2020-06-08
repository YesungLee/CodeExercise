package com.hk.app;

public class t01 {

	public static void main(String[] args) {
		String result1 = "니", result2 = "니", result3 = "니";
		String result4 = "";
		
		if (result1 == result2) { // 시스템과 상대방의 선택이 동일하면
			if (result2 == result3) { // 시스템과 상대방의 선택이 동일하면 플레이어의 선택  같은지 한 번 더 비교
				result4 = "시스템 에러"; // 시스템, 상대방, 플레이어의 선택이 모두 동일하면 무승부
			} else {
				result4 = "상대방 승리";
			}
		}
		System.out.println(result4);
		}
}