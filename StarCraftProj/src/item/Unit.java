package item;

public class Unit {
	int healthPoint;
	final int MAX_HP;
	// 최대파워 생성되자마자 max 명시적으로 초기화하던가 생성자에서 초기화하던가
	// 종족당 파워포인트를 다르게 해야하기때문

	Unit(int hp) {
		MAX_HP = hp;
		healthPoint = MAX_HP;

	}
}
