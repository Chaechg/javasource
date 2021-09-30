package classTest;

public class AccountEx2 {
	public static void main(String[] args) {
		// 홍길동 계좌
		Account2 account1 = new Account2();
//		account1.accountNo="122-01-12222";
//		account1.balance = 10000;
//		account1.name="홍길동";
		
		//계좌번호 변경
		account1.setAccountNo("122-01-12222");
		//잔액
		account1.setBalance(10000);
		//이름
		account1.setName("홍길동");
		
		//입금
		account1.deposit(50000);
		//account1은 이름을 부여할 수 없다.
		System.out.println("입금 후 잔액 : "+account1.getBalance());
		
		//출금
		System.out.println("현재 잔액 : "+account1.withdraw(30000));
		
		//성춘향 계좌
		Account2 account2 = new Account2("122-01-13333", "성춘향");
		System.out.println("현재 잔액 조회 : "+account2.getBalance());
		
		
		
		
		
		//박보검 계좌
		Account2 account3 = new Account2("123-01-1444", 1000000, "박보검");
		System.out.println("현재 잔액 조회 : "+account3.getBalance());
		
		
		
		
		
	}
}
