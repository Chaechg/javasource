package abstractTest;

public class AICar extends Car {

	public AICar(String clolr) {
		super(clolr);
	}

	@Override  //�߻�Ŭ������ �ڽ�Ŭ������ �ݵ�� �����ؾ� �Ѵ�. - �޼��带 �ϼ��ؾ� �Ѵ�.
	void drive() {
		System.out.println("��������");
	}

	@Override
	void stop() {
		System.out.println("�ڵ����� ����");
	}

}
