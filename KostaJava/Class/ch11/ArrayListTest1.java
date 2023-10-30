package ch11;

import java.util.ArrayList;

class Person implements Comparable<Person> {
	String name;
	int age;

	Person() {

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(" + name + "," + age + ")";

	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name); // 정렬의 기준 이름순
		// return age-o.age;//나이순
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false)
			return false;
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age; // 같은 이름과 나이는 거른다. 하나만이 아니라 둘다 같아야함
	}

	@Override
	public int hashCode() { // 이게 뭘 하는지?
		return name.hashCode() + age;
	}

}

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		int n = (Integer) al.get(0);

		Integer in = 200;
		int in2 = in; // unboxing

		ArrayList al2 = new ArrayList();
		al2.add(new Person());
		Person p = (Person) al2.get(0);

		ArrayList<Person> a13 = new ArrayList<>();
		a13.add(new Person());
		Person p2 = a13.get(0);

	}

}
