package com.hk.app;
import java.util.Scanner; // scanner 클래스 불러오기
public class Keybrd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // scanner 객체 생성
		System.out.println("섭씨온도를 입력하시오 > ");
		double c = scan.nextDouble();
		double f;
		f = 9.0/5.0 * c + 32; // 섭씨 온도를 화씨 온도로 변환시켜주는 공식
		System.out.println("화씨 온도 : " + f); // 화씨 온도 출력
	}

}
