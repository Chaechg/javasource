package shop;

//�������̽� = �����߻�ȭ => ����ʵ�, �߻�޼��常 ���� �� �ִ�.
// jdk 8 version => dafault, static�� ���� �� �ֱ�� ��

public interface Ishop {
	void setTitle(String title);	//public abstract�� ������ ���̴�. 
	void genUser();
	void genProduct();
	void start();
}
