package com.hk.app;

public class Cast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 1.678f;
		int i = 0;
		i = (int)f;
		System.out.println(f);
		System.out.println(i);
		
		float f2 = 0.0f;
		int i2 = 10;
		f2 = i2;
		// 작은 수에서 큰 수로 변경 시 형 변환 생략이 가능
		System.out.println(f2);
		System.out.println(i2);

	}

}
