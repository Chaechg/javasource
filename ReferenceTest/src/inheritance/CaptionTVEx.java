package inheritance;

public class CaptionTVEx {
	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println("현재 채널 "+ctv.channel);
		
		ctv.displayCaption("Hello World"); //boolean의 기본값이 false이므로, 안나옴
		ctv.caption = true; // boolean을 true로 만들어야 나옴
		ctv.displayCaption("Hello java");
		
	}
}
