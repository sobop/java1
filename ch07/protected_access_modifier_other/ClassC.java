package ch07.protected_access_modifier_other;

import ch07.protected_access_modifier.ClassA;

public class ClassC extends ClassA {
	void method() {
		field1 = 20;
		field2 = "접근 가능";
//		field3 = 40L;
//		field4 = true;
		
	}
}
