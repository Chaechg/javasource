package com.samsumg.project;

//public - �ƹ������� �θ� �� �ִ�.
//�׷��� ��� ����(�ʵ�)���� �ƹ��͵� ���� �ʾҴ�.
public class Account {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����),�̸�
	//�⺻������
	// ��� : �Ա��Ѵ�(�Է°� : �Աݾ�, ��ȯ�� : ����) => �����ܾ� += �Աݾ�
	//      ����Ѵ�. (�Է°� : ��ݾ�, ��ȯ�� : �����ܾ�) => �����ܾ� -=��ݾ�
	
	// �Ӽ�
	//�ƹ��͵� ������ defalt(package)��Ȳ�̴�.
	private String accountNo; 
	private int balance;
	private String name;
	
	//������
	public Account(String accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}






	//���
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
