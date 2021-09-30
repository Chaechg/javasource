package classTest;

public class Account3 {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����),�̸�
	//�⺻������
	// ��� : �Ա��Ѵ�(�Է°� : �Աݾ�, ��ȯ�� : ����) => �����ܾ� += �Աݾ�
	//      ����Ѵ�. (�Է°� : ��ݾ�, ��ȯ�� : �����ܾ�) => �����ܾ� -=��ݾ�
	
	// �Ӽ�
	private String accountNo;
	private int balance;
	private String name;
	
	
	//�⺻�����ڸ���� //constructor = ������
	//���콺 ������ >> Soruce >> Generate Constructor from superclass...
	public Account3() {
		super();
	}
	//������ �����
	//���콺 ������ >> Soruce >> Generate Constructor using Fields....
	public Account3(String accountNo, int balance, String name) {
		//super(); 
//		this.accountNo = accountNo;
//		this.name = name;
		this(accountNo,name); //this() : �ٸ� ������ ȣ��
							  // super�� ������ ����� �� �ִ�. 
							  // �밳 �ڵ����� �ϼ��Ǵ� �����ڸ� ����Ѵ�.
		this.balance = balance;
		
	}
	public Account3(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}
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
	
	//�ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾���
	// set~ ���� �޼ҵ带 �ۼ��Ѵ�.
	
	//������� : ���¹�ȣ�� �����ϰ� �ʹٸ�, �޼ҵ带 ��� ���� ���ΰ�?
	// set + ctrl + space  �Ǵ�
	// ���콺 ������ >> source >> generate getters and setters...
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	// ��������� �̸��� �����ϰ� �ʹٸ�?
	public void setName(String name) {
		this.name = name;
	}
	
	//�ܾ� ����
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// ��� ������ ���� �����ϰ� �ʹٸ�?
	// get~~ + ctrl + space
	// ���� �ܾ� ����
	public int getBalance() {
		return balance;
	}
	
	
	
}
