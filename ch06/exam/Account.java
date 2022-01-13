package ch06.exam;

public class Account {
	// 상수 선언
	private String ano;
	private String owner;
	private int balance;
	
	// 이클립스가 제공하는 기능을 이용해서 생성자를 만들 수 있다.
	// 모든 클래스는 Object 클래스를 상속받는다.
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
}
