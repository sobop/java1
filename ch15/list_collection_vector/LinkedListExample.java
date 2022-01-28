package ch15.list_collection_vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// 데이터를 중간에 추가할 때는 LinkedList가 더 빠르다.
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
//			list1.add(0, String.valueOf(i));	// 중간에 추가
			list1.add(String.valueOf(i));	// 맨뒤에 추가
		}
		endTime = System.nanoTime();	// 중간에 추가 : 16ms
										// 맨뒤에 추가 : 4.9ms
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
//			list2.add(0, String.valueOf(i));	// 중간에 추가
			list2.add(String.valueOf(i));	// 맨뒤에 추가
		}
		endTime = System.nanoTime();	// 중간에 추가 : 2.2ms
										// 맨뒤에 추가 : 8.9ms 소요
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
	}
}



