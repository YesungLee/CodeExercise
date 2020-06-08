package com.hk.app;
import java.util.Scanner; // Scanner 클래스 불러오기
public class triple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("0~100 중 숫자를 입력하세요.");		
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성
		int score = scan.nextInt(); // 키보드로 입력한 숫자를 score에 저장
		String result = (score>60) ? "pass" : "fail"; // s가 60 초과이면 pass
		System.out.println(result); // 결과 값 출력
	}

}
