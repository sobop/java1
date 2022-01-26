package ch11.object_class;

// 회원정보를 저장하는 클래스
// Object 클래스를 상속 받음
// equals() 메서드를 가지고 있음 -> 논리적 동등비교를 위해서 equals() 메서드를 재정의한다.
/*	물리적 비교 : 같은 주소를 가지는 동일한 객체를 비교 (메모리 주소 비교)
 * 	논리적 동등 비교 : 물리적으로는 다른 주소를 가지지만 
 * 				    가지고 있는 내용이 같을 경우 동등한 것으로 간주
 * 		equals() 메소드를 사용 -> equals() 메서드를 재정의하여
 * 		내용이 같은면 같은 것(true로 반환)으로 해주어야 함
 * 
 * 
 */

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 논리적 동등비교를 위해서 재정의한다.
	// 현재는 회원정보 중에 id가 같으면 true를 반환(같은 회원이라고 간주)
	// 전제조건은 회원은 고유한 id(서로 다른 id)를 사용한다.
	@Override
	public boolean equals(Object obj) {	// obj에는 어떤 클래스도 대입될 수 있음 : 자동타입변환
		// 필드 id와 obj가지는 id를 비교해서 같으면 true를 반환
		// obj가 Member 클래스인지 비교
		if(obj instanceof Member) {	// Member
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	// hashCode() 메서드를 재정의하지 않음
	@Override
	public int hashCode() {
//		return super.hashCode();	// super : Object 클래스
		return id.hashCode();	// 문자열이 같으면 같은 hashCode() 값을 가진다.
	}
	// 필드 id의 hashCode() 반환 -> String id -> 저장된 값이 같으면 같은 주소를 가짐 
}
