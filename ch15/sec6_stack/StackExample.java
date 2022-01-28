package ch15.sec6_stack;

import java.util.Stack;

/*
 * Stack : Last In First Out(LIFO)
 * - JVM stack : 메소드를 실행할 때 변수를 저장
 * - 메소드 : push(넣을 때), peek(맨 위에 있는 데이터를 얻을 때 : 제거하지 않음)
 * 	pop() : 맨위를 제거하고 얻기
 */
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {	// LIFO
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
