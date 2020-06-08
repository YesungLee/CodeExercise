package com.hk.app;

public class StringMethod2 {

	public static void main(String[] args) {
		
		String article = "Court begins process to sell assets"
				+ "of Japanese firm involved "
				+ "in wartime forced labor";
		String[] arr = article.split(" ");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String test = "010-9355-1234|김천사|kimha";
		String[] a = test.split("|");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println(article.substring(38, 46));
		
		int start = article.indexOf("J");
		int end = start + 8;
		String result = article.substring(start, end);
		System.out.println(result);
	}

}
