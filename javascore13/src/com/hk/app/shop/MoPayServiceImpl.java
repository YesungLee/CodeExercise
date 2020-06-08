package com.hk.app.shop;

public class MoPayServiceImpl implements PayService {

	@Override
	public void payByCard() {
		System.out.println("카드 결제");
	}

	@Override
	public void payByMilege() {
		System.out.println("적립금 결제");
	}

	@Override
	public void payByMoney() {
		System.out.println("계좌이체");
	}

	

}
