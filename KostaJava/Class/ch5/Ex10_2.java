package ch5;

public class Ex10_2 {

	public static void main(String[] args) {
		// 3m 길이 우물바닥에 달팽이
		// 달팽이는 낮동안 55cm올라올 수 있음 하지만
		// 날이 지면 잠을 자야한다 자는동안 3cm를 미끄러져 내려온다
		// 달팽이가 우물 밖으로 나오는 데 며칠이 걸릴까?
		int wall = 300;
		int ground = 0;

		int snailUp = 55;
		int snailDown = 3;

		int day = 1;

		while (wall > ground) {
			wall = wall - snailUp;
			if (wall <= ground)
				break;
			wall = wall + snailDown;
			day++;
		}
		System.out.println(day);
	}
}
//반복문과 조건문을 사용한 선생님 풀이
