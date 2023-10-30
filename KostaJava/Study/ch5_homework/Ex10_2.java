package ch5_homework;

public class Ex10_2 {

	public static void main(String[] args) {
		//3m 길이 우물바닥에 달팽이
		//달팽이는 낮동안 55cm올라올 수 있음 하지만
		//날이 지면 잠을 자야한다 자는동안 3cm를 미끄러져 내려온다
		//달팽이가 우물 밖으로 나오는 데 며칠이 걸릴까?
		int[] height = new int[6];
		for(int i=0; i<height.length; i++) {
			height[i] = 55+52*i;
			if(height[i]>=300) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
