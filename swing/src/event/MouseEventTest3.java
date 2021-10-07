package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest3 extends JFrame implements MouseListener {

	private JLabel lbl = new JLabel("HELLO");

	public MouseEventTest3() {
		setTitle("�ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���� ������ ���̾ƿ� ���ֱ�
		setLayout(null);

		// ���̺� ��ġ
		lbl.setLocation(50, 50);
		lbl.setSize(100, 20);
		add(lbl);
		
		setBounds(1000, 200, 400, 400);
		setVisible(true);
		
		// ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		Container contentPane = getContentPane();
		contentPane.addMouseListener(this);
		contentPane.setFocusable(true);
		// Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		contentPane.requestFocus();
	}

	public static void main(String[] args) {
		new MouseEventTest3();
	}

	class MyMouseAdapter extends MouseAdapter {
	}
	@Override
	public void mousePressed(MouseEvent e) {
		//���콺 Ŭ�� ��ġ ��������
		int x = e.getX();
		int y = e.getY();
		
		lbl.setLocation(x,y);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
