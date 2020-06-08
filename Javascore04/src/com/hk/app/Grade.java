package com.hk.app;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		String grade = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("과학 점수를 입력하세요> ");
		score = scan.nextInt();
		
		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) {
				grade += "+";
			}
		} else {
			grade = "재시험";
		}
		System.out.println("시험 결과 : " + grade);
	}

}
