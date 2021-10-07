package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventTest3 extends JFrame {

	private JLabel lbl = new JLabel("HELLO");

	public KeyEventTest3() {
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 현재 설정된 레이아웃 없애기
		setLayout(null);

		// 레이블 배치
		lbl.setLocation(50, 50);
		lbl.setSize(100, 20);
		add(lbl);
		
		setBounds(1000, 200, 200, 200);
		setVisible(true);
		
		// 레이블이 포커스를 받을 수 있도록 설정
		Container contentPane = getContentPane();
		contentPane.addKeyListener(new MyKeyAdapter());
		contentPane.setFocusable(true);
		// 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();
	}

	public static void main(String[] args) {
		new KeyEventTest3();
	}

	class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// 상,하,좌,우 키에 맞춰서 글자를 이동
			// 어느 키가 눌러졌는지 확인
			int keyCode = e.getKeyCode();

			switch (keyCode) {
			case KeyEvent.VK_UP:  //위 화살표
				lbl.setLocation(lbl.getX(), lbl.getY()-10);
				break;
			case KeyEvent.VK_DOWN:  //아래 화살표
				lbl.setLocation(lbl.getX(), lbl.getY()+10);
				break;
			case KeyEvent.VK_LEFT:  //왼쪽 화살표
				lbl.setLocation(lbl.getX()-10, lbl.getY());
				break;
			case KeyEvent.VK_RIGHT:  //오른쪽 화살표
				lbl.setLocation(lbl.getX()+10, lbl.getY());
				break;
			}

		}
	}

}
