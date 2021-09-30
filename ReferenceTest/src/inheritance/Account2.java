package inheritance;

public class Account2 {
	private String accountNo;
	private int balance;
	private String name;
	
	
//	public Account2() {
//		super();
//	}
	public Account2(String accountNo, int balance, String name) {
		super(); 
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}
//	public Account2(String accountNo, String name) {
//		super();
//		this.accountNo = accountNo;
//		this.name = name;
//	}
	void deposit (int amount ) {
		balance += amount;
	}
	int withdraw (int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	
}
