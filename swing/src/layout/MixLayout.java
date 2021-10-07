package layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixLayout extends JFrame {
	public MixLayout() {
		setTitle("여러 레이아웃 혼합");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel(); //FlowLayout이 기본
		panel1.setBackground(Color.orange);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBackground(Color.DARK_GRAY);
		panel1.add(btn1);
		panel1.add(new JButton("버튼2"));
		panel1.add(new JButton("버튼3"));
		
		add(panel1,BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel(); 
		panel2.setLayout(new BorderLayout());
		panel2.add(new JButton("Swing"));
		add(panel2,BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MixLayout();
	}
}
