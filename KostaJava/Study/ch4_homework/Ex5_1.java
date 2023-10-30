package ch4_homework;

public class Ex5_1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { // arr.lenth
			sum += arr[i];
		}
		System.out.println("sum=" + sum);

	}
}
