package inheritance;

public class CaptionTV extends TV {
	boolean caption;
	
	void displayCaption(String text) {
		if (caption) { // caption == true�� �ǹ̸� ���Ѵ�. ������ caption�� �ִ´�.
			System.out.println(text);
		}
	}
}
