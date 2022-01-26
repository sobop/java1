package ch10.user_defined_exception;

public class Account {
	private int balance;	// 자신의 객체에서만 접근 가능
	
	// 입금
	// 출금 : 잔고가 부족
	// throws 예외 -> 나를 호출한 곳으로 예외를 던진다.
	public void withdraw(int money) throws BalanceInsufficientException {	// 인출하는 금액이 더 크면
		if(money > balance) {	// 잔고부족
			// 사용자가 정의한 예외 발생 -> 예외처리 : 1. try-catch 2. 예외 던지기 
			throw new BalanceInsufficientException("잔고가 부족");
		}
	}

	
	// getter/setter
	public int getBalance() {	// 읽기(얻기)
		return balance;
	}

	public void setBalance(int balance) {	// 쓰기(저장)
		this.balance = balance;
	}
}
