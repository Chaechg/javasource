package inheritance;

public class ChildEx {
	public static void main(String[] args) {
		//Child ��ü ���� => 2���� ���
		//(1)
		//��ü ����
		//1) super(age); => Parent ������ ȣ��
		//2) super(); => Object ������ ȣ��
		//3) this.age = age
		//4) super(age); => Parent ������ ȣ��
		//5) Child ��ü ����
		Child child = new Child(25); //int ���� �Ѱ���� �Ѵ�
		System.out.println("child age "+child.getAge());
		child.play();
		child.print();
		
		//2) 
		Parent parent = new Child(26);  //�θ�� �ȳ����� �ڽİ� ���´�.
		System.out.println("child age "+parent.getAge());
		// parent.play();�� �θ� �� ����.
		// Parent�� Child ���� �� �۴�.
		parent.print();
		
		
			
	}
}
