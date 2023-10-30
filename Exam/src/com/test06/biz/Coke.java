package com.test06.biz;

public class Coke extends Drink {
	int COKE_PRICE = 50;

	public Coke() {
	}

	public Coke(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "코크";
	}

}
