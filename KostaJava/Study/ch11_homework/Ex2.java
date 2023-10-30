package ch11_homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex2 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(3); // 362227
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		HashSet<Integer> set = new HashSet<>(list);
		// 중복을 제거
		// 3 6 2 7
		TreeSet<Integer> tset = new TreeSet<>(set);
		// 정렬
		// 2 3 6 7
		Stack<Integer> stack = new Stack<>();
		// 차례대로 내림차순 정렬
		// 7 6 3 2
		stack.addAll(tset);
		while (!stack.empty())
			System.out.println(stack.pop());
	}
}