package dao;

class Solution {
	public int[] solution(int n) {

		int[] answer = {};
		int j = 0;

		if (n % 2 == 0) {
			answer = new int[n / 2];
		} else {
			answer = new int[n / 2 + 1];
		}
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				answer[j] = i;
				j++;
			}
		}
		return answer;
	}
}

//10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
