package com.hk.app;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>");
		x = scan.nextInt();
		String result = (x>=0) ? "양수" : "음수";
		System.out.println(result);
	}

}
