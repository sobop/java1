package ch08.interface_inherit;

public class InterfaceCImpl implements InterfaceC {
	// InterfaceA의 추상메소드
	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl:methodA() 재정의함");

	}
	// InterfaceB의 추상메소드
	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl:methodB() 재정의함");

	}
	// InterfaceC의 추상메소드
	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl:methodC() 재정의함");

	}

}
