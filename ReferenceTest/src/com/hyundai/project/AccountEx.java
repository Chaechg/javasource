package com.hyundai.project;

import java.util.Scanner;

import com.samsumg.project.Account;
//import는 같은 패키지가 아닌 클래스를 불러올 때 필요

public class AccountEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//상단에 import 구문이 들어옴 java.util.Scanner에 들어있는 클래스가 적용되는 것이다.
		 
		
		
		// 홍길동 계좌
		Account account1 = new Account("122-01-12222",10000,"홍길동");
//		account1.accountNo="122-01-12222";
//		//The field Account.accountNo is not visible
//		account1.balance = 10000;
//		account1.name="홍길동";
//		
		//입금
		account1.deposit(50000);
		//void는 호출만 한다.
		
		
		//출금
		System.out.println("현재 잔액 : "+account1.withdraw(30000));
		
	}
}
