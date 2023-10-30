package com.test04;

public class CargoPlane extends Plane {
	String planeName;
	int fuel;

	CargoPlane() {

	}

	CargoPlane(String planeName, int fuel) {
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
	void flight(int distance) {// 10운항시 연료 50 감소
		int curFuelSize = this.getFuelSize();
		this.setFuelSize(curFuelSize - distance * 5);

	}

}
