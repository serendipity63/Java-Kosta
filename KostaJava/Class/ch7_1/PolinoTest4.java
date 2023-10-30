package ch7_1;

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrr~");
	}

	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("Water!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren~~~");
	}
}

public class PolinoTest4 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.water();

		Car car = fe; // upcasting 가능은 함
		// car.water(); 근데 이건 안됨
		if (car instanceof FireEngine) { // instanceof 해당 레버런스 변수가 형변환이 가능한지 여부 확인
			FireEngine fe2 = (FireEngine) car; // 다운캐스팅 하여서 car가 water 기능 사용하게 해라
			fe2.water();
		}

	}

}
