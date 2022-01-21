package ch09.instance_member_class;

public class Outter {
	// 인스턴스 멤버 클래스
	public class Inner {	// Outter 객체가 생성되어야만 존재
		// 필드, 생성자, 메서드
		// 필드 : 인스턴스 멤버, 정적 멤버 - 검토해야 할 사항 : 존재할 수 있는가?
		int num = 10;		// 사용 가능
//		static String str;	// 사용 불가능 -> 객체의 생성과는 무관하게 존재
			// 모순
		
		// 인스턴스 멤버 메서드
		void method1() {	// 사용 가능
			
		}
		
		// 정적 멤버 메서드
//		static void staticMethod() {	// 사용 불가능
			
//		}
	}
	
	// 정적 멤버 클래스
	public static class StaticInner {	// Outter 객체의 생성과는 무관하게 존재
		// 멤버 : 필드, 생성자, 메서드
		// 멤버 : 인스턴스, 정적
		// 인스턴스 멤버 필드
		int num = 0;				// 가능
		static String str = "홍길동";	// 가능
		
		// 인스턴스 멤버 메서드
		void method1() {			// 가능
			
		}
		
		// 정적 멤버 메서드
		static void staticMethod() {// 가능
			
		}
	}
	
	void method() {	// Outter 클래스가 생성되어야만 존재
		// 로컬 클래스
		class LocalClass {
			// 필드, 생성자, 메서드 : 인스턴스 멤버, 정적 멤버
			// 인스턴스 멤버만 사용 가능. 정적멤버는 사용 불가
			int num = 20;	// 사용 가능
//			static String str = "사용불가";
			
			void method1() {	// 사용 가능
				System.out.println("LocalClass:method1()");
			}
			
//			static void staticMethod() {	// 사용 불가
				
//			}
		}
		
		LocalClass lc = new LocalClass();
		lc.num = 30;
		lc.method1();
	}
	
	void communicateWithServer() {
		// 로컬 클래스
		class CommThread extends Thread {	// 별도의 쓰레드 정의
			@Override
			public void run() {	// 병렬처리
				for(int i = 0;i < 10;i++) {
					// Thread.currentThread().getName() : 실행되는 쓰레드의 이름을 얻는 메서드
					System.out.println("서버와 통신 : " + Thread.currentThread().getName());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	// 서버와 통신 : 잠자기
				}
			}
		}
		CommThread thread = new CommThread();	// 사용 : 생성
		thread.start();	// run() 메서드가 호출됨
	}
}
