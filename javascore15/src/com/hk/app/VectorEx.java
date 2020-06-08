package com.hk.app;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		// 벡터 클래스
		Vector book = new Vector();
		
		book.add("java");
		book.add("jsp");
		book.add("oracle");
		book.add("html");
		book.add("css");
		book.add(3, "javascript"); // 3번째 위치에 데이터를 추가 시킬 수 있음
		book.add(213);
		
		for (int i=0; i<book.size(); i++) System.out.println(book.get(i));
		System.out.println("총 갯수 : " + book.size());
		System.out.println("처음 값 : " + book.firstElement());
		System.out.println("마지막 값 : " + book.lastElement());
	}

}
