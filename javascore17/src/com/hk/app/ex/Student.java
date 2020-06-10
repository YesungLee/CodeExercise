package com.hk.app.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		int eng, chn, total, avg;

		ArrayList al = new ArrayList();

		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + "번째 학생의 이름 : ");
			name = sc.next();
			al.add(name);
			System.out.print(i + 1 + "번째 학생의 영어 점수 : ");
			eng = sc.nextInt();
			al.add(eng);
			System.out.print(i + 1 + "번째 학생의 중국어 점수 : ");
			chn = sc.nextInt();
			al.add(chn);
			total = eng + chn;
			avg = total / 2;
			al.add(total);
			al.add(avg);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 학생의 이름 : " + al.get(i * 5));
			System.out.println("총점 : " + al.get(i * 5 + 3));
			System.out.println("평균 : " + al.get(i * 5 + 4));
		}
	}
}
