package ch09.anonymous_class;

public class MyClass {
	// 필드
	Parent parent = new Parent() {	// 익명 객체 : 1회성
		@Override
		public void method1() {
			System.out.println("Anoymous:method1()");
		}
	};
	
	public MyClass() { }
	
	// 생성자
	public MyClass(Parent parent) {
		this.parent = parent;
	}
	
	void method() {
		// 로컬 변수로 익명 객체를 사용
		Parent local = new Parent() {	// 익명 객체
			@Override
			public void method1() {
				System.out.println("로컬변수의 익명객체 사용");
			}
		};
		local.method1();
	}
	
	void method2(Parent parent) {
		parent.method1();
	}
}
