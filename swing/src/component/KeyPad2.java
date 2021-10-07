package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPad2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton[] buttons = new JButton[9];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad2 frame = new KeyPad2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeyPad2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0,3,0,0));
		
		//�гο� ��ư 9�� ����
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton((i+1)+"");
			//��ư font ����
			buttons[i].setFont(new Font("����", Font.PLAIN, 24));
			//�׼Ǹ�����
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư�� Ŭ���Ǹ�
		// ������ ��ư�� ���� ��������
		String cmd = e.getActionCommand();
		// ������ ���ڸ� textField�� �����ֱ� + ������ �ִ� ���ڵ� �Բ� �����ֱ�
		textField.setText(textField.getText()+cmd);
		
	}

}
