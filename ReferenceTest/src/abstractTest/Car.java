package abstractTest;

/*�߻� Ŭ���� :
 * �߻� : ��ü���� ������ �����ϰ� ����� �κи��� ����� �ִ� �۾�
 * ��üȭ�� �ڽ�Ŭ�������� ����ȴ�. 
 */

public abstract class Car {
//Ŭ������ ���� ��, modifier���� abstract�� Ŭ���ϸ� ���� ���� ���������.
	
	private String clolr;
	
	public Car(String clolr) {
	super();
	this.clolr = clolr;
	}

	public void start () {
		System.out.println("�ڵ��� ���");
	}
	
	//void drive(); ���� ��
	abstract void drive();
	//������ ���õ� ��� ����� drive��� �������� ���ϱ� ����
	//�Ϲ� Ŭ�������� ���� �� �ִ� �� ��� ����� �ִ�.-�������, ������, �޼���
	
	abstract void stop();
	
	
}
