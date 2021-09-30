package classTest;


public class GoodsStock {
	//속성 : 상품코드(p12345), 재고수량(100)
	//기능 : 재고수량 증가(입력값-수량, 출력값 없음), 재고수량 감소(입력값-수량, 출력값은 현재 재고수량)
	
	String code;
	int stockNum; //10개에서 20개를 뺄 수는 없다.
	
	//기능
	//재고수량 증가 (입력값-수량, 출력값 없음)
	void addStock(int amount) {
		stockNum += amount;
	}
	
	//재고수량 감소(입력값-수량, 출력값은 현재 재고수량)
	int subtractstock (int amount) {
		if(stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}
	
	
	
	
}
