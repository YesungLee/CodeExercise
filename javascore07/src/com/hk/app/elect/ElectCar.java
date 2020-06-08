package com.hk.app.elect;

public class ElectCar {
	// 필드 - 상태
	String color; // 차량 색상
	int gear; // 기어
	float speed; // 속도
	int modelYear; // 연식

	// 메소드 - 행동
	void speedUp() { speed += 10.0; }
	void speedDown() { speed -= 10.0; }
	void gearChange(int g) { gear = g; }
	void brk() {
		while (true) {
			speed -= 30.0f;
			if (speed <= 0) {
				speed = 0.0f;
				break;
						}
		}
	}
}