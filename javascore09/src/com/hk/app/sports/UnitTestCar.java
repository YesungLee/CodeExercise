package com.hk.app.sports;

public class UnitTestCar {

	public static void main(String[] args) {
		// 기본 생성자로 redcar
		Car redcar = new Car();
		redcar.color = "red";
		
		// 일반 생성자로 bluecar(색상 블루)
		Car bluecar = new Car("blue");
		
		// 일반 생성자로 graycar(색상 그레이, 기어 수동)
		Car graycar = new Car("gray", false);
		
		// 일반 생성자로 blackcar(색상 블랙, 기어 오토, 문 2개)
		Car blackcar = new Car("black", true, 2);
		
		System.out.println(redcar.color);
		System.out.println(bluecar.color);
		System.out.println(graycar.color);
		System.out.println(graycar.gear);
		System.out.println(blackcar.color);
		System.out.println(blackcar.gear);
		System.out.println(blackcar.door);
	}

}
