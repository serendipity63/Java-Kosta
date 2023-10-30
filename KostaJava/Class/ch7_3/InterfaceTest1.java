package ch7_3;

interface Fightable {
	void fight();

}

interface Helping {
	void help();

}

abstract class Unit {
	public abstract void move();

}

class Fighter extends Unit implements Fightable {

	@Override
	public void fight() {
		System.out.println("Fighter fight");
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("Fighter move");
		// TODO Auto-generated method stub

	}

}

class Helper extends Unit implements Helping {

	@Override
	public void help() {
		System.out.println("Helper help");
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("Helper move");
		// TODO Auto-generated method stub

	}

}

class Comber extends Unit implements Fightable, Helping {

	@Override
	public void help() {
		System.out.println("Comber help");
		// TODO Auto-generated method stub

	}

	@Override
	public void fight() {
		System.out.println("Comber fight");
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("Comber move");
		// TODO Auto-generated method stub

	}

}

public class InterfaceTest1 {

	public static void main(String[] args) {
//		Fightable fighter = new Fighter(); //upcasting
//		fighter.fight();
//fighter.move(); //레퍼런스 타입에 없는 메서드 호출은 불가능

		Fighter fighter = new Fighter(); // upcasting
		Fightable fighter1 = fighter;
		fighter1.fight();
		Unit unit = fighter;
		unit.move();
//		Object obj = fighter;

		Helper helper = new Helper();
		Helping helping = helper;
		Unit unit2 = helper;
		unit2.move();

		Comber comber = new Comber();
		Fightable figher3 = comber;
		Helping helping2 = comber;
		helping2.help();
		Unit unit3 = comber;
		unit3.move();

		System.out.println("===============================");
		System.out.println("method1()");
		method1(fighter);
		method1(comber);
//		method1(helper); //error
		System.out.println("===============================");
		System.out.println("method2()");

//		method2(fighter); //error
		method2(comber);
		method2(helper);
		System.out.println("=============================");
		System.out.println("method3()");
		method3(fighter); // 왜 오류나지
		method3(comber);
		method3(helper);

	}

	static void method1(Fightable unit) {
		unit.fight();

	}

	static void method2(Helping unit) {
		unit.help();

	}

	static void method3(Unit unit) {
		unit.move();

	}
}
