package classTest;

public class SubscriberInfo {
	//�Ӽ� - �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ�
	
	// ������ - �̸�, ���̵�, �н����常 �ʱ�ȭ�� �� �� ��ü ���� (�ʼ�����)
	//		- �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּҸ� �ʱ�ȭ �� �� ��ü ����
	
	//��� - ��й�ȣ ����, ��ȭ��ȣ ����, �ּ� ����
	//setter�޼ҵ�
	
	//�Ӽ�
	private String name;
	private String id;
	private String pw;
	private String tel;
	private String addr;
	
	//������
	public SubscriberInfo(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	public SubscriberInfo(String name, String id, String pw, String tel, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.addr = addr;
	}
	
	//���
//	public void setPw(String pw) {
//		this.pw = pw;
//	}
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
//	public void setAddr(String addr) {
//		this.addr = addr;
//	} �Ǵ�
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
}
