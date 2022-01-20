package ch07.abstract_class_jeongsuk;

public class Tank extends Unit {
	@Override
	void move(int x, int y) {	/* 바퀴(벨트)로 이동한다. */ }	// 공통메서드
	void changeMode() { /* 공격모드를 변환한다. */ }	// 탱크에 고유한 메서드
}
