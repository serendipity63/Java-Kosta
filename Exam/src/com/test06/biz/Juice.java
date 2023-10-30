package com.test06.biz;

public class Juice extends Drink {
	int JUICE_PRICE = 200;

	public Juice() {
	}

	public Juice(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "주스";
	}

}
