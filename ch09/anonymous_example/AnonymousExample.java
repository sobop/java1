package ch09.anonymous_example;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();	// 필드를 사용 : 익명객체를 동작
		anony.method1();
		anony.method2(new Person() {
			// 자식의 메서드
			void gotoSchool() {
				System.out.println("학원에 갑니다.");
			}
			@Override
			public void wake() {
				System.out.println("7시에 일어납니다.");
				gotoSchool();
			}
		});
	}

}
