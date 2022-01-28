package ch15.sec5_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		for(String word : treeSet) {
			System.out.println(word);
		}
		
		System.out.println("-----------------------------");
		
		// 범위 검색
		System.out.println("c-f 사이의 단어 검색");
		NavigableSet<String> naviSet = treeSet.subSet("c", true, "f", true);
		for(String word : naviSet) {
			System.out.println(word);
		}
	}

}
