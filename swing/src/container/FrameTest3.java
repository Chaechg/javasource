package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame{
	
	public FrameTest3() {
		setTitle("MyFrame");
		setSize(300,300);
		
		
		//������Ʈ : JButton,JCheckBox,JRadio,.....
		
		JButton btn1 = new JButton("��ư");
		add(btn1,BorderLayout.EAST);
		
		JButton btn2 = new JButton("��ư");
		add(btn2,BorderLayout.SOUTH); //���� �ڸ����� ���� �� ����.
		
		JButton btn3 = new JButton("��ư");
		add(btn3,BorderLayout.WEST);
		
		JButton btn4 = new JButton("��ư");
		add(btn4,BorderLayout.NORTH); //���� �ڸ����� ���� �� ����.
		
		JButton btn5 = new JButton("��ư");
		add(btn5,BorderLayout.CENTER);
		
		
		setVisible(true); // ������Ʈ�� �� ������ �Ŀ� ȭ�鿡 ����ؾ� �Ѵ�.
	}
	
	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
		
	}
}

	