package ch09.nested_reference;

public class Outter {
	// 멤버
	String field1 = "Outter-field";
	void method() {
		System.out.println("Outter:method()");
	}
	
	class Nested {
		String field1 = "Nested-field";
		void method() {
			System.out.println("Nested:method()");
		}
		
		void print() {
			// Nested의 멤버 접근
			System.out.println(field1);	
			System.out.println(this.field1);	// this : Nested
			method();
			this.method();
			
			// Outter의 멤버 접근
			System.out.println(Outter.this.field1);
			Outter.this.method();
		}
	}
}
