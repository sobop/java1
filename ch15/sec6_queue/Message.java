package ch15.sec6_queue;

public class Message {
	public String command;	// 메시지 식별자
	public String to;		// 목적지(대상)
	public String content;	// 내용
	
	public Message(String command, String to, String content) {
		this.command = command;
		this.to = to;
		this.content = content;
	}
}
