package abstractTest;

public class AICarEx {

	public static void main(String[] args) {
		AICar ai = new AICar("black");
		
		ai.start();
		ai.drive();
		ai.stop();
		
		//Car car = new Car();
		// Cannot instantiate the type Car
		// �߻�Ŭ������ ��ü ���� �Ұ�
		// �߻�Ŭ������ �����Ϸ���, �ڽ� Ŭ������ ���� ��ü���� �ؾ� �Ѵ�.
		Car car = new AICar("white");
		car.start();
		car.drive();
		car.stop();
				
	}

}
