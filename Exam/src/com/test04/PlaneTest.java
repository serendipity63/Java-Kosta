package com.test04;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane airplane = new Airplane("L777", 1000);
		CargoPlane cargoplane = new CargoPlane("C50", 1000);

		System.out.println("Plane fuelSize");
		System.out.println("--------------");
		System.out.println(airplane.getPlaneName() + " " + airplane.getFuelSize());
		System.out.println(cargoplane.getPlaneName() + " " + cargoplane.getFuelSize());
		System.out.println("100 운항");

		System.out.println();
		System.out.println("Plane fuelSize");
		System.out.println("--------------");
		airplane.flight(100);
		cargoplane.flight(100);
		System.out.println(airplane.getPlaneName() + " " + airplane.getFuelSize());
		System.out.println(cargoplane.getPlaneName() + " " + cargoplane.getFuelSize());
		System.out.println("200 주유");

		System.out.println();
		System.out.println("Plane fuelSize");
		System.out.println("--------------");
		airplane.refule(200);
		cargoplane.refule(200);
		System.out.println(airplane.getPlaneName() + " " + airplane.getFuelSize());
		System.out.println(cargoplane.getPlaneName() + " " + cargoplane.getFuelSize());

		// Airplane과 Cargoplane 객체생성
		// 생성된 객체의 정보 출력
		// Airplane과 Cargoplane 객체에 100씩 운항
		// 운항후 객체의 변경된 정보 출력
		// Airplane과 Cargoplane 객체에 200씩 주유
		// 주유후 객체의 변경된 정보 출력

	}

}
