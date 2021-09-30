package classTest;

public class GoodsStock2 {
	//속성
	private String code;
	private int stockNum; 
	
	//기본생성자
	GoodsStock2() {}
	
	//생성자 오버로딩
	GoodsStock2(String code, int stockNum){ //()괄호 안의 갈색이 아래 오른쪽에 쓰인다.
		this.code = code;
		this.stockNum = stockNum;
	}
	
	
	//기능
	void addStock(int amount) {
		stockNum += amount;
	}
		
	int subtractstock (int amount) {
		if(stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}
	
	// 현재 재고수량을 리턴하는 기능
	int getStockNum () {
		return stockNum;
	}
	
	
}
