package ch09.anonymous_implement_class;

public class Button {
	// 필드
	OnClickListener listener;
	// setter
	void setOnClickListener(OnClickListener listener) {
		System.out.println("Button:setOnClickListener()");
		this.listener = listener;
	}
	// 버튼이 눌리면 실행되는 동작
	void touch() {
		System.out.println("Button:touch()");	// 로그를 남긴다.
		listener.onClick();
	}
	
	// 중첩인터페이스 정의
	interface OnClickListener {
		void onClick();
	}
}
