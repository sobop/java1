package ch07.abstract_class_jeongsuk;

public class Tank2 {
	int x, y;	// 현재 위치
	void move(int x, int y) {	/* 이동한다. */ }	// 공통메서드
	void stop() {	/* 현 위치에서 정지 */ }
	void changeMode() { /* 공격모드를 변환한다. */ }	// 탱크에 고유한 메서드
}
