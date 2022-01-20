package ch08.promotion;

public class PromotionExample {

	public static void main(String[] args) {
		InterfaceA a= new B();	// 자동타입변환 : 왼쪽 인터페이스, 오른쪽 구현개체
			// 구현객체 B가 InterfaceA를 구현하였으므로 대입이 가능
		a = new D();	// 손자 : InterfaceA를 구현 -> B를 상속받음
		a = new C();	// 구현객체
		a = new E();	// 손자
		B b = new D();
//		b = new C();	// 직계가 아님 -> 대입불가
	}

}
