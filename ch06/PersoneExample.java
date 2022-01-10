package ch06;
	// 실행 클래스 : main() 메소드가 있음 -> 프로그램을 실행하는 역활
public class PersoneExample {

	public static void main(String[] args) {
		Person kdhong = new Person();
		// new 연산자 사용 : 객체 생성 -> Person 객체를 저장하기위한 메모리 확보
		kdhong.name = "홍길동";
		kdhong.age = 26;
		System.out.println("이름: " + kdhong.name);
		System.out.println("나이: " + kdhong.age);
		
		Person chpark = new Person("박찬호", 50);
		System.out.println("이름: " + chpark.name);
		System.out.println("나이: " + chpark.age);
	}

}
