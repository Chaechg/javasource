package interfaceTest;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc ;
		
		rc = new Television();
		//rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	
		
		System.out.println();
		
		rc = new Audio(); //Television 밑으로 이 코들르 올리면 오디오가 동작한다.
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		
		System.out.println();

		
		//익명 구현 객체 - 한 번만 구현하기 위한 방법
		RemoteControl rc1 = new RemoteControl() {  //익명 바디가 ;로 끝난다. {};
			private int volume;
			@Override
			public void turnOn() {
				System.out.println("라디오를 켭니다.");				
			}
			@Override
			public void turnOff() {
				System.out.println("라디오를 끕니다.");				
			}
			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				 System.out.println("현재 볼륨 : "+volume);
			}
		};
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.turnOff();
	}
}
