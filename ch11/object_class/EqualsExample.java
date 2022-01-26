package ch11.object_class;

/*
 * Object 클래스 : 모든 클래스의 부모 클래스
 * == : 주소를 비교할 때 사용
 * equals() : 내용을 비교할 때 사용
 * hashCode() : 객체를 ID를 식별할 때 사용 (물리적인 ID, 메모리 주소)
 * clone() : 객체를 복제할 때 사용
 * wait() : 동기화, 병렬처리
 * notify() : 동기화, 병렬처리
 * toString() : 객체의 정보를 반환. 객체 정보를 출력할 때 사용
 * finalize() : GC가 메모리에서 객체를 제거할 때 호출된다.
 */
public class EqualsExample /* extends Object */ {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// 주소를 비교
		System.out.println("obj1==obj2 : " + (obj1 == obj2));	// false
		// 내용을 비교 (주소를 비교하는 것과 같다.) equals() 메서드가 ==와 같다.
		System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));	// false
	}

}
