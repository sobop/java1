package ch09.instance_member_class;

public class NestedExample {

	public static void main(String[] args) {
		// main() 메서드가 동작하는 쓰레드 -> main 쓰레드
		System.out.println(Thread.currentThread().getName());
		Outter outter = new Outter();			// Outter 클래스 생성
		// 인스턴스 멤버 클래스는 Outter 클래스가 객체화되어야만 생성 가능
		outter.method();	// Outter 객체가 생성되어야만 실행 가능
		outter.communicateWithServer();
		Outter.Inner inner = outter.new Inner();// Inner 클래스 생성
		
		// static 멤버 클래스는 Outter 객체의 생성과는 무관하게 인스턴스화 할 수 있다.
		Outter.StaticInner staticInner = new Outter.StaticInner();
	}

}
