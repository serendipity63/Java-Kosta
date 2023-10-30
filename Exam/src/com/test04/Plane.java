package com.test04;

abstract class Plane {
	private String planeName;
	private int fuelSize = 1000;

	Plane() {
	}

	Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	void refule(int fuel) { // 일정량의 연료 주입, 기존 연료가 증가됨 //주유
		this.fuelSize += fuel;
	}

	abstract void flight(int distance); // 운항

}
