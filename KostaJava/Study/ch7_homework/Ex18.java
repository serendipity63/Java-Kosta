package ch7_homework;

//polinotest4 참조
public class Ex18 {
	static void action(Robot robot) { // 각각의 자식 타입으로 캐스팅?
		if (robot instanceof DanceRobot) {
			DanceRobot dancerobot = (DanceRobot) robot;
			dancerobot.dance();
		}
//		DanceRobot DR = (DanceRobot)robot;
		else if (robot instanceof SingRobot) {
			SingRobot singrobot = (SingRobot) robot;
			singrobot.sing();

		} else if (robot instanceof DrawRobot) {
			DrawRobot drawrobot = (DrawRobot) robot;
			drawrobot.draw();

		}

	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
