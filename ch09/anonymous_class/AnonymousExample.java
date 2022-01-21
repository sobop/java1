package ch09.anonymous_class;

public class AnonymousExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		// 익명 객체 : 자식 클래스인데 이름이 없는 객체
		// 클래스 이름이 없으므로 생성자를 어떻게 써야 하는가? -> 부모클래스 이름을 사용
		// 1회성으로 사용 -> 별도의 클래스 파일로 작성하지 않음
		// 필드
		parent = new Parent() {	// 정의와 사용
			// 부모의 메소드를 재정의
			@Override
			public void method1() {
				System.out.println("Anonymous:method1()");
			}
			// 자식이 정의한 필드나 메서드
		};
		parent.method1();
		
		// 익명 객체의 사용 : 필드, 생성자, 메서드(로컬 변수, 매개변수) -> 어디서든지 사용할 수 있음
		
		MyClass mc = new MyClass();
		mc.parent.method1();
		mc = new MyClass(new Parent() {	// 익명 객체 : 생성자의 매개변수
			@Override
			public void method1() {
				System.out.println("매개변수의 method1()");
			}
		});
		mc.parent.method1();
		mc.method();
		mc.method2(new Parent() {	// 익명 객체
			@Override
			public void method1() {
				System.out.println("메서드의 매개변수로 익명객체를 사용");
			}
		});
	}

}
