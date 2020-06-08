package com.hk.app.elect;

public class TestElect {

	public static void main(String[] args) {
		Tv mtv = new Tv(); // Tv 클래스 선언하여 mtv 생성
		mtv.chgChn(10);
		System.out.println("현재 채널 : " + mtv.chn);
		mtv.volUp();
		System.out.println("현재 볼륨 : " + mtv.vol);
		mtv.col = "레드";
		System.out.println("TV 색상 : " + mtv.col);
		System.out.println();
		System.out.println();
		System.out.println();
		//
		ElectCar scar = new ElectCar();
		ElectCar etruck = new ElectCar();
		scar.color = "Gray";
		scar.gearChange(2);
		System.out.println("현재 기어 : " + scar.gear);
		System.out.println("현재 차량의 속도 : " + scar.speed);
		scar.speed = 50;
		System.out.println("현재 차량의 속도 : " + scar.speed);
		scar.brk();
		System.out.println("브레이크 > " + scar.speed);
		
		etruck.modelYear = 2012;
		etruck.color = "Silver";
		System.out.println("트럭의 연식 : " + etruck.modelYear);
		System.out.println("트럭의 색상 : " + etruck.color);
	}

}
