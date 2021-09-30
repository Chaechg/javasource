package shop;

public abstract class Product  {
	
	
	//필드
	private String pname;
	
	private int price;
	//생성자
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	//메서드
	public void printDetail() {
		System.out.println("제품명 : "+pname);
		System.out.println("가격 : "+price);
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
