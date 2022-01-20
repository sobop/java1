package ch08.interface_inherit;

// 여러가지 기능을 통합해서 조금 더 큰 기능을만듬
// 인터페이스 : 다중 상속 가능, 다중 구현도 가능
public interface InterfaceC extends InterfaceA, InterfaceB {
	// 상속받은 추상메소드를 가지고있다.
	// InterfaceC에 있는 추상메소드
	void methodC();
}
