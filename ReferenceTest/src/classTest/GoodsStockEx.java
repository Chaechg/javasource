package classTest;

public class GoodsStockEx {
	public static void main(String[] args) {
		
		//ù��° ��ǰ ������
		GoodsStock product1 = new GoodsStock();
		product1.code = "p12345";
		product1.stockNum = 30;
		
		//��ǰ�Ǹ� => ��� ����
		//�޼ҵ� ȣ�� => ���ϰ��� �ִٸ� ���ϰ��� �ޱ�(syso, ����)
		//1)syso
		//System.out.println("���� ������ : "+product1.subtractstock(15));
		//2)���� ���� - ���߿��� �� �� �� �ִ�.
		
		//���� ����
		//���Ƿ� �ƹ��ų� �� �� ������, �밳�� �ǹ̸� ���ϱ� ���� Ŭ������ �� ���
		int stockNum = product1.subtractstock(15);
		//���ķ� stockNum�� ����� �� �ִ�.
		System.out.println("���� ������  "+stockNum);
		
//		product1.subtractstock(15);
//		System.out.println("���� ������  "+product1.stockNum);
//		//����� �ڵ嵵 �۵��Ѵ�.
		

		//��ǰ => ��� ����
		//�޼ҵ� ȣ�� => ���� Ÿ���� ������ ȣ�⸸ �ϸ� ��
		//System.out.println(product1.addStock(5));�� ����� �� ����.
		//ȣ�⸸ �ؾ� �Ѵ�.
		product1.addStock(5);
		
		System.out.println("���� ������  "+product1.stockNum);
		
		
	}
}
