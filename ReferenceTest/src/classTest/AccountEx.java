package classTest;

public class AccountEx {
	public static void main(String[] args) {
		// 홍길동 계좌
		Account account1 = new Account();
		account1.accountNo="122-01-12222";
		account1.balance = 10000;
		account1.name="홍길동";
		
		//입금
		account1.deposit(50000);
		//void는 호출만 한다.
		
		
		//출금
		System.out.println("현재 잔액 : "+account1.withdraw(30000));
		
	}
}
