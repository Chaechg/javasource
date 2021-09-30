package inheritance;

public class CaptionTV2 extends TV2 {
	boolean caption;
	
	public CaptionTV2(TV2 tv, String color, boolean power, int channel) {
		super(tv, color, power, channel);
	}
	
	void displayCaption(String text) {
		if (caption) { // caption == true의 의미를 지닌다. 간단히 caption만 넣는다.
			System.out.println(text);
		}
	}
}
