package ch06.singleton;

// 싱글톤(SingleTon) : 하나아ㅢ 프로그램에서 하나만 생성해서 사용
// 공유 데이터 관리, 시간관리(하나의 객체가 시간을 관리)
// 여러개가 생김으로써 데이터의 불일치를 방지하려는 목적이 있다.
public class SingleTon {
	// 싱글톤을 만드는 방법
	// 객체의 생성을 다른 클래스가 할 수 없어야한다.
	// -> 다른 클래스가 생성을 허용한다면 여러개가 생길 수 있다.
	// 생성자 : 접근제한자를 private -> 다른 클래스는 생성자를 호출할 수 없음
	private SingleTon() { }
	// 자기 자신만이 객체를 하나 생성 -> 객체에 접근하려면 참조변수를 통해서 접근 가능
	private static SingleTon instance = null;	// 참조변수 -> 정적필드
	// 클래스가 데이터영역에 로딩될 때, 존재하도록 static(정적)으로 선언
	// 다른 클래스에게 SingleTon 객체에 접근하는 방법을 제공
	public static SingleTon getInstance() {
		if(instance == null) {	// 처음으로 호출될 때만 객체를 생성
			instance = new SingleTon();	// singleTon 객체를 생성
		}
		return instance;
	}	
	// 공통 데이터를 저장
	int num;	// 공통 데이터
}
