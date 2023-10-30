import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedTest1 {

	static void write(Person p) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("per.txt");
			bw = new BufferedWriter(fw);
			// 주요코드
			String perStr = p.getName() + "," + p.getAge() + "," + p.getHeight() + ",";
			perStr += p.isMarried() ? "Y" : "N"; // 문자열을 만듬
			bw.write(perStr);
			bw.newLine();
			// 주요코드
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

	static Person read() {
		Person per = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("per.txt");
			br = new BufferedReader(fr);
			String perStr = br.readLine(); // hong, 30, 178.5,N
			String[] perProp = perStr.split(",");
			String name = perProp[0];
			int age = Integer.parseInt(perProp[1]);
			double height = Double.parseDouble(perProp[2]);
			boolean married = perProp[3].charAt(0) == 'Y' ? true : false;
			per = new Person(name, age, height, married);

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
		return per;
	}

	static void write(List<Person> pers) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("pers.txt"));

			for (Person p : pers) {
				String perStr = p.getName() + "," + p.getAge() + "," + p.getHeight() + ",";
				perStr += p.isMarried() ? "Y" : "N"; // 문자열을 만듬
				bw.write(perStr);
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

	static List<Person> readlist() {
		List<Person> pers = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("pers.txt"));
			String perStr = null;
			while ((perStr = br.readLine()) != null) {
				String[] perProp = perStr.split(",");
				String name = perProp[0];
				int age = Integer.parseInt(perProp[1]);
				double height = Double.parseDouble(perProp[2]);
				boolean married = perProp[3].charAt(0) == 'Y' ? true : false;
				pers.add(new Person(name, age, height, married));

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
		return pers;
	}

	public static void main(String[] args) {
//		Person p = new Person("hong", 30, 178.5, false);
//		write(p);
//		Person p = read();
//		System.out.println(p);

//		List<Person> pers = new ArrayList<>();
//		pers.add(new Person("hong", 20, 173.5, false));
//		pers.add(new Person("song", 30, 183.5, false));
//		pers.add(new Person("gong", 40, 174.2, true));
//		write(pers);

		List<Person> list = readlist();
		for (Person p : list) {
			System.out.println(p);
		}

	}

}
