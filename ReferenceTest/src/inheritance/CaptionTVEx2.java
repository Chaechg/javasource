package inheritance;

public class CaptionTVEx2 {
	public static void main(String[] args) {
		CaptionTV2 ctv = new CaptionTV2(null, "black",true,8);
		
		//ctv.channel = 10;
		ctv.channelUp();
		System.out.println("���� ä�� "+ctv.getChannel());
		
		ctv.displayCaption("Hello World"); //boolean�� �⺻���� false�̹Ƿ�, �ȳ���
		ctv.caption = true; // boolean�� true�� ������ ����
		ctv.displayCaption("Hello java");
		
	}
}
