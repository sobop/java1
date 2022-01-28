package ch15.sec6_queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue : 인터페이스
 * 구현객체 : LinkedList
 * FIFO (First In First Out) : 은행 대기번호
 * 메시지 큐
 * 들어가는 곳과 나오는 곳이 다르다.
 * Stack : 들어가는 곳으로 나온다. (들어가는 곳과 나오는 곳이 같다)
 * 메소드 : offer(넣을 때), peek(처음으로 들어간 것을 정보를 얻는 것), poll(꺼내오는 것, 제거)
 */
public class QueueExample {

	public static void main(String[] args) {
		// Queue : 들어간 순서대로 작업을 할 수 있다. (FIFO)
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "홍길동", "안녕"));
		messageQueue.offer(new Message("sendSMS", "신용권", "안부인사"));
		messageQueue.offer(new Message("sendKakao", "감자바", "500원"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "에게 " + message.content + " 전송");
				break;
			case "sendSMS":
				System.out.println(message.to + "에게 " + message.content + " 전송");
				break;
			case "sendKakao":
				System.out.println(message.to + "에게 " + message.content + " 전송");
				break;
			}
		}
	}

}
