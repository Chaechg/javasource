package event;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventTest2 extends JFrame {
	
	public MouseEventTest2() {
		setTitle("���콺 �̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Ŭ��");
		btn.addMouseListener(new MouseAdapter() { //�߻�Ŭ������ �͸����� ����
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX()+" "+e.getY()+" "+e.getClickCount());
			}
		});
		
		
		add(btn, BorderLayout.NORTH);
		
		setBounds(1000,200,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventTest2();
	}

	
}
