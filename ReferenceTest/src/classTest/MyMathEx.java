package classTest;

public class MyMathEx {
	public static void main(String[] args) {
		//static �޼ҵ�(Ŭ���� �޼ҵ�) ȣ�� => ��ü ���� ���� ȣ��
		System.out.println(MyMath.add(200L, 100L));  //long type���� ���� ���� L�� �ٿ��� �Ѵ�.
		System.out.println(MyMath.subtract(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200L, 100L));
		
		System.out.println();
		
		//����޼ҵ�(non-static) ȣ��
		MyMath math = new MyMath();  //��ü ���� ���� ����
		math.a = 200L;				//��� ���� ��� ����
		math.b = 100L;
		
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());
	
		
		
		
	}
}
