package classTest;

public class Account {
	// 속성 : 계좌번호(122-01-12222), 잔액(정수),이름
	//기본생성자
	// 기능 : 입금한다(입력값 : 입금액, 반환값 : 없음) => 현재잔액 += 입금액
	//      출금한다. (입력값 : 출금액, 반환값 : 현재잔액) => 현재잔액 -=출금액
	
	// 속성
	String accountNo;
	int balance;
	String name;
	
	//기본생성자
	Account () {}

	//기능
	void deposit (int amount ) {
		balance += amount;
	}
	
	int withdraw (int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}
	
	
	
	
}
