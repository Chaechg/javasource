package inheritance;

import java.awt.CardLayout;
import java.util.Scanner;

public class CheckingAccount extends Account2 {
	//���¹�ȣ, ������, �ܾ� => �θ�
	//�Ա��ϴ�, ����ϴ� => �θ�
	
	//ī���ȣ(111-11-1234)
	private String cardNo;
	
	public CheckingAccount(String accountNo, int balance, String name, String cardNo) {
		super(accountNo, balance, name);
		this.cardNo = cardNo;
	}

	//ī�尪�� �����Ѵ�.
	//�Ѿ�� ī���ȣ�� ���� �߱޵� ī���ȣ�� ������, ���ݾ��� ���� �ܾ׺��� ���� �� Ȯ�� �Ŀ� ����
	//�Է°� : ī���ȣ, ���ݾ�
	//��ȯ�� : ����(int)
		
//	int trafficPay (int amount) {	
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("ī���ȣ : ");
//		if (cardNo.equals(scanner)) {
//		}else if (amount <= getBalance()) {
//			amount =- getBalance();
//		}else {
//			System.out.println("�ܾ��� �����մϴ�.");
//		}
//		return getBalance();
//	}
	
	int pay(String cardNo, int amount) {  // 2���� �Է� �޴´�.

		if(!cardNo.equals(this.cardNo)|| getBalance() < amount) {
			System.out.println("ī���ȣ�� ���ݾ��� Ȯ���� �ּ���");
			return 0;	// ���� �ڵ带 �������� �ʰ� ����. break;�� ����.
		}
		// �ܾ� = ���� �ܾ� - ī�����
		//setBalance(getBalance() - amount);
		//���� �θ��� withdraw�� ������ ��ɰ� ����.
		//���� �ٽ� ������ ���� �θ��� withdraw�� ����ϸ� ��
		return withdraw(amount);
	}
	
}
