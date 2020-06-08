package com.hk.app;
import java.util.*;
public class Calculate2 {

	public static void main(String[] args) {
		Operate m = new Operate();
		Scanner sc = new Scanner(System.in);
		double result = 0.0d;
		System.out.print("첫 번째 수를 입력하세요 > ");
		double x = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 > ");
		double y = sc.nextInt();
		
		System.out.print("연산자를 선택하세요(+, -, *, /) > ");
		char op = sc.next().charAt(0);
		
		System.out.print("결과 : " + result);
		
		switch (op) {
		case '+':
			result = plus(x,y);
			break;
		case '-':
			result = minus(x,y);
			break;
		case '*':
			result = mul(x,y);
			break;
		case '/':
			result = div(x,y);
			break;
		case '&':
			result = pow(x,y);
			break;
		default:
			System.out.println("연산자 오류");
			return;
		}
	}
	// 지역 변수
	private static double plus(double f, double s) {
		double r = f + s;
		return r;
	}
	
	private static double minus(double f, double s) {
		double r = f - s;
		return r;
	}
	
	private static double mul(double f, double s) {
		double r = f * s;
		return r;
	}
	
	private static double div(double f, double s) {
		double r = f / s;
		return r;
	}
	
	private static double pow(double f, double s) {
		double r = 1;
		for(int i=0; i<(int)s; i++) {
			r = r * s;
		}
		return r;
	}
}
