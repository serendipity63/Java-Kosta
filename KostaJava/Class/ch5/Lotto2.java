package ch5;

public class Lotto2 {

	public static void main(String[] args) {
		int[] ball = new int[6];
		int cnt = 0; // 처음에 하나도 안뽑았으니까
		boolean same = false; // what does this mean same number is false? 왜 이걸 선언하는지?

		while (true) { // its true when
			int rand = (int) (Math.random() * 45) + 1; // 여기는 왜 1을 더함?
			// ball배열에서 rand와 같은 값이 있는지 체크
			for (int i = 0; i < cnt; i++) { // so its to point out what?
				if (ball[i] == rand) { // so? if ball array has i value then its equal to random
					same = true; // same is true?
					break; // break is what 빠져나와

				}
			}
			if (same == false) { // 뭔소리임
				ball[cnt++] = rand; //

			}
			if (cnt == 6)
				break; // 6번 다 채웠으니까 이제 빠져나옴
		}
		for (int i = 0; i < ball.length; i++) { //
			System.out.print(ball[i] + ",");

		}
	}
}