package com.hk.app;

import java.util.ArrayList;

public class GenericEx {

	public static void main(String[] args) {

		ArrayList arrbox = new ArrayList();
		arrbox.add("테니스");
		arrbox.add("야구");
		
		// 가져오기
		String sports = (String) arrbox.get(0); // 형 변환을 해줘야 함
		
		
	}

}
