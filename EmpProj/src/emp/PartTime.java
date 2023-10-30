package emp;

public class PartTime extends Employee implements BusinessTrip {
	int time;
	int payPerTime;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}

	public PartTime() {
	}

	public PartTime(int id, String name, int time, int payPerTime) {
		super(id, name);
		this.time = time;
		this.payPerTime = payPerTime;
	}

	public int getPay() {
		return getTime() * getPayPerTime();
	}

	@Override
	public String info() {
		return super.info() + ",급여:" + getPay();
	}

	@Override
	public void travel(int days) {
		this.time += days * 24; // 시간이 day*24만큼 증가되서 타임에 추가되야 하는거니까

	}
}
