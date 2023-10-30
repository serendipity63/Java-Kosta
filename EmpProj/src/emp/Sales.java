package emp;

public class Sales extends Permanent implements BusinessTrip {
	int incentive;
	
	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public Sales() {
	}

	public Sales(int id, String name, int salary, int incentive) {
		super(id, name, salary);
		this.incentive = incentive;
	}

	@Override
	public int getPay() {
		return super.getPay() + getIncentive();

	}
	@Override
	public void travel(int days) {
		this.incentive += 300000 * days; // 위의 인센티브만 바꿔주면 되니까..

	}


}
