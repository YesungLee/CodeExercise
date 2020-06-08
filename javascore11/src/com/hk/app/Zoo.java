package com.hk.app;

public class Zoo {

	public static void main(String[] args) {
		
		System.out.println("환영합니다.");
		System.out.println("--------------");
		
		Animal lion = new Animal();
		System.out.println("사자다리 : " + lion.getLeg());
		
		lion.setMyFood("햄버거");
		System.out.println("사자가 좋아하는 음식 : " + lion.getFood());
	}

}
