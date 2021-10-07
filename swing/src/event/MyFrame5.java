package event;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MyFrame5 extends JFrame implements ActionListener{
	Container container;
	
	
	public MyFrame5() {
		setTitle("µ¡¼À °è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JTextField fd1= new JTextField();
		fd1.setColumns(30);	
		add(fd1);
		
		JLabel lbl1 = new JLabel("+");
		add(lbl1);
		
		
		
		setBounds(1000,200,500,150);
		setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public static void main(String[] args) {
		new MyFrame5();
	}

}