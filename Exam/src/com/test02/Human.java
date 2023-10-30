package com.test02;

class Human {
	String name;
	int age;
	int height;
	int weight;

	Human() {

	}

	Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return String.format("%s,%d,%d,%d", this.name, this.age, this.height, this.weight);
	}
}
//@Override
//public String toString() {
//	return this.name+this.age+this.height+this.weight;
