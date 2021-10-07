package container;

import javax.swing.JFrame;

public class FrameTest1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("스위 프레임");
		//size 지정
		f.setSize(300, 300);
		//화면에 출력
		f.setVisible(true);
		//=> 콘솔창이 아닌 다른 화면에 띄울 수 있다.
		
	}
}
