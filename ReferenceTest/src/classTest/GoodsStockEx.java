package classTest;

public class GoodsStockEx {
	public static void main(String[] args) {
		
		//첫번째 상품 재고관리
		GoodsStock product1 = new GoodsStock();
		product1.code = "p12345";
		product1.stockNum = 30;
		
		//상품판매 => 재고 감소
		//메소드 호출 => 리턴값이 있다면 리턴값을 받기(syso, 변수)
		//1)syso
		//System.out.println("현재 재고수량 : "+product1.subtractstock(15));
		//2)변수 쓰기 - 나중에도 또 쓸 수 있다.
		
		//변수 선언
		//임의로 아무거나 쓸 수 있으나, 대개는 의미를 통하기 위해 클래스의 용어를 사용
		int stockNum = product1.subtractstock(15);
		//이후로 stockNum을 사용할 수 있다.
		System.out.println("현재 재고수량  "+stockNum);
		
//		product1.subtractstock(15);
//		System.out.println("현재 재고수량  "+product1.stockNum);
//		//상기의 코드도 작동한다.
		

		//반품 => 재고 증가
		//메소드 호출 => 리턴 타입이 없으면 호출만 하면 됨
		//System.out.println(product1.addStock(5));로 출력할 수 없다.
		//호출만 해야 한다.
		product1.addStock(5);
		
		System.out.println("현재 재고수량  "+product1.stockNum);
		
		
	}
}
