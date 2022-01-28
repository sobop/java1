package ch15.set_collection;

import java.util.HashSet;
import java.util.Set;

public class HaseSetMemberExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 28));
		set.add(new Member("이만수", 30));
		set.add(new Member("유재석", 27));
		set.add(new Member("유재석", 27));
		System.out.println("크기 : " + set.size());
		// 논리적 동등 비교를 구현하지 않으면 중복해서 저장이 된다.
		// 논리적 동등 비교를 구현하면 중복 저장이 되지 않는다.
		if(set.contains(new Member("유재석", 27))) {
			System.out.println("존재합니다.");
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}

}
