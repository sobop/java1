package ch12.sec2_thread_name;

// 방법 2 (Thread 클래스를 상속해서 자식 스레드 클래스를 정의)
public class ThreadB extends Thread {
	// 생성자에서 스레드이름을 설정하지 않으면 default로 이름을 명명한다.
	// Thread-n (n번째)
	// Thread 클래스의 run() 메소드를 재정의
	@Override
	public void run() {
		// 스레드가 실행되는 부분
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
