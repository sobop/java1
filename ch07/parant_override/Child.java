package ch07.parant_override;

public class Child extends Parent {
	
	// 재정의 : 반환형, 메소드이름, 매개변수의 목록(타입, 갯수, 순서)이 동일해야한다.
	// 접근제한자를 더 강하게 제한을 가할 수 없다.
	// @override 사용하는 이유 -> 컴파일러가 문법적인 오류를 방지할 수 있어서
	@Override
	public void method2() {	// 접근 권한 : public (권한을 약하게 할 수 있음)
		System.out.println("Child:method2() 호출됨");
	}
	
	// 메소드 오버로딩 -> 다른 메소드가 된다. -> 재정의하는것이 아니다.
	public void method2(String name) {
		
	}
	public void method3() {
		System.out.println("Child:method3() 호출됨");
	}
	@Override
	public void method4() {	// 접근권한을 public에서 default로 권한을 강화하면 에러발생
		// 권한을 더 강하게 할 수 없다.
		super.method4();	// 부모가 정의한 메소드를 호출
							// super : Parent 클래스
	}
	
	public void method5() {
		method2();			// Child 클래스가 재정의한 메소드를 호출
		super.method2();	// Parent 클래스가 재정의한 메소드를 호출
	}
	
	public void method6() {
		super.method2();
	}
}
