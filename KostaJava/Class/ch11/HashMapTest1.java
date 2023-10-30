package ch11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {

//hashMap는 Map을 구현했으므로 Map의 특징, key와 value를 묶어서 하나의 데이터(entry)로 저장한다는 특징을 갖는다
//hashing을 사용하기 때문에 많은 양의 데이터를 검색하는데 있어서 뒤어난 성능을 보인다
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		hmap.put("1001", 35);// 데이터 삽입(key, value)
		if (hmap.containsKey("1001") == false) { // key 존재여부 확인
			hmap.put("1001", 40);
		}
		hmap.put("1002", 40);
		hmap.put("1003", 33);
		hmap.put("1004", 27);

		Integer value = hmap.get("1001"); // key로 value 조회
		System.out.println(value);

		System.out.println("========");
		for (Integer n : hmap.values()) { // value 전체 목록 조회
			System.out.println(n);

		}

		System.out.println("========");
		for (String k : hmap.keySet()) { // key 전체 목록 조회
			// values도 목록이니까 향상된 포문 뒤에 올 수 있다

			System.out.println(k);
		}
		System.out.println("========");
		for (String k : hmap.keySet()) { // key 전체 목록을 통해
//			System.out.println(hmap.get(k)); // value 조회
			System.out.println(String.format("key:%s, value:%d", k, hmap.get(k))); // value 조회
			// 아래거랑 똑같음

		}
		hmap.remove("1004"); // key랑 value 둘다 삭제됨

		System.out.println("========");
		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(String.format("Key:%s, value:%d", entry.getKey(), entry.getValue()));
		}

	}

}
