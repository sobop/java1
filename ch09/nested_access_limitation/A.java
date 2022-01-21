package ch09.nested_access_limitation;

public class A {	// 바깥(외부) 클래스
	// 인스턴스 멤버 클래스 : 객체 A가 생성되어야 사용
	class B { }
	// 정적 멤버 클래스 : 언제나 존재
	static class C { }
	
	// 인스턴스 멤버 필드 : Class A가 인스턴스화 되었을 때 사용
	B b = new B();	// 사용 가능
	C c = new C();	// 사용 가능
	
	// 인스턴스 멤버 메서드
	void method1() {	// 메서드가 실행되는 시점 : 객체 A가 생성된 이후에 실행됨
		B var1 = new B();	// 사용 가능
		C var2 = new C();	// 사용 가능
	}
	
	// 정적 멤버 필드 -> 객체 A의 생성과는 무관하게 존재
//	static B sb = new B();	// 에러 -> B는 A 객체가 존재해야지만 존재 -> 모순
	static C sc = new C();	// 사용 가능 -> 객체 A의 생성과는 무관
	
	// 정적 멤버 메서드
	// 메서드가 실행되는 시점과 클래스 B 또는 C가 존재하는 시점간의 차이
	static void method2() {	// 객체 A의 생성과는 무관
//		B b = new B();	// 에러 -> 객체 A가 존재해야지만 사용 가능
		C c = new C();	// 사용 가능 -> 객체 A의 생성과는 무관
	}
	
	// 인스턴스 멤버 -> 객체 A가 생성되어야만 존재
	int field1;
	void method3() { }
	
	// 정적 멤버 -> 객체 A의 생성과는 무관하게 존재
	static int field2;
	static void method4() { }
	
	// 인스턴스 멤버 클래스
	class D {
		void method() {	// 메서드가 실행되는 시점 -> Class D가 생성이 되어야 함
			// 클래스 A가 생성이 되어야 함.
			// 바깥 클래스에 있는 멤버에 접근 가능한가?
			field1 = 10;	// 사용 가능
			method3();		// 사용 가능
			
			field2 = 30;	// 사용 가능
			method4();		// 사용 가능
		}
	}
	
	// 정적 멤버 클래스 : 객체 A의 생성과는 무관하게 존재
	static class E {
		// 인스턴스 멤버 메서드 -> 객체 E가 생성되어야만 존재(사용 가능)
		void method() {	// 실행되는 시점 : 객체 
			// 객체 A의 인스턴스 멤버는 접근 불가능 : 객체 A가 생성되지 않았으므로
//			field1 = 20;	// 사용 불가능
//			method3();		// 사용 불가능
			// 객체 A의 정적 멤버는 접근 가능 : 객체 A의 생성과는 무관
			field2 = 40;	// 사용 가능
			method4();		// 사용 가능
		}
	}
}
