package classTest;

public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("Company : "+car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("Company : "+car2.company);
		System.out.println("Model : "+car2.model);
		System.out.println();
		
		Car car3 = new Car("택시, 검정, 200");
		System.out.println("Company : "+car3.company);
		System.out.println("Model : "+car3.model);
		System.out.println("Color : "+car3.color);
		System.out.println("Maxspeed : "+car3.maxSpeed);
		System.out.println();
		
	}
}
