package ch06;

// Car : 대문자로 시작. 파일이름과 동일.
// Public 접근 제한자 : 다른 패키지에서도 접근(사용)할 수 있음
public class Car {

}

// 접근 제한자가 없으면 default 접근 제한자를 가진다.
// 같은 패키지 내에서만 접근이 가능 (ch06 디렉토리에 있는 다른 클래스에서 접근 가능)
// 다른 패키지에서는 접근 불가능
class Engine {
	void method() {
		Handle handle = new Handle();	// 인스턴스화(객체를 생성)
		handle.method2();
	}
}

class Handle {
	void method2() {
		System.out.println("Handle:method2() 호출됨");
	}
}

//public class Handle {} // 에러가 발생 -> 이미 존재하는 class이라서


