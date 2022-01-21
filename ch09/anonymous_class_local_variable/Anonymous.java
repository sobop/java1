package ch09.anonymous_class_local_variable;

// Outter 객체

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		// 자바 버전 7에서는 매개변수를 final로 선언
		// 자바 버전 8에서는 매개변수를 final을 생략
		// 매개변수 arg1과 arg2도 수정 불가
		// 로컬변수
		int localVar1 = 20;			// final로 동작 : 수정 불가 (자바 버전 8)
		final int localVar2 = 30;	// 수정 불가 (자바 버전 7)
//		arg1 = 50;	// 수정 불가능
//		arg2 = 60;	// 실질적인 에러 발생한 위치
//		localVar1 = 100;	// 수정 불가
//		localVar2 = 300;	// 수정 불가
		// 로컬 클래스
		// 인터페이스 = 익명 구현 객체
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {	// 원칙 : 매개변수로 들어온 값과 로컬변수로 사용한 값이 그대로
				// 전달이 되기를 원한다.
				int result = arg1 + arg2 + localVar1 + localVar2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
