package abstractTest;

/*추상 클래스 :
 * 추상 : 구체적인 내용은 배제하고 공통된 부분만을 만들어 주는 작업
 * 구체화는 자식클래스에서 진행된다. 
 */

public abstract class Car {
//클래스를 만들 때, modifier에서 abstract를 클릭하면 위와 같이 만들어진다.
	
	private String clolr;
	
	public Car(String clolr) {
	super();
	this.clolr = clolr;
	}

	public void start () {
		System.out.println("자동차 출발");
	}
	
	//void drive(); 에러 남
	abstract void drive();
	//운전과 관련된 모든 기능을 drive라는 형식으로 정하기 위해
	//일반 클래스에사 만들 수 있는 것 모두 만들수 있다.-멤버변수, 생성자, 메서드
	
	abstract void stop();
	
	
}
