package abstractTest;

public abstract class Player {
	boolean pause;
	int currentPos;
	
	public Player() {
		this.pause=false;
		currentPos = 0;
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	void play () {
		play(currentPos);
	}
	//추상메소드라도 다른 메소드-추상메소드가 아닌 -를 부를 수 있다.
	//메서드 이름이 같은 것은 메서드의 오버로딩의 개념이 적용된다.
	//괄호안의 멤버변수가 다르므로 다른 메서드이다.
	
	void pause() {
		if (pause) {
			pause = false;
			play(currentPos);
		}else {
			pause=true;
			stop();
		}
		
		
	}
}
