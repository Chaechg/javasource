package com.samsumg.project;

//public - 아무데서나 부를 수 있다.
//그러나 멤버 변수(필드)에는 아무것도 붙지 않았다.
public class Account {
	// 속성 : 계좌번호(122-01-12222), 잔액(정수),이름
	//기본생성자
	// 기능 : 입금한다(입력값 : 입금액, 반환값 : 없음) => 현재잔액 += 입금액
	//      출금한다. (입력값 : 출금액, 반환값 : 현재잔액) => 현재잔액 -=출금액
	
	// 속성
	//아무것도 없으면 defalt(package)상황이다.
	private String accountNo; 
	private int balance;
	private String name;
	
	//생성자
	public Account(String accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}






	//기능
	public void deposit (int amount ) {
		balance += amount;
	}
	
	public int withdraw (int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}
	
	
	
	
}
