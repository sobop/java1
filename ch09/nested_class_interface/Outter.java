package ch09.nested_class_interface;

/*	중첩 클래스/인터페이스
 * - 중첩 클래스 : 클래스안에 클래스가 있다.
 *  + 클래스의 멤버 : 필드, 생성자, 메서드
 *  + 멤버로 클래스를 정의하고 사용한다. -> 1회성(클래스안에서 정의하고 사용)
 *  + 다른 클래스에서는 사용하지 않는다.
 *  + 다른 클래스에서도 사용하려면 별도의 자바 클래스 파일을 사용
 * 
 */
public class Outter {		// Outter(외부) 클래스
	// 필드
	Inner inner = new Inner();	// 인스턴스화
	// 인스턴스 멤버 필드
	int num = 10;
	// 인스턴스 멤버 클래스 -> Outter 클래스가 인스턴스화 되어야만 존재
	public class Inner {	// 인스턴스 멤버 클래스 : Inner(내부) 클래스
		
	}
	
	// 정적 멤버 필드
	static String str;
	// 정적 멤버 필드
	static StaticInner si;
	// 정적 멤버 클래스 -> Outter 객체의 생성과는 무관하게 존재
	public static class StaticInner {	// 정적 멤버 클래스
		
	}
	
	// 인스턴스 멤버 메서드
	public void method() {	// Outter 클래스가 생성이 되어야만 method가 실행됨
		// 로컬 변수
		int score = 20;
		// 로컬 클래스 : method()내에서만 사용하려는 목적으로 정의하고 사용
		class LocalClass {	// 정의
					
		}
		// 로컬 변수
		LocalClass lc = new LocalClass();	// 사용
		
		// 불가능 : 정적 -> 객체와 생성과는 무관하게 존재 -> 서로 모순되므로 불가능
//		static class StaticLocal {
			
//		}
	}
}

// 중첩 클래스가 아니고 별개의 클래스이다. 파일만 같이 사용한 것 뿐임.
class Engine {
	
}