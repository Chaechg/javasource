package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioButtonTest2 extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButtonTest2 frame = new JRadioButtonTest2();
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
	public JRadioButtonTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD06C\uAE30 \uC120\uD0DD");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Size", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Small\r\n");
		rdbtnNewRadioButton.addItemListener(this);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Medium");
		rdbtnNewRadioButton_1.addItemListener(this);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Large");
		rdbtnNewRadioButton_2.addItemListener(this);
		panel.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
	}

	@Override
	public void itemStateChanged(ItemEvent e) { //On/Off 개념이 있다. 선택/해제
		JRadioButton btn = (JRadioButton)e.getItem();
		textField.setText(btn.getText());
		
	}

}
