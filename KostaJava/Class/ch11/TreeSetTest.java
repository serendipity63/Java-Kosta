package ch11;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(30);
		ts.add(150);

		System.out.println(ts); // 정렬
		TreeSet<Person> tsp = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.age > o2.age)
					return 1;
				else if (o1.age < o2.age)
					return -1;
				else
					return 0;
//				return o1.age - o2.age; // 나이순
			}
		});

		tsp.add(new Person("messi", 20));
		tsp.add(new Person("ronaldo", 10));
		tsp.add(new Person("ronaldojr", 50));
		tsp.add(new Person("son", 30));
		tsp.add(new Person("romero", 20));
		tsp.add(new Person("kim", 40));
		tsp.add(new Person("Park", 70));
		tsp.add(new Person("Lee", 60));
		System.out.println(tsp);
		SortedSet<Person> subList = tsp.subSet(new Person("", 20), new Person("", 60));
		System.out.println(subList); // 20대부터 60대까지 가져올거야 부분적으로 가져온다
	}

}
