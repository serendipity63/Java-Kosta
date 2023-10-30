package ch7_homework;

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	// Product(){}<1번째 방법 이게 더 선호됨

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(0); // 이거도 정답
	}

	public String toString() {
		return "Tv";
	}
}

public class Ex5 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
