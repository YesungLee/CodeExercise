package com.hk.app;
import java.util.*;
public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 > ");
		double x = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 > ");
		double y = sc.nextInt();
		
		System.out.print("연산자를 선택하세요(+, -, *, /) > ");
		char op = sc.next().charAt(0);
		System.out.println("결과 값 : " + Cal(x,y,op));
	}
	
	public static double Cal(double a, double b, char op) {
		double result = 0;
		
		switch (op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a + b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			System.out.print("오류 연산자가 잘못되었습니다.");
		}
		return result;
	}
}
