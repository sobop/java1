package ch15.list_collection;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바");
		for(String name : list) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

}
