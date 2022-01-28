package ch15.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	// 최고 점수를 받은 아이디
		int maxScore = 0;	// 최고 점수 저장
		int totalScore = 0;	// 점수 합계 저장
		
		// 작성 위치
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			String id = entry.getKey();
			int value = entry.getValue();
			if(maxScore < value) {
				maxScore = value;	// 새로운 최대값
				name = id;			// 최고 점수를 가지는 아이디
			}
			totalScore += value;
		}
		
		// 평균점수: 91
		// 최고점수: 96
		// 최고점수를 받은 아이디: blue
		System.out.println("평균점수: " + totalScore / map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}