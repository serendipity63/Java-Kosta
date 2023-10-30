package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest6 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		// arrays.aslist는 파라미터가 있는 값을 가지고 리스트르 만들어줌
		System.out.println(numbers); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
		numbers.removeIf(n -> (n % 3) == 0); // 람다식 3의 배수인 애만 없애줌(removeif)
		System.out.println(numbers); // [1, 2, 4, 5, 7, 8]

	}

}

//deep copy -복제
//shallow copy- reference만 카피
