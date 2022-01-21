package ch09.nested_interface;

import ch09.nested_interface.Button.OnClickListener;

// 버튼이 눌리면 전화를 거는 구현 클래스

public class CallListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
