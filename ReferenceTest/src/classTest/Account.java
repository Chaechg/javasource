package classTest;

public class Account {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����),�̸�
	//�⺻������
	// ��� : �Ա��Ѵ�(�Է°� : �Աݾ�, ��ȯ�� : ����) => �����ܾ� += �Աݾ�
	//      ����Ѵ�. (�Է°� : ��ݾ�, ��ȯ�� : �����ܾ�) => �����ܾ� -=��ݾ�
	
	// �Ӽ�
	String accountNo;
	int balance;
	String name;
	
	//�⺻������
	Account () {}

	//���
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
