package ch15.set_collection;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Set에 넣으려면 논리적 동등비교를 위해서 equals()와 hashCode를 재정의
	// 어떻게 고유하게 식별할 것인가?
	// 정책을 정한다. : 이름과 나이가 다르면 다른것으로 간주한다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(name.equals(m.name) && age == m.age) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
//		return Objects.hash(name, age);
		return name.hashCode() + age;	// name : String
	}
}
