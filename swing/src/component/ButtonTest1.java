package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonTest1 extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest1 frame = new ButtonTest1();
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
	public ButtonTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Disalbe middle Button");
		btnNewButton.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/left.gif")));
		btnNewButton.setMnemonic('D');
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Middle Button");
		btnNewButton_1.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/middle.gif")));
		btnNewButton_1.setMnemonic('M');
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Enable middle Button");
		btnNewButton_2.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/right.gif")));
		btnNewButton_2.setMnemonic('E');
		contentPane.add(btnNewButton_2);
		
		pack(); // 창의 크기를 버튼의 크기에 맞게 출력
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
