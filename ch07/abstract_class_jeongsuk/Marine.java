package ch07.abstract_class_jeongsuk;

public class Marine extends Unit {	// 보병
	// 추상 메서드는 재정의한다.
	@Override
	void move(int x, int y) {	/* 걸어서 이동한다. */ }	// 공통 메소드
	// stop()는 Unit에서 정의한 대로 그대로 사용 -> 재정의하지 않는다.
	// 고유한 메서드
	void stimPack() {	/* 무기를 사용 */ }	// Marine에 고유한 메서드
}
