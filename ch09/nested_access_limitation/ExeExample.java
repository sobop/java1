package ch09.nested_access_limitation;

public class ExeExample {

	public static void main(String[] args) {
		A.method2();
		A.E e = new A.E();
		e.method();
		A a = new A();
		a.method1();
		A.D d = a.new D();
		d.method();	// 객체 A와 D가 생성된 이후
	}

}
