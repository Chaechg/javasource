package interfaceTest;

public class Television implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) { //this의 유무로 지역변수인지 아닌지 알 수 있다.this가 붙은 게 멤버 변수
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		 System.out.println("현재 볼륨 : "+volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+" 검색");
		
	}

}
