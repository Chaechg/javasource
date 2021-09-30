package poly;

public class DrawShape {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw(); 	// NullPointerException 에러
						// Circle에서 객체생성 했으므로 에러 제거
	}
}
