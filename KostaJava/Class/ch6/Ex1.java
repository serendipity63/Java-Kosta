package ch6;

class SutdaCard {
	int num = 1;
	boolean isKwang = true;

	String info() { // method
		return num + (isKwang ? "K" : "");
	}

}

public class Ex1 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard();
		card1.num = 3;
		card1.isKwang = false;
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
