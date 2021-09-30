package classTest;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		
		
//		product1.code = "p12345";
//		product1.stockNum = 30;
		//클래스 외부에서 속성을 직접 변경하는 것은 안됨
		//private => The field GoodsStock2.stockNum is not visible
		//product1. 처럼 점을 찍어 볼 수 없다.
		
		GoodsStock2 product1 = new GoodsStock2("p12345",30);
				
		int stockNum = product1.subtractstock(15);
		System.out.println("현재 재고수량  "+stockNum);
				
		product1.addStock(5);
		System.out.println("현재 재고수량  "+product1.getStockNum());

		
		
	}
}
