package ch3;
public class CastTest {

	public static void main(String[] args) {
		byte bt = 10;
		int i = bt;

		byte bt2 = (byte) i;

		float f = i;
		int i2 = (int) f; // 형변화 소숫점 잘림 대체 왜 이러는거임 진짜

		double d = f;
		float f2 = (float) d; // 강제로 캐스팅 하는게 () 안에다 밀어넣는거

	}

}
