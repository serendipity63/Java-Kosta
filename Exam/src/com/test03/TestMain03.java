package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		StringTokenizer st = new StringTokenizer(str, ",");
		// 문자열을 ","기준으로분리
		List<Double> list = new ArrayList<>();
		// 숫자를 저장할 리스트
		double sum = 0.0;
//		변수 초기화

		while (st.hasMoreTokens()) {// 문자열을 숫자로 분리하여 리스트에 저장하고 합계를 계산

			String token = st.nextToken();// 다음 토큰(숫자)을 가져옴

			double number = Double.parseDouble(token); // 문자열을 double로 변환
			list.add(number); // list에 숫자 추가
			sum += number; // 합계 계산

		}

		double average = sum / list.size();// 평균 계산

		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);

	}

}

//합 계: 29.320 평 균: 5.864
