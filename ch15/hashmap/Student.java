package ch15.hashmap;

public class Student {	// HashMap의 키로서 사용 -> 고유한 값 -> 논리적 동등비교
						// equals()와 hashCode()를 재정의 해야 함
	public int sno;		// 학번
	public String name;	// 학생 이름
	
	public Student(int sno, String name) {	// 필드를 초기화
		this.sno = sno;
		this.name = name;
	}
	
	// 현재 sno, name과 obj의 sno, name과 비교 -> 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {	// 같은 Student인지 비교
			// obj를 사용해서는 sno, name에 접근할 수 없음
			Student s = (Student)obj;	// 강제 타입 변환
			if(sno == s.sno && name.equals(s.name)) {
				return true;
			}
		}
		return false;
	//	return super.equals(obj);	// 재정의하지 않으면 Object.equals()를 사용
									// 주소를 비교 -> 언제나 다르므로 false
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();	// 물리적인 주소 기반으로 hashcode를 생성 -> 고유
//		return super.hashCode();
	}
}
