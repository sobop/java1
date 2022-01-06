package ch04;

import java.util.ArrayList;
import java.util.List;

// 중첩 if문 : if문안에 또 다른 if문을 사용하는 경우
// if문이 몇 개까지 중첩할 수 있느냐는 제한이 없다.
// 보통 2개 정도 한다.

public class NestedIfExample {

	public static void main(String[] args) {
		// 여론조사 : 대선 후보 지지율
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("홍길동1", 20, "윤", true));
		persons.add(new Person("홍길동2", 30, "이", false));
		persons.add(new Person("홍길동3", 40, "이", true));
		persons.add(new Person("홍길동4", 50, "윤", true));
		persons.add(new Person("홍길동5", 60, "윤", false));
		persons.add(new Person("홍길동6", 20, "이", true));
		persons.add(new Person("홍길동7", 40, "윤", true));
		persons.add(new Person("홍길동8", 50, "안", false));
		persons.add(new Person("홍길동9", 30, "윤", true));
		persons.add(new Person("홍길동0", 30, "윤", false));
		for(Person person : persons) {	// enchanced for문 (각 사람에 대하여 반복)
			// 연령대별로 분류
			if(person.age >= 10 && person.age < 20) {			// 10대
				// 성별로 분류
				if(person.gender == true) {	// 남성
					// 선호하는 후보
					if(person.candidate.equals("윤")) {
						// 후보별 계수를 할 수 있음
					} else if(person.candidate.equals("이")) {
						
					} else if(person.candidate.equals("안")) {
						
					}
				} else {	// 여성
					
				}
			} else if(person.age >= 20 && person.age < 30) {	// 20대
				if(person.gender == true) {	// 남성
					
				} else {	// 여성
					
				}
			} else if(person.age >= 30 && person.age < 40) {	// 30대
				if(person.gender == true) {	// 남성
					
				} else {	// 여성
					
				}				
			} else if(person.age >= 40 && person.age < 50) {	// 40대
				if(person.gender == true) {	// 남성
					
				} else {	// 여성
					
				}				
			} else if(person.age >= 50 && person.age < 60) {	// 50대
				if(person.gender == true) {	// 남성
					
				} else {	// 여성
					
				}				
			} else if(person.age >= 60 && person.age < 70) {	// 60대
				if(person.gender == true) {	// 남성
					
				} else {	// 여성
					
				}				
			}
		}
	}

}
