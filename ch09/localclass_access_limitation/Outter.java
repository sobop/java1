package ch09.localclass_access_limitation;

// 로컬 클래스에서 사용 제한
// Java 7버전에서는 수정하지 못하게 아예 선언을 final을 붙여주었다.
// Java 8버전에서는 final을 사용하지 않아도 final로 간주
// final 키워드를 생략해도 final이다.
public class Outter {
	public void method1(int arg) {	// 매개변수
		// 로컬 변수
		int localVariable = 1;
		// 로컬 클래스
//		arg = 10;	// 에러 발생한 위치 -> 수정 불가 : 규칙
//		localVariable = 30;	// 에러 발생 -> 수정 불가
		class Local {	// 정의
			public void method2() {	// 이 메서드가 실행되면서
				// 실행 : 관심사 -> 바깥에 있는 메서드 method1()에서 사용된 변수가
				// 메서드 method1()에서 사용되는 경우
				// 규칙 : 처음에 주어진 값을 계속 유지해야 한다. -> 수정 불가
				// 주의사항 : 에러 표시가 여기서 나지만 실제 에러는 10라인에서 발생
				int result = arg + localVariable;	// arg:매개변수
					// localVariable : method1()의 로컬 변수
			}
		}
		
		Local local = new Local();	// 사용
		local.method2();
	}
}
