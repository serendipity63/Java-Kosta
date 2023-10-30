package ch7_1;

public class Ex19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	void buy(Product p) {
		// 1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드 종료
		if (money < p.price) {
			System.out.println("잔액 부족하여" + p.toString() + "을/를 살 수 없습니다.");
			return;
		}
		// 1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 뺴고
		money -= p.price;
		// 1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
		add(p);

	}

	void add(Product p) {
		if (i >= cart.length) {
			Product[] doubledCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, doubledCart, 0, cart.length);
			cart = doubledCart; // doubledCart는 지역변수니까 곧 없어질꺼라서 cart에 넣기
		}
		cart[i++] = p; //

	} // add(Product p)

	void summary() {
		// 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
		String prodItem = "";
		int totAmount = 0;
		for (int k = 0; k < i; k++) {
			prodItem += cart[k].toString() + " , ";
			totAmount += cart[k].price;
		} // 1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
			// 1.3 물건을 사고 남은 금액(돈)를 출력한다.
		System.out.println("구입한 물건 : " + prodItem);
		System.out.println("사용한 금액: " + totAmount);
		System.out.println("남은 금액: " + money);
	} // summary()
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}