package pac;

public class Number {
	private int pnum;

	private void pmethod() {
		pnum = 10;
	}

	int dnum; // default

	public int getDnum() { // 변수의 첫번째 캐릭터는 대문자로
		return dnum;
	}

	public void setDnum(int data) {
		dnum = data;
	} // source에서 generate getters/setters

	public void demethod() { // default
		System.out.println(pnum);

	}

	public int punum;

	public void pumethod() {
		System.out.println(pnum);
	}

	protected int prnum;

	public void prmethod() {

	}
}
