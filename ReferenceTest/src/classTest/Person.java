package classTest;

//final : �����Ұ�
//���Ǵ� �� : Ŭ����, �޼���, �������, ���������� �ٿ� ����� �� �ִ�.
//Ŭ������ final�� ������ - ��� �Ұ��� �ǹ̸� ������.
//�޼ҵ忡 final�� ������ - �������̵� �Ұ�
//�������, ���������� final�� ������ - ���� �Ұ��� �ǹ��̴�.

public class Person {
	final String nation = "Korea";
	final String ssn; 	// �ʱ�ȭ ���� �ʾ� ssn�� ������ ��
						// The blank final field ssn may not have been initialized
						// ������ - ��������� �ʱ�ȭ�� �����̴�.
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;		//�����ڸ� ���� �ʱ�ȭ�ϸ� ������ �������. 
		this.name = name;
	}
						
	
	
	
}
