package classTest;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		
		
//		product1.code = "p12345";
//		product1.stockNum = 30;
		//Ŭ���� �ܺο��� �Ӽ��� ���� �����ϴ� ���� �ȵ�
		//private => The field GoodsStock2.stockNum is not visible
		//product1. ó�� ���� ��� �� �� ����.
		
		GoodsStock2 product1 = new GoodsStock2("p12345",30);
				
		int stockNum = product1.subtractstock(15);
		System.out.println("���� ������  "+stockNum);
				
		product1.addStock(5);
		System.out.println("���� ������  "+product1.getStockNum());

		
		
	}
}
