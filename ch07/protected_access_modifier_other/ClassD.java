package ch07.protected_access_modifier_other;

import ch07.protected_access_modifier.ClassA;

public class ClassD {
	void method() {
		ClassA ca = new ClassA();
		ca.field1 = 20;
//		ca.field2 = "접근 가능";	// 불가능
//		ca.field3 = 40L;
//		ca.field4 = true;
	}
}
