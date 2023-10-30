package item;

public class SCV extends GroundUnit implements Repairable {
	public SCV() { // repair 기눙
		super(60);
	}

	public void repair(Repairable r) {
		// 자기 동족의 max hp로 채워주는
		r.fix();

	}

	@Override
	public void fix() {
		healthPoint = (int) (Math.round(MAX_HP * 0.8));

	}
}
