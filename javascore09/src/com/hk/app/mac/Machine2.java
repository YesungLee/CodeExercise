package com.hk.app.mac;
import java.util.*;
public class Machine2 {

	public static void main(String[] args) {
		
		Product p = new Product();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("자판기 시작할까요?(1 : 예, 2 : 아니오)");
			int kind = sc.nextInt();
			if(kind == 2) {
				System.out.print("종료합니다.");
				break;
			}
			
			System.out.println("Welcome to 아이스크림 자판기");
			System.out.print("자판기에 넣을 금액을 입력하세요 > ");
			p.enterMoney(sc.nextInt());
			
			System.out.print("선택(1. 딸기(3000), 2. 바닐라(3500), 3. 초코(4000), 4.블루베리(5000), 5. 없음");
			p.buy(sc.nextInt());
			p.printMoney();
		}
	}

}
