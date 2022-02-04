package ch14.sec1_rhamda;

public class RhamdaExample {

	public static void main(String[] args) {
		// 왼쪽 : Runnable 인터페이스 -> 추상메소드로 run()메소드를 가지고있음
		// 오른쪽 : 익명구현객체 (Runnable 인터페이스를 구현 객체)
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("실행문을 실행합니다.");
			}
		};
		runnable.run();
		
		// 람다식을 사용해서 표현
		Runnable runnable2 = () -> { 
			System.out.println("실행문을 실행합니다.");
		};
		
		// 실행문이 한 줄일 때는 { } 를 생략할 수 있다.
		Runnable runnable3 = () -> System.out.println("실행문을 실행합니다.");
	}
}
