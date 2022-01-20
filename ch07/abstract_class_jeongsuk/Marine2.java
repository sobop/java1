package ch07.abstract_class_jeongsuk;

public class Marine2 {	// 보병
	// 필드
	int x, y;	// 현재 위치
	void move(int x, int y) {	/* 걸어서 이동한다. */ }	// 공통 메소드
	void stop() {	/* 현 위치에서 정지 */ }					// 공통 메서드
	void stimPack() {	/* 무기를 사용 */ }	// Marine에 고유한 메서드
}
