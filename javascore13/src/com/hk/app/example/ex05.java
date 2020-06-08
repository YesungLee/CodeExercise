package com.hk.app.example;
import java.util.*;
public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String hangul = sc.nextLine();
		String text = sc.nextLine();
		String[] n = hangul.split(text);
		int answer = 0;
		for (int i=1; i<n.length; i++) {
			answer++;
		}
		System.out.println(hangul);
		System.out.println(text);
		System.out.println(answer);
		
	}
}
