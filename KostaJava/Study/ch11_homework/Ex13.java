package ch11_homework;

import java.util.Comparator;
import java.util.TreeMap;

public class Ex13 {
	public static void main(String args[]) throws Exception {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		Player[] pArr = { new Player("타짜", deck.pick(), deck.pick()), new Player("고수", deck.pick(), deck.pick()),
				new Player("물주", deck.pick(), deck.pick()), new Player("중수", deck.pick(), deck.pick()),
				new Player("하수", deck.pick(), deck.pick()) };

		TreeMap<Player, Integer> rank = new TreeMap<>(new Comparator<>() {
			public int compare(Player o1, Player o2) { // descending
				return o2.point - o1.point; // 포인트 1위가 1위

			};

		});
		for (int i = 0; i < pArr.length; i++) {
			Player p = pArr[i];
			rank.put(p, deck.getPoint(p));
			System.out.println(p + " " + deck.getPoint(p)); //
		}
		System.out.println();
		System.out.println("1위는 " + rank.firstKey() + "입니다.");
	}
}