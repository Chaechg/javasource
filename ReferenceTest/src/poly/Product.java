package poly;

public class Product {
	
	private int price;
	private int bounsPoint;
	
	public Product(int price) {
		super();
		this.price = price;
		this.bounsPoint = (int)(price/10.0);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBounsPoint() {
		return bounsPoint;
	}

	public void setBounsPoint(int bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	
	
	
	
	
}
