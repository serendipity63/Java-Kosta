package ch7_homework;

class SutdaDeck {
	final int CARD_NUM = 20; //
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() { // 10까지 돌리고 2개씩 세팅 // 배열SutdaCard 초기화
		int length = CARD_NUM / 2;
		for (int i = 0; i < length; i++) {
			if ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 8) {
				cards[i] = new SutdaCard(i + 1, true);

			} else {
				cards[i] = new SutdaCard(i + 1, false);
			}

			cards[10 + i] = new SutdaCard(i + 1, false);

		}
	}

	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int idx1 = (int) (Math.random() * 20);
			int idx2 = (int) (Math.random() * 20);

			SutdaCard temp = cards[idx1];
			cards[idx1] = cards[idx2];
			cards[idx2] = temp;
		}

	}

	SutdaCard pick(int index) {
		return cards[index]; // 섯다카드 배열의 카드의

	}

	SutdaCard pick() {
		int idx = (int) (Math.random() * 20);
		return cards[idx]; // 랜덤카드 고른다

	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0)); // 섞지 않았을때 처음값
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));// 섞은다음에 0번째
	}
}