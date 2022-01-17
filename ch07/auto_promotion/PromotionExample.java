package ch07.auto_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환 : 직계가족만 대입이 가능
		// 부모 클래스 타입 = 자식 클래스 타입
		A a = new B();	// 자동 타입 변환 : 부모 = 자식
		B b = new C();	// 자동 타입 변환
		A d = new D();
		A e = new E();	// 부모 = 손자

		// 방계
//		B d2 = new D();	// 방계는 대입 불가능
//		B e2 = new E();
//		C e3 = new E();
	}

}
