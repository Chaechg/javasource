package abstractTest;

public abstract class Unit {
	//Unit 클래스의 객체를 따로 생성하지는 않을 예정이다.
	
	int x, y;
	
	abstract void move(int x, int y);
		
	void stop() {
		System.out.println("지정된 위치에서 stop");
	}
	
	// 공통적인 것은 부모클래스에
	
}
