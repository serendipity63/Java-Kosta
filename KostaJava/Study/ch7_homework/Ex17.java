package ch7_homework;

abstract class Unit { // 부모클래스
	int x, y;

	abstract void move(int x, int y);

	void stop() {
	}
}

class Marine extends Unit { // 보병 int x, y; // 현재 위치 void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void move(int x, int y) {
	}

	void stimPack() {
		/* 스팀팩을 사용한다. */}
}

class Tank extends Unit { // 탱크 int x, y; // 현재 위치 void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void move(int x, int y) {
	}

	void changeMode() {
		/* 공격모드를 변환한다. */}
}

class Dropship extends Unit { // 수송선 int x, y; // 현재 위치 void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void move(int x, int y) {
	}

	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }
}

public class Ex17 {

}
