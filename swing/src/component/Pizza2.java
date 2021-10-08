package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class Pizza2 extends JFrame implements ItemListener, ActionListener{

	private JPanel contentPane;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza2 frame = new Pizza2();
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
	public Pizza2() {
		setTitle("\uD53C\uC790\uC8FC\uBB38");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pizza2.class.getResource("/component/pizza1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 200, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uCF64\uBCF4");
		rdbtnNewRadioButton.addItemListener(this);
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		rdbtnNewRadioButton_1.addItemListener(this);
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		panel_2.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\uBD88\uACE0\uAE30");
		rdbtnNewRadioButton_2.addItemListener(this);
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		panel_2.add(rdbtnNewRadioButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uCD94\uAC00 \uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("\uD53C\uB9DD");
		rdbtnNewRadioButton_3.addItemListener(this);
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		panel_3.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("\uCE58\uC988");
		rdbtnNewRadioButton_4.addItemListener(this);
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		panel_3.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("\uD398\uD398\uB85C\uB2C8");
		rdbtnNewRadioButton_5.addItemListener(this);
		rdbtnNewRadioButton_5.setBackground(Color.WHITE);
		panel_3.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("\uBCA0\uC774\uCEE8");
		rdbtnNewRadioButton_6.addItemListener(this);
		rdbtnNewRadioButton_6.setBackground(Color.WHITE);
		panel_3.add(rdbtnNewRadioButton_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Small");
		rdbtnNewRadioButton_7.addItemListener(this);
		rdbtnNewRadioButton_7.setBackground(Color.WHITE);
		panel_4.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Medium");
		rdbtnNewRadioButton_8.addItemListener(this);
		rdbtnNewRadioButton_8.setBackground(Color.WHITE);
		panel_4.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Large");
		rdbtnNewRadioButton_9.addItemListener(this);
		rdbtnNewRadioButton_9.setBackground(Color.WHITE);
		panel_4.add(rdbtnNewRadioButton_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38");
		btnNewButton.setActionCommand("Order");
		btnNewButton.addActionListener(this);
		btnNewButton.setBackground(Color.WHITE);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.setActionCommand("Cancel");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("\uAE08\uC561 : ");
		lblNewLabel_1.setBackground(Color.WHITE);
		panel_1.add(lblNewLabel_1);
		
		ButtonGroup type = new ButtonGroup();
		type.add(rdbtnNewRadioButton);
		type.add(rdbtnNewRadioButton_1);
		type.add(rdbtnNewRadioButton_2);
		
		ButtonGroup size = new ButtonGroup();
		size.add(rdbtnNewRadioButton_7);
		size.add(rdbtnNewRadioButton_8);
		size.add(rdbtnNewRadioButton_9);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 이벤트 처리
		String cmd = e.getActionCommand();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 라디오 버튼 이벤트 처리
		// 종류 : 콤보(10000), 포테이토(12000), 불고기(13000)
		// 추가토핑 : 피망(2000),치즈(2000),페페로니(1000),베이컨(3000)
		// 크기 : small(1000), medium(2000), large(3000)
		
		JRadioButton total = (JRadioButton)e.getItem();
		lblNewLabel_1.setText(total.getText());
		
	}

}
