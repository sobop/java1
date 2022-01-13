package ch06.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		for(int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {	// 비어있는 계좌를 찾는다.
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		for(int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				Account account = accountArray[i];
				System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
			} else {
				break;
			}
		}
	}
	

	private static void deposit() {
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
			if (account != null) {
				account.setBalance(balance + account.getBalance());
			} else {
				System.out.println("계좌번호를 확인하세요.");
			}
		
	}
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
			if (account != null) {
			account.setBalance(account.getBalance() - balance);
		} else {
			System.out.println("계좌번호를 확인하세요.");
		}
	
	}
	
	private static Account findAccount(String ano) {
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[1] == null) {
				return null;
			}
			else if(accountArray[1].getAno().contentEquals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}
