package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame{
	
	public FrameTest3() {
		setTitle("MyFrame");
		setSize(300,300);
		
		
		//컴포넌트 : JButton,JCheckBox,JRadio,.....
		
		JButton btn1 = new JButton("버튼");
		add(btn1,BorderLayout.EAST);
		
		JButton btn2 = new JButton("버튼");
		add(btn2,BorderLayout.SOUTH); //같은 자리에는 붙일 수 없다.
		
		JButton btn3 = new JButton("버튼");
		add(btn3,BorderLayout.WEST);
		
		JButton btn4 = new JButton("버튼");
		add(btn4,BorderLayout.NORTH); //같은 자리에는 붙일 수 없다.
		
		JButton btn5 = new JButton("버튼");
		add(btn5,BorderLayout.CENTER);
		
		
		setVisible(true); // 컴포넌트를 다 부착한 후에 화면에 출력해야 한다.
	}
	
	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
		
	}
}

	