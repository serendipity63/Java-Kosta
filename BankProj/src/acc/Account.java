package acc;

import exc.BankError;
import exc.BankException;

public class Account {
	String id;
	String name;
	int balance;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public Account() {
	}

	public Account(String aid, String aname, int money) {
		id = aid; // 초기화
		name = aname;
		balance = money;
	}; // 생성자
		// 이름이 같을 경우 가장 가깝게 선언된 변수만 인식함

	@Override
	public String toString() {
		return String.format("계좌번호:%s,이름:%s,잔액:%d", id, name, balance);

	}

	public void deposit(int money) throws BankException { // 밸런스를 바꿈
		if (money <= 0) {
			throw new BankException("입금오류", BankError.MINUS);

		}

		balance += money;

	}

	public void withdraw(int money) throws BankException { // 역할 밸런스를 바꿈
		if (balance < money) {
			throw new BankException("출금오류", BankError.LACK);
		}
		balance -= money;
	}
}
