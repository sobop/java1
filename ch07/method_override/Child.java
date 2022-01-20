package ch07.method_override;

// 자식 객체 : 부모의 메소드를 가지고 있다.
// 부모의 메소드를 재정의를 할 수 있다. -> 나만의 기능을 구현할 수 있다.
// 부모로 부터 물려받은 기능을 그대로 사용할 수도 있고
// 나만의 기능으로 다시 재정의할 수 있다.

public class Child extends Parent {
	// 부모로 부터 상속받은 method1()이 존재한다.
	
	// 재정의 : 반환형,메소드이름, 매개변수의 목록(타입, 갯수, 순서)이 동일해야 한다.
	// 접근제한자를 더 강하게 제한을 가할 수 없다.
	// @Override를 생략 가능 -> 
	// @Override를 생략해도 재정의를 하는 것이다.
	// @Override를 사용하는 이유는 컴파일러가 문법적인 오류를 방지할 수 있다.
	@Override
	public void method2() {	// 접근 권한 : public (권한을 약하게 할 수 있음)
		System.out.println("Child:method2() 호출됨");
	}
	
	// 메소드 오버로딩 -> 다른 메소드가 된다. -> 재정의하는 것이 아니다.
	public void method2(String name) {
		
	}
	/*
	// 재정의
	@Override
	void method4() {	// 접근 권한을 public -> default로 더 권한을 강화하면 에러 발생
		// 권한을 더 강하게 할 수 없다. -> 더 약하게 할 수 있다.
		super.method4();	// 부모가 정의한 메소드를 호출
							// super : Parent 클래스
	}
	*/
	
	public void method5() {
		method2();			// Child 클래스가 재정의한 메소드를 호출
		super.method2();	// Parent 클래스가 정의한 메소드를 호출
	}
	
	public void method6() {
		super.method2();
	}
	
	// 자식 클래스의 매소드를 추가
	public void method3() {
		System.out.println("Child:method3() 호출됨");
	}
}
