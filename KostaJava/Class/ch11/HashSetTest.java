package ch11;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(); // 중복허용x, 차례대로 들어가지 않는다.
		hs.add(234);
		hs.add(14);
		hs.add(45);
		hs.add(8);
		hs.add(11);
		hs.add(45);
		for (Integer n : hs) {
			System.out.println(n);
		}

		HashSet<Person> ahs = new HashSet<>();
		ahs.add(new Person("호날두", 37));
		ahs.add(new Person("메시", 35));
		ahs.add(new Person("음바페", 22));
		ahs.add(new Person("음바페", 25));
		ahs.add(new Person("메시", 35));

		for (Person p : ahs) {
			System.out.println(p);

		}

	}

}
