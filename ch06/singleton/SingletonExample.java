package ch06.singleton;

public class SingletonExample {

	public static void main(String[] args) {
//		SingleTon singTon = new SingleTon();	// 에러
		// 다른 클래스에서는 "SingleTon 객체를 생성할 수 없음
		SingleTon s1 = SingleTon.getInstance();	// SingleTon 객체의 주소를 얻는다.
		s1.num = 10;	// 참조변수 s1을 통해서 SingleTon 객체의 필드에 접근
		System.out.println(s1.num);

		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s1 == s2);	// 주소값 비교 : true
		method();
	}
	
	static void method() {
		SingleTon s3 = SingleTon.getInstance();
		System.out.println(s3.num);
	}

}
