package inheritance;

public class BonusPointAccount extends Account2 {
	//���¹�ȣ, ������, �ܾ�, ���ʽ�����Ʈ
	//�Ա��ϴ�(���ʽ�����Ʈ �߰�), ����ϴ�
	//�Ա��� �ϸ鼭 ���ʽ� ����Ʈ�� �߰�	
	private int bonusPoint;
	
	public BonusPointAccount(String accountNo, int balance, 
			String name,int bonusPoint) {
		super(accountNo, balance, name);
		this.bonusPoint = bonusPoint;
	}
	@Override
	void deposit(int amount) {
		// �����ϴ� 
		super.deposit(amount);
		//setBalance(getBalance()+amount); //�θ� ������ �ִ�.
		
		//���ʽ�����Ʈ += ���ݾ��� 0.1%�� ���ʽ� ����Ʈ �߰�
		bonusPoint += amount*0.001;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	
}
