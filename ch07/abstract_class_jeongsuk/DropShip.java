package ch07.abstract_class_jeongsuk;

public class DropShip extends Unit {	// 수송기
	@Override
	void move(int x, int y) { /* 이동한다.(날아서) */ }
	void load() { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}
