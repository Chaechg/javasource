package classTest;


public class GoodsStock {
	//�Ӽ� : ��ǰ�ڵ�(p12345), ������(100)
	//��� : ������ ����(�Է°�-����, ��°� ����), ������ ����(�Է°�-����, ��°��� ���� ������)
	
	String code;
	int stockNum; //10������ 20���� �� ���� ����.
	
	//���
	//������ ���� (�Է°�-����, ��°� ����)
	void addStock(int amount) {
		stockNum += amount;
	}
	
	//������ ����(�Է°�-����, ��°��� ���� ������)
	int subtractstock (int amount) {
		if(stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}
	
	
	
	
}
