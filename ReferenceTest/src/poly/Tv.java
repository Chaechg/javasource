package poly;

public class Tv extends Product {

	public Tv(int price) {
		super(price);
	}
	@Override   // 
	public String toString() {
		return "Tv";  //object�� �Ѱ��� ���� �ּҰ� �����Ƿ�, ��������.
	}
	// �������̵� ������ ��ӿ� �ִ�.
	// �׷��� Product class���� toString�� ����.
	// �� ������� object���� ������ ���̴�.
}
