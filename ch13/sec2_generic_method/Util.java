package ch13.sec2_generic_method;

import ch13.sec2_generic_type.Box;

public class Util {
	public static <T> Box<T> boxing(T t) {
		// 객체를 담는 Box를 생성해서 매개변수로 받은 객체(t)를 담아서 반환
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	// compare라는 제네릭 메소드를 적용한 예
	// compare() 메소드를 사용해서 Pair<K, V> 쌍으로 되어있는 객체를 비교
	// Collection에서 Map.Entry<K, V>
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		// equals() 메소드를 사용하여 비교
		
		// 값을 비교
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
