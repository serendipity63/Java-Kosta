package ch5;

public class Ex12 {

	public static void main(String[] args) {
		// 3m 길이 우물바닥에 달팽이
		// 달팽이는 낮동안 55cm올라올 수 있음 하지만
		// 날이 지면 잠을 자야한다 자는동안 3cm를 미끄러져 내려온다
		// 달팽이가 우물 밖으로 나오는 데 며칠이 걸릴까?
		int depth = 3*100, height= 0;
		final int up = 55;
		final int down = 3;
		int days =1;

		while(true) { //무한루프
			height +=up;
			if(height>=depth) break;
			days++;
			height-=down;
						
		}
		System.out.println(days);

	}

}// 수업풀이