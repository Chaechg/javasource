package classTest;

public class GoodsStock2 {
	//�Ӽ�
	private String code;
	private int stockNum; 
	
	//�⺻������
	GoodsStock2() {}
	
	//������ �����ε�
	GoodsStock2(String code, int stockNum){ //()��ȣ ���� ������ �Ʒ� �����ʿ� ���δ�.
		this.code = code;
		this.stockNum = stockNum;
	}
	
	
	//���
	void addStock(int amount) {
		stockNum += amount;
	}
		
	int subtractstock (int amount) {
		if(stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}
	
	// ���� �������� �����ϴ� ���
	int getStockNum () {
		return stockNum;
	}
	
	
}
