package com.test01;

public class TestMain01 {

	public static void main(String[] args) {

		int[][] array = { { 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, { 14, 16, 18, 78, 65 },
				{ 45, 26, 72, 23, 34 }, };
		double total = 0;
		double avg = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];

			}
		}
		avg = total / (double) (array.length * array[0].length);
		System.out.println("합계 :" + total);

		System.out.println("평균 :" + avg);

	}
}

//합계 :767.0
//평균: 38.35
