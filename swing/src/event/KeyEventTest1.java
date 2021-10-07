package event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// KeyListener
// KeyEvent�� �����ϴ� ������
// KeyEvent�� ��Ŀ���� ���� ������Ʈ������ �߻�
// KeyPressed() : Ű�� ������ ���� �߻�
// KeyReleased() : ���� Ű�� ���� ���� ȣ��			
//		KeyTyped() : ���� Ű�� �������� ���� ȣ��(��, �����ڵ��� �ܿ츸 ȣ��) 

public class KeyEventTest1 extends JFrame implements KeyListener {

	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;
	
	public KeyEventTest1() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		
		panel.add(new JLabel("���ڸ� �Է��ϼ���"));
		
		textField = new JTextField();
		textField.addKeyListener(this);
		panel.add(textField);
		
		textArea = new JTextArea(3,30);
		
		getContentPane().add(panel, BorderLayout.NORTH);
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		setTitle("Ű �̺�Ʈ");
		setSize(400,200);
		setVisible(true);
	}
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		display(e, "KeyTyped : ");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e, "KeyPressed : ");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e, "KeyReleased : ");

	}
	
	protected void display(KeyEvent e, String str) {
		char keyChar = e.getKeyChar();
		int keyCode = e.getKeyCode();
		
		// textArea.setText(t);
		
		String modifiers = "Alt : "+e.isAltDown()+" Ctrl : "+e.isControlDown()
						+" Shift : "+e.isShiftDown();
		textArea.append(str+" ���� : "+keyChar+" (�ڵ� : "+keyCode+") "+modifiers+"\n");
		
		
	}

	public static void main(String[] args) {
		new KeyEventTest1();

	}

}