package item;

public class Zerg extends AirUnit implements Repairable {
	public Zerg() {// 저그는 다 똑같으니까
		super(200); // 부모의 이름을 바로 함 저그의 default
	}

	@Override
	public void fix() {
		healthPoint = MAX_HP;

	}

}
