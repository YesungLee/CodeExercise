package com.hk.app.example;
import java.util.*;
public class ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String english = sc.nextLine();
		int consonant = 0, vowel = 0, vacumm = 0; // 자음, 모음, 공백의 개수를 저장할 변수 선언
		
		for (int i=0; i<english.length(); i++) {
			if (english.charAt(i) == 'a' ||
				english.charAt(i) == 'i' ||
				english.charAt(i) == 'u' ||
				english.charAt(i) == 'e' ||
				english.charAt(i) == 'o') vowel++;
			else consonant++;
			if (english.charAt(i) == ' ') vacumm++;
		}
		consonant -= vacumm;
		System.out.println("입력한 문장 : " + english);
		System.out.println("자음 개수 : " + consonant);
		System.out.println("모음 개수 : " + vowel);
		System.out.println("공백의 개수 : " + vacumm);
	}

}
