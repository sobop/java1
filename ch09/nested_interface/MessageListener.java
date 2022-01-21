package ch09.nested_interface;

import ch09.nested_interface.Button.OnClickListener;

// 메시지를 전송하는 구현 객체

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 전송합니다.");
	}

}
