package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class OrderPizza extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderPizza frame = new OrderPizza();
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
	public OrderPizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JTextArea textArea = new JTextArea();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textArea, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textArea, 24, SpringLayout.WEST, contentPane);
		textArea.setBackground(SystemColor.control);
		textArea.setText("\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4. \uD53C\uC790\uC758 \uC885\uB958\uB97C \uC120\uD0DD\uD558\uC2DC\uC624");
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("\uCF64\uBCF4\uD53C\uC790\r\n");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 16, SpringLayout.SOUTH, textArea);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD3EC\uD14C\uC774\uD1A0 \uD53C\uC790\r\n");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 6, SpringLayout.EAST, btnNewButton);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uBD88\uACE0\uAE30\uD53C\uC790\r\n");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_2, 16, SpringLayout.SOUTH, textArea);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_2, 6, SpringLayout.EAST, btnNewButton_1);
		contentPane.add(btnNewButton_2);
		
		JTextPane textPane = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textPane, 16, SpringLayout.SOUTH, textArea);
		textPane.setBackground(SystemColor.control);
		sl_contentPane.putConstraint(SpringLayout.WEST, textPane, 6, SpringLayout.EAST, btnNewButton_2);
		textPane.setText("\uAC1C\uC218");
		contentPane.add(textPane);
		
		JEditorPane editorPane = new JEditorPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, editorPane, 16, SpringLayout.SOUTH, textArea);
		sl_contentPane.putConstraint(SpringLayout.WEST, editorPane, 1, SpringLayout.EAST, textPane);
		contentPane.add(editorPane);
	}
}
