package com.test06.entity;

import com.test06.biz.Drink;

public interface IVendingMachineBiz {
	public void cartDrink(Drink drink);

	public void printCart();

	public void printDrinkList(Drink[] drinkList);
}
