package inheritance;

//Account2
//CheckingAccount => Account2���� �����Ѵ�.

public class TrafficCardAccount extends CheckingAccount {

	// CheckingAccount => ���¹�ȣ, ������, �ܾ�, ī���ȣ.
	// CheckingAccount =>�Ա��ϴ�, ����ϴ�, üũī�� ����.

	// ����ī�� ��ɿ���
	private boolean hasTrafficCard;

	// ������
	public TrafficCardAccount(String accountNo, int balance, String name, String cardNo, boolean hasTrafficCard) {
		super(accountNo, balance, name, cardNo); // ��ӹ��� ��
		this.hasTrafficCard = hasTrafficCard; // �ڽĸ��� �Ӽ�
	}

	// ����ī�� ����� �ִٸ� ����� �����Ѵ�.
	// �Է°� : ī���ȣ, ����� ����
	// ��ȯ�� : ����

	int payTrafficCard (String CardNo, int amount) {
		if(!hasTrafficCard) { //hasTrafficCard !=true
			System.out.println("����ī�� ����� �����ϴ�.");
			return 0;
		}
		return pay(CardNo, amount);
	}

}

