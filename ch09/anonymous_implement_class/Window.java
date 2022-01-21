package ch09.anonymous_implement_class;

// 화면 창

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	// 필드 : 자동타입변환 : 인터페이스 = 익명구현객체 -> 전화를 겁니다.
	Button.OnClickListener listener = new Button.OnClickListener() {
		// 익명구현객체를 정의하는 부분
		// 추상 메서드를 재정의
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	// 생성자에 익명 구현 객체를 사용
	public Window() {
		System.out.println("Window()");
		// 이벤트 핸들러를 등록 : 버튼을 누르면 해야될 동작을 등록
		btn1.setOnClickListener(listener);	// 전화를 겁니다.
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 전송합니다.");
			}
		});	// 메시지를 전송합니다.
	}
}
