package ch07.abstract_class_jeongsuk;

// 추상클래스 Unit은
// Marine, Tank, DropShip의 공통되는 특성을 추출
public abstract class Unit {
	// 필드
	int x, y;	// 현재 위치
	abstract void move(int x, int y);	// 추상 메서드 -> 각 Unit마다 실제 동작이 다르다.
	void stop() { /* 현 위치에서 정지 */ } // -> Unit마다 똑같은 동작
}
