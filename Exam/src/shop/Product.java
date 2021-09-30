package shop;

public abstract class Product  {
	
	
	//�ʵ�
	private String pname;
	
	private int price;
	//������
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	//�޼���
	public void printDetail() {
		System.out.println("��ǰ�� : "+pname);
		System.out.println("���� : "+price);
	}
	
	abstract void printExtra();

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
		
}
