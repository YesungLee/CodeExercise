package com.hk.app;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 100000, result;
		Scanner scan = new Scanner(System.in);
		System.out.print("구입할 수량을 입력하세요>");
		int x = scan.nextInt();
		if (x >=10) {
			result = x * price * 0.9;
		} else {
			result = x * price;
		}
		System.out.println("총 가격 : " + result);
	}

}
