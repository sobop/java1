package ch11.deep_clone_method;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;		// 참조변수 : 주소를 저장
	public int age;			// 기본데이터타입
	public int[] scores;	// 참조변수 : 점수
	public Car car;			// 참조변수 : 주소를 저장

	// 생성자
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// clone() 메서드는 재정의하지 않은 상태
	// 깊은 복제를 위해서 clone() 메서드를 재정의한다.
	// 참조 변수가 가르키는 객체를 복제 : scores[], Car
	@Override
	public Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();	// Object 클래스의 clone() : 얕은 복제
		// 깊은 복제 
		// scores 객체를 복제
		cloned.scores = Arrays.copyOf(scores, scores.length);
		// car 객체를 복제
		cloned.car = new Car(car.model);
		return cloned;
	}
	
	// 복제
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
