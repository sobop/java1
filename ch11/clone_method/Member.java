package ch11.clone_method;

// 객체를 복제를 하려면 Cloneable 인터페이스를 구현해야 한다.
// 재정의할 것이 없지만 복제가 가능하다.

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	// 현재 객체를 복제한 Member 객체를 얻는다.
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();	// 강제타입변환 : clone() 메서드는 Object 클래스를 반환
			// clone() 메서드는 실행 시, 메모리가 부족하면 예외가 발생할 수 있으므로
			// 예외 처리가 필요하다.
		} catch(CloneNotSupportedException e) {	// Cloneable 구현하지 않을 경우 발생
			System.out.println("Cloneable 인터페이스를 구현하지 않음");
		}
		return cloned;
	}
}
