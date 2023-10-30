package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Account {
	String id;
	int balance;

	Account() {

	}

	Account(String id, int balance) {
		this.id = id;
		this.balance = balance;

	}

	@Override
	public String toString() {
		return String.format("계좌번호:%s, 잔액:%d", id, balance);
	}
}

class IdCompare implements Comparator<Account> {
	@Override
	public int compare(Account o1, Account o2) {
		return o2.id.compareTo(o1.id); // 계좌번호 큰 순서로 정렬

	}
}

public class ArrayListTest3 {

	public static void main(String[] args) {
		List<Account> accs = new ArrayList<>();
		accs.add(new Account("1511", 100));
		accs.add(new Account("1000", 300));
		accs.add(new Account("2000", 200));

		Collections.sort(accs, new IdCompare());
//		for (Account acc : accs) { //향상된 포문, 처음부터 끝가지 조회만 할때 제일 ㄱㅊ하다 데이터가 많을때 
//			System.out.println(acc);		
//		}

//		for (int i = 0; i < accs.size(); i++) { //반복문을 돌때는 반복문의 반복 횟수를 반복문에 들어가면 안좋다
//			System.out.println(accs.get(i));

		Iterator<Account> it = accs.iterator(); // 반복자: 중간에 삭제하면 이거 권장
		while (it.hasNext()) { // 중간에 삭제하더라도 문제 없이 돌아간다
			System.out.println(it.next());

		}

	}

}
