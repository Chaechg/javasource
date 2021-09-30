package inheritance;

public class CaptionTV2 extends TV2 {
	boolean caption;
	
	public CaptionTV2(TV2 tv, String color, boolean power, int channel) {
		super(tv, color, power, channel);
	}
	
	void displayCaption(String text) {
		if (caption) { // caption == true�� �ǹ̸� ���Ѵ�. ������ caption�� �ִ´�.
			System.out.println(text);
		}
	}
}
