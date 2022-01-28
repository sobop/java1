package ch15.hashmap;

import java.util.HashMap;
import java.util.Map;

// 학생, 점수 : Map

public class HashMapExample {

	public static void main(String[] args) {
		// int를 사용하지 말아야 -> 기본데이터타입이 아니라 Wrapper 클래스를 사용
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(1, "홍길동"), 90);	// 키값이 같을 경우는 값이 대체
		map.put(new Student(2, "서세원"), 85);
		map.put(new Student(3, "유재석"), 95);
		// 접수를 얻기
		int score = map.get(new Student(1, "홍길동"));
		System.out.println("홍길동의 점수: " + score);
		System.out.println("학생 수 : " + map.size());
	}

}
