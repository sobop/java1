package ch07.protected_access_modifier_other;

import ch07.protected_access_modifier.ClassA;

public class ClassD {
	void method() {
//		ClassA ca = new ClassA();
//		ca.field1 = 20;		// public : 접근 가능
//		ca.field2 = "접근 불가능";	// proteced : 접근 불가능(상속받지 않은 클래스)
//			// 패키지가 다른 클래스는 접근 불가능
//		ca.field3 = 40L;	// default : 접근 불가능 (같은 패키지에 있는 클래스만 접근 가능)
//			// 다른 패키지에 있는 클래스에서 접근 불가능
//		ca.field4 = true;	// private : 접근 불가능
			// private은 클래스 자신만이 접근이 허용됨
			// 다른 클래스에서는 접근 불가능
	}
}
