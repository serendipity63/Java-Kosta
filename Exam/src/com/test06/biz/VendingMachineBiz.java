package com.test06.biz;

import com.test06.entity.IVendingMachineBiz;

public class VendingMachineBiz implements IVendingMachineBiz {
	int balance = 1000; // 현재잔액
	Drink[] cartList = new Drink[3]; // 구입목록 배열
	int count = 0; // 배열개수

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void cartDrink(Drink drink) {
		System.out.println(this.balance);

	}

	@Override
	public void printCart() {

	}

	@Override
	public void printDrinkList(Drink[] drinkList) {

	}

}
