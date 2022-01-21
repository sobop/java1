package ch09.anonymous_example;

public class Anonymous {
	// 필드
	Person field = new Person() {
		// 자식 객체가 정의한 메서드
		void work() {
			System.out.println("출근합니다.");
		}
		// 부모 클래스의 메서드를 재정의
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	// 로컬 변수로 익명 객체를 사용
	void method1() {
		Person localVar = new Person() {
			// 자식이 정의한 필드
			int num;
			// 자식의 메서드를 정의
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
//		localVar.walk();	// 익명객체의 제약사항 :부 모클래스로 자식이 정의한 메서드에 접근 불가능
//		localVar.num = 20;	// 자식이 정의한 필드에 접근 불가능
		// localVar은 부모 클래스이므로 자식이 정의한 메서드를 호출할 수 없음
		// 부모클래스는 부모클래스가 정의한 메서드만 호출할 수 있다.
		// 강제타입변환을 할 수 없음 : 클래스이름이 없으므로
	}
	
	// 메서드의 매개변수로 익명 객체를 사용
	void method2(Person person) {
		person.wake();
	}
}
