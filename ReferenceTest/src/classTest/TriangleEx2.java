package classTest;

public class TriangleEx2 {

	public static void main(String[] args) {
		
		Triangle2 triangle1 = new Triangle2(10,15);
//		triangle1.baseLine =10;
//		triangle1.height=15;
		//private�� ��������ν� ������� ���ϰԵ�
		System.out.println("���� : "+triangle1.getArea());
		
		
		Triangle2 triangle2 = new Triangle2(15,25);
//		triangle2.baseLine =15;
//		triangle2.height=25;
		System.out.println("���� : "+triangle2.getArea());

		
		
	}

}
