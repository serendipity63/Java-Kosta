package ch5;

//누적값 구하는법
public class ArrayTest5 {

	public static void main(String[] args) {
		int[][] narr = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 }, };

		int[][] result = new int[narr.length][narr[0].length + 1];

		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr[i].length; j++) {

				result[i][j] = narr[i][j];
				result[i][result[i].length - 1] += narr[i][j];
				// 마지막 열에 누적, 자동 초기화가된다
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}

	}

}