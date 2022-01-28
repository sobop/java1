package ch15.map_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map : 키와 값의 쌍 (Map.Entry 객체)를 저장
 * - 키와 값은 객체 -> 기본 데이터 타입은 안된다.
 * - 키는 고유 : 객체면 논리적 동등 비교를 적용해야 한다.
 * - 검색이 빠르다 : 키를 사용하면 바로 값을 얻을 수 있으므로
 * 	+ 키를 사용해서 어떻게 저장을 하면 빠르게 검색할 수 있는가?
 *  + 바이너리(이진) 트리 : Log N (밑 2) -> 키 값을 저장
 * 	equals(), hashCode()를 재정의해야 한다.
 * - 값은 중복 저장할 수 있음.
 * - 복잡 : 키, 값, (키,값)
 * - 구현 객체 : HashMap, HashTable(동기화), Properties, LinkedHashMap, TreeMap
 * - 추가 : put(키, 값) 메소드를 사용
 * - 검색 : 값 = get(키)
 * - Set을 이용해서 전체 구성원 정보를 가져올 수 있다.
 */
public class HashMapExample {
	// 자동 import 단축 키 : control+shift+o
	public static void main(String[] args) {
		// (이름, 점수) 쌍을 저장하는 HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 저장
		map.put("홍길동", 90);
		map.put("이수만", 100);
		map.put("이수만", 95);	// 키값이 위의 것과 같다. 이수만의 점수가 100->95 변경됨
		map.put("유재석", 87);
		// 가져오기
		int score = map.get("홍길동");
		System.out.println("value = " + score);
		
		// KeySey을 사용해서 전체 멤버를 출력
		Set<String> keySet = map.keySet();	// 키들의 집합을 얻는다.
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			int s = map.get(key);
			System.out.println(key + ", " + s);
		}
		// Map은 순서가 없다.
		
		// Map.Entry의 Set을 이용해서 전체를 출력 (키, 값)
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			int s = entry.getValue();
			System.out.println(key + ", " + s);
		}
		
		map.remove("홍길동");	// Map의 요소를 삭제
		map.clear();		// 전체 요소를 삭제
		System.out.println("전체 크기 = " + map.size());
	}

}
