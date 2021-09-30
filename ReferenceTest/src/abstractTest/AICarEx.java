package abstractTest;

public class AICarEx {

	public static void main(String[] args) {
		AICar ai = new AICar("black");
		
		ai.start();
		ai.drive();
		ai.stop();
		
		//Car car = new Car();
		// Cannot instantiate the type Car
		// 추상클래스는 객체 생성 불가
		// 추상클래스를 실행하려면, 자식 클래스를 통해 객체생성 해야 한다.
		Car car = new AICar("white");
		car.start();
		car.drive();
		car.stop();
				
	}

}
