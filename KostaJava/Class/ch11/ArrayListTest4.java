package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {
	static void print(List<Integer> list) {
		for (Integer n : list) {
			System.out.print(n + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		List<Integer> list2 = list1.subList(1, 4);
		print(list1);
		print(list2);
		System.out.println(list1.containsAll(list2));
		System.out.println("=======================");
		list1.retainAll(list2); // list1에 리스트2만 남기고 다 삭제
		print(list1);
		System.out.println("=======================");
		list1.add(0, 6); // 0번째에 6삽입
		print(list1);
		System.out.println("=======================");
		list1.set(0, 7); // 0번째에 데이터를 7로 변경
		print(list1);
		System.out.println("=======================");
		list1.add(7); //
		print(list1);
		System.out.println("=======================");
		list1.remove(new Integer(7)); // 맨앞에꺼만 삭제됨 다 삭제가 안된다
		print(list1);

	}

}
