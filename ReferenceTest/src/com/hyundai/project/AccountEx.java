package com.hyundai.project;

import java.util.Scanner;

import com.samsumg.project.Account;
//import�� ���� ��Ű���� �ƴ� Ŭ������ �ҷ��� �� �ʿ�

public class AccountEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//��ܿ� import ������ ���� java.util.Scanner�� ����ִ� Ŭ������ ����Ǵ� ���̴�.
		 
		
		
		// ȫ�浿 ����
		Account account1 = new Account("122-01-12222",10000,"ȫ�浿");
//		account1.accountNo="122-01-12222";
//		//The field Account.accountNo is not visible
//		account1.balance = 10000;
//		account1.name="ȫ�浿";
//		
		//�Ա�
		account1.deposit(50000);
		//void�� ȣ�⸸ �Ѵ�.
		
		
		//���
		System.out.println("���� �ܾ� : "+account1.withdraw(30000));
		
	}
}
