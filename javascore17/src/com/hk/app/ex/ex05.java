package com.hk.app.ex;

import java.util.Iterator;
import java.util.LinkedList;

public class ex05 {

	public static void main(String[] args) {

		// 선언
		LinkedList lil = new LinkedList();

		// 초기 데이터 입력하기
		for (int i = 0; i < 100; i++) {
			lil.add(i + 1);
		}
		printlist(lil);

	}

	// 출력 메소드
	public static void printlist(LinkedList lil) {
		Iterator it = lil.iterator();
		int sum = 0;
		while (it.hasNext()) {
			if ((int) it.next() % 2 == 1)
				sum += (int) it.next();
		}
		System.out.println(sum);

	}

}
