package ch11.object_class;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// HashMap : (키, 값)쌍으로 저장. 키값이 고유해야 한다.
		HashMap<Key, String> hashMap = new HashMap<>();
		hashMap.put(new Key(1), "홍길동");	// 저장
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

	// Key 클래스의 hashCode()와 equals() 메서드를 재정의하지 않으면
	// 논리적 동등비교를 할 수 없음 -> 다른 객체가 되어 값을 꺼낼 수 없음 -> null 출력됨
	// Key 클래스의 hashCode()와 equals()를 재정의하여 논리적동등비교를 하도록 한다.
	// 논리적 동등 비교에 의하여 물리적으로 다르지만 논리적으로 같아서 값을 얻을 수 있다.
}
