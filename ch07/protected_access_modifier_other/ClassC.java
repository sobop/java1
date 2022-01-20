package ch07.protected_access_modifier_other;

import ch07.protected_access_modifier.ClassA;

public class ClassC extends ClassA {
	// classA의 멤버가 존재한다. -> 사용 가능
	void method() {
//		field1 = 20;		// public : 접근 가능
//		field2 = "접근 가능";	// proteced : 접근 가능
//		field3 = 40L;	// default : 접근 불가능 (같은 패키지에 있는 클래스만 접근 가능)
			// 다른 패키지에 있는 클래스에서 접근 불가능
//		field4 = true;	// private : 접근 불가능
			// private은 클래스 자신만이 접근이 허용됨
			// 다른 클래스에서는 접근 불가능
	}
}
