package com.test04;

public class Airplane extends Plane {
	String planeName;
	int fuel;

	Airplane() {

	}

	Airplane(String planeName, int fuel) {
		this.planeName = planeName;
		this.fuel = fuel;

	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	@Override
	void flight(int distance) { // 10 운항시 연료 30감소
		int curFuelSize = this.getFuelSize();
		this.setFuelSize(curFuelSize - distance * 3);
	}

}
