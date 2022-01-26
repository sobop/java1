package ch10.exam;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());	// 아이디가 존재하지 않습니다.
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());	// 패스워드가 틀립니다.
		}
	}

	public static void login(String id, String password) /* 작성 영역 */
		throws NotExistIDException, WrongPasswordException {
		if(!id.equals("blue")) {
			// NotExistException 발생
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("12345")) {
			// WrongPasswordException 발생
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
