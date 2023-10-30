package com.test05;

public class Sales extends Employee implements Bonus {

	Sales() {

	}

	Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);

	}

	@Override
	public void incentive(int pay) {
		this.salary += pay * 1.2;

	}

	@Override
	public double tax() {
		return getSalary() * 0.13;
	}

}
