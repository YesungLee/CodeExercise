package com.hk.app;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lb, kg;
		System.out.print("파운드를 입력하세요 >");
		Scanner scan = new Scanner(System.in);
		lb = scan.nextDouble();
		kg = lb * 0.45359237;
		System.out.println(lb + "lb는 " + kg + "kg");
		
	}

}
