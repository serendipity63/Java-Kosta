package ch11_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Human implements Comparable<Human> { // 6번 참고 compareto 만들고 끝
	String id;
	String name;
	int age;
	String address;

	Human(String id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%d,%s", id, name, age, address);
	}

	@Override
	public int compareTo(Human o) { // id 기준으로 정렬
		int ret = name.compareTo(o.name);
		if (ret == 0) {
			ret = o.age - age; // 이름이 같으면 나이 많은 순서로 7번 참고
		}
		return ret;
	}
}

public class Ex5 {
	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<>();
		list.add(new Human("000123", "홍길동", 24, "서울시 금천구"));
		list.add(new Human("000523", "홍길동", 28, "서울시 강남구"));
		list.add(new Human("931216", "김길동", 30, "경기도 광명시"));
		list.add(new Human("156456", "박길동", 37, "서울시 강서구"));
		list.add(new Human("045464", "차길동", 31, "경기도 과천시"));
		list.add(new Human("047464", "안자바", 22, "서울시 송파구"));

		Collections.sort(list);
		Iterator<Human> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}

//김자바,1,3,80,80,90,250,83.3 
//남궁성,1,2,90,70,80,240,80.0 
//안자바,1,5,60,100,80,240,80.0 
//이자바,1,4,70,90,70,230,76.7 
//홍길동,1,1,100,100,100,300,100.0
