package ch9;

public class RandomTest { // 12번 힌트

	public static void main(String[] args) {
		// 2~8 랜덤값 구하기
		int r = (int) (Math.random() * (8 - 2 + 1)) + 2;
		// (int)(Math.random()*(최대값-최소값+1))+최소값
		System.out.println(r);

	}

}
