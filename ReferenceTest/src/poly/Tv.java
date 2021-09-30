package poly;

public class Tv extends Product {

	public Tv(int price) {
		super(price);
	}
	@Override   // 
	public String toString() {
		return "Tv";  //object가 넘겨준 것은 주소가 나오므로, 재정의함.
	}
	// 오버라이딩 개념은 상속에 있다.
	// 그러나 Product class에는 toString이 없다.
	// 더 조상격인 object에서 가져온 것이다.
}
