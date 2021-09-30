package inheritance;

public class CaptionTV extends TV {
	boolean caption;
	
	void displayCaption(String text) {
		if (caption) { // caption == true의 의미를 지닌다. 간단히 caption만 넣는다.
			System.out.println(text);
		}
	}
}
