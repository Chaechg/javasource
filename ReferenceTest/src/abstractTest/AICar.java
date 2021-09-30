package abstractTest;

public class AICar extends Car {

	public AICar(String clolr) {
		super(clolr);
	}

	@Override  //추상클래스의 자식클래스는 반드시 구현해야 한다. - 메서드를 완성해야 한다.
	void drive() {
		System.out.println("자율주행");
	}

	@Override
	void stop() {
		System.out.println("자동으로 멈춤");
	}

}
