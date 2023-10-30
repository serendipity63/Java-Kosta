package ch4;

public class Ex12 {

	public static void main(String[] args) {
		// 구구단 2*1=2 3*1=3 4*1=4
//		2*2=4 3*2=6 4*2=8
//				2*3=6 3*3=9 4*3=12
//				5*1=5 6*1=6 7*1=7
//				5*2=10 6*2=12 7*2=14
//				5*3=15 6*3=18 7*3=21
//				8*1=8 9*1=9
//				8*2=16 9*2=18
//				8*3=24 9*3=27
		for (int i = 0, dan = 2; i < 3; i++, dan += 3) {
			for (int j = 1; j <= 3; j++) {
				for (int k = dan; k <= ((dan + 2 < 10) ? dan + 2 : 9); k++) {
					System.out.print(String.format("%d*%d=%d\t", k, j, k * j));
				}
				System.out.println();
			}
			System.out.println();
		}
//		for(int i=1; i<=3; i++) {
//			for(int dan=5; dan<=7; dan++) {
//				System.out.print(String.format("%d*%d=%d\t", dan, i, dan*i));
//			}
//		}
//			System.out.println();
//			for(int i=1; i<=3; i++) {
//				for(int dan=8; dan<=9; dan++) {
//					System.out.print(String.format("%d*%d=%d\t", dan, i, dan*i));
//				}
//				System.out.println();
		// 이걸 123 234 567 따로 빼기 와 어렵네 실화임?
	}

}
