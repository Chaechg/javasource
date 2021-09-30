package inheritance;

//Ŭ���� �̸� + extends + �θ�Ŭ������
// �����ڿ� �ʱ�ȭ ���� ��ӵ��� ����
// private ��������� ������ ���ѵ�
// ����� ���� ���ٴ� Ȯ���� ������ ����� �� ��Ȯ�� �����̴�.

public class Child extends Parent {
//Implicit super constructor Parent() is undefined for default constructor. 
//Must define an explicit constructor
	
//	public Child () {
//		super(); //Parent�� �⺻ ������ ȣ��
//	}
	
	public Child(int age) {
		super(age);  //Parent�� int�� �޴� ������ ȣ��
	}
	
	
	void play() {
		System.out.println("����!!!");
	}
	
	@Override //print + ctrl+ space > overriding parent
		public void print() {
			System.out.println("Hello");
		}
}
