package ch09.exam.p6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;	// 수정 불가
		Chat chat = new Chat() {	// 익명 객체
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "[" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {	// 부모 클래스
		void start() {}
		void sendMessage(String message) { }
	}
}
