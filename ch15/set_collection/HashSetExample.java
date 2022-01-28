package ch15.set_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set : 중복 저장 불가 (수학의 집합)
 * 	- 인터페이스
 * 	- 순서가 없다.
 * 	- 구현 객체 : HashSet, LinkedHashSet, TreeSet
 * 	- 어떤 객체든지 추가(저장) : 논리적 동등 비교를 구현해야 한다
 * 		-> equals()메소드와 hashCode() 메소드를 재정의
 *  - iterator를 사용해서 하나씩 반복해서 꺼낼 수 있음. 임의의 순서로 나온다.
 */
public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();	// HashSet 객체를 생성
		// Set에 멤버를 추가
		set.add("자바");
		set.add("자바");	// 추가되지 않음
		set.add("HTML");
		set.add("CSS");
		// 하나씩 꺼낸다.
		Iterator<String> iterator = set.iterator();	// 반복해서 가져오는 반복자
		while(iterator.hasNext()) {	// 멤버가 있을 때까지 반복
			String lesson = iterator.next();	// 하나씩 꺼낸다.
			System.out.println(lesson);
		}
		// 크기
		System.out.println("셋의 크기 : " + set.size());
		System.out.println(set.isEmpty());	// 빈 집합인지?
		
		System.out.println();
		// enhanced for문을 사용
		for(String lesson : set) {
			System.out.println(lesson);
		}
		set.clear();	// 비운다.
		System.out.println(set.isEmpty());	// 빈 집합인지?
	}

}
