package com.hk.app;

public class StringMethod {

	public static void main(String[] args) {
		
		String name = "Smith"; // S m i t h
		char guess = name.charAt(0);
		System.out.println(guess);
		
		String test = name.substring(1, 4); // 시작 값(1번째)부터 끝 값(4번째)까지 출력
		System.out.println(test);
		
		String text = "Today Star Coffee Travel";
		String[] result = text.split(" ");
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
