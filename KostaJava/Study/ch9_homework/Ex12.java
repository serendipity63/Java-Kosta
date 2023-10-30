package ch9_homework;

public class Ex12 {
	static int getRand(int from, int to) {
		int min = Math.min(from, to);
		int max = Math.max(from, to);
		return (int) (Math.random() * (max - min + 1)) + min;

	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++)
			System.out.print(getRand(1, -3) + ",");
	}
}