import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner; //자바 폴더 안에 유틸 폴더 안에 스캐너
import java.util.StringTokenizer;
import java.util.TreeMap;

import acc.Account; //다른 패키지에 있는 Account class 불러오기
import acc.SpecialAccount;
import exc.BankError;
import exc.BankException;

public class Bank {
	Map<String, Account> accs = new TreeMap<>(); // 정렬
	Scanner sc = new Scanner(System.in);

	int menu() throws BankException {

		System.out.println("[코스타 은행]");
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌조회");
		System.out.println("5.전체계좌조회");
		System.out.println("0.종료");
		System.out.println("선택>>");

		int sel = Integer.parseInt(sc.nextLine());
		if (!(sel >= 0 && sel <= 5)) {
			throw new BankException("메뉴오류", BankError.MENU);
		}

		return sel;

	}

	void selAccMenu() throws BankException {
		System.out.println("[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.println("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
			break;
		default:
			throw new BankException("메뉴오류", BankError.MENU);

		}
	}

	void makeAccount() throws BankException {
		System.out.println("[일반계좌개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		if (accs.containsKey(id)) { // 중복계좌번호 거르기
			throw new BankException("계좌오류", BankError.EXISTID);
		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs.put(id, new Account(id, name, money));

	}

	void makeSpecialAccount() throws BankException {
		System.out.println("[특수계좌개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		if (accs.containsKey(id)) { // 중복계좌번호 거르기
			throw new BankException("계좌오류", BankError.EXISTID);

		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급(VIP-V,Gold-G, Silver-S,Normal-N):");
		String grade = sc.nextLine();
		// 추가 특수계좌 클래스
		accs.put(id, new SpecialAccount(id, name, money, grade)); // 업캐스팅 다형성 적용

	}

	void deposit() throws BankException {
		System.out.println("[입금]");
		System.out.print("계좌 번호:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("계좌오류", BankError.NOID);
		}
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs.get(id).deposit(money); // id를 가지고 deposit을 호출한다
	}

	void withdraw() throws BankException {
		System.out.println("[출금]");
		System.out.print("계좌 번호:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("계좌오류", BankError.NOID);
		}
		System.out.print("출금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs.get(id).withdraw(money);

	}

	void accountInfo() throws BankException {
		System.out.println("[계좌조회]");
		System.out.print("계좌 번호:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("계좌오류", BankError.NOID);
		}
		System.out.println(accs.get(id));
	}

	void allAccountInfo() {
		System.out.println("[전체 계좌 조회]");
		Iterator<Account> it = accs.values().iterator(); // iterator활용
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//		for(Account acc: accs.values()) { //향상된 포문
//			System.out.println(acc);
//		}		

	}

	public void store_b() {

		DataOutputStream dao = null;
		try {
			dao = new DataOutputStream(new FileOutputStream("accs.bin"));
			dao.writeInt(accs.size()); // 계좌 갯수 저장
			for (Account acc : accs.values()) { // acct 목록 가져오기
				if (acc instanceof SpecialAccount) { // 계좌 종류 구분값
					dao.writeChar('S');
				} else {
					dao.writeChar('N');
				}
				dao.writeUTF(acc.getId()); // 계좌 번호
				dao.writeUTF(acc.getName()); // 이름
				dao.writeInt(acc.getBalance());// 잔액
				// 잔액
				if (acc instanceof SpecialAccount) {
//					SpecialAccount sacc = (SpecialAccount) acc;
//					dao.writeUTF(sacc.getGrade()); // 등급
					dao.writeUTF(((SpecialAccount) acc).getGrade().charAt(0) + ""); // 등급
				}
			}

		} catch (IOException e) {
			e.printStackTrace();// 반드시 넣기
		} finally {
			try {
				if (dao != null)
					dao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void load_b() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("accs.bin"));
			int count = dis.readInt(); // 계좌갯수
			for (int i = 0; i < count; i++) {
				char sect = dis.readChar(); // 계좌 종류 구분값
				String id = dis.readUTF(); // 계좌번호
				String name = dis.readUTF();// 이름
				int balance = dis.readInt(); // 잔액
				if (sect == 'S') {
					String grade = dis.readUTF();// 등급
					accs.put(id, new SpecialAccount(id, name, balance, grade));

				} else {
					accs.put(id, new Account(id, name, balance));

				}

			}
		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void store_t() { // stream은 반드시 예외처리
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("accs.txt"));
			for (Account acc : accs.values()) {
				String accStr = acc.getId();
				accStr += "," + acc.getName();
				accStr += "," + acc.getBalance();
				if (acc instanceof SpecialAccount) {
					accStr += "," + ((SpecialAccount) acc).getGrade().charAt(0) + "";
				}
				bw.write(accStr);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void load_t() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("accs.txt"));
			String accStr = null;
			while ((accStr = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(accStr, ",");
				String id = st.nextToken();
				String name = st.nextToken();
				int balance = Integer.parseInt(st.nextToken());
				if (st.countTokens() != 0) {
					String grade = st.nextToken();
					accs.put(id, new SpecialAccount(id, name, balance, grade));
				} else {
					accs.put(id, new Account(id, name, balance));

				}

//				String[] accProp = accStr.split(",");
//				String id = accProp[0];
//				String name = accProp[1];
//				int balance = Integer.parseInt(accProp[2]);
//				if (accProp.length == 4) { // 개수에 따라
//					String grade = accProp[3];
//					accs.put(id, new SpecialAccount(id, name, balance, grade));
//
//				} else {
//					accs.put(id, new Account(id, name, balance));
//
//				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

//	public void store_s() {
//		ObjectOutputStream oos = null;
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream("accs.dat"));
//			oos.writeObject(accs);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (oos != null)
//					oos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public void load_s() {
//		ObjectInputStream ois = null;
//		try {
//			ois = new ObjectInputStream(new FileInputStream("accs.dat"));
//			accs = (Map<String, Account>) ois.readObject();
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (ois != null)
//					ois.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.load_t();
		int sel;
		while (true) {
			try {
				sel = bank.menu(); // menu는 인스턴스 매서드
				if (sel == 0) {
					bank.store_t();
					break;
				}
				switch (sel) {
				case 1:
					bank.selAccMenu();
					break;
				case 2:
					bank.deposit();
					break;
				case 3:
					bank.withdraw();
					break;
				case 4:
					bank.accountInfo();
					break;
				case 5:
					bank.allAccountInfo();
					break;

				}
			} catch (NumberFormatException e) {
				System.out.println("입력형식이 맞지 않습니다. 다시 선택하세요.");

			} catch (BankException e) {
				System.out.println(e);

			}
		}

	}

}
