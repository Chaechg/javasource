package inheritance;

public class PolyEx {
	public static void main(String[] args) {
		
		Parent2 p2 = new Child3();
		//Parent2�� �ʵ�� �޼��常 ī��ų �� �ִ�.
		p2.field="";
		p2.method1();
		p2.method2();  //�������̵� �� ���¶�� �ڽ� Ŭ������ �޼ҵ尡 ����
		
		//method3 ����? 
		Child3 c = (Child3) p2; //��ĳ����
		c.method3();
		
		//java.lang.ClassCastException
//		Parent2 obj = new Parent2();
//		Child3 c2 = (Child3) obj;// Exception ��� => runtime error 17�� ���� �̻�
//		c2.method3(); //���� �޸𸮿� �ö� ���� Parent2�̱� ������, ������ ����.
		// ���� �� ����Ű�� obj�� ū �� c2�� ������ �� ����.
		
		
				
		
	}
}
