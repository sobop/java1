package ch10.user_defined_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
//		account.balance = 10000;	// 필드로는 접근 불가능(private 접근제한)
		// getter와 setter로 접근 (public 제한자)
		account.setBalance(10000);
		try {
			account.withdraw(12000);	// 예외 발생
		} catch(BalanceInsufficientException e) {
			// e : 예외 정보가 실린다.
			// e.getMessage() : 예외의 세부 원인 정보를 얻을 수 있다. -> 생성자의 매개변수로 전달한 값
			// e.printStackTrace() : 예외가 발생하면 스택 정보를 출력하는 메서드
			System.out.println("예외 발생 : " + e.getMessage());
			e.printStackTrace();
		}
		
		// 사용자에게 접근하기 용이한 곳에서 예외 처리를 한다.
		// 메뉴 입력 받고 메뉴에 따라서 입금, 출금, 잔고 출력
		// 예외에 따라 처리 흐름을 제어를 하도록 예외 처리를 여기서 한다.
	}

}
