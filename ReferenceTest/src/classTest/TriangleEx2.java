package classTest;

public class TriangleEx2 {

	public static void main(String[] args) {
		
		Triangle2 triangle1 = new Triangle2(10,15);
//		triangle1.baseLine =10;
//		triangle1.height=15;
		//private를 사용함으로써 사용하지 못하게됨
		System.out.println("넓이 : "+triangle1.getArea());
		
		
		Triangle2 triangle2 = new Triangle2(15,25);
//		triangle2.baseLine =15;
//		triangle2.height=25;
		System.out.println("넓이 : "+triangle2.getArea());

		
		
	}

}
