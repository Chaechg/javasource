package container;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest4 extends JFrame{
	
	public FrameTest4() {
		setTitle("MyFrame");
		setSize(300,300);
		//size를 지정하지 않으면 타이틀바만 나온다.
		
		//프레임을 닫으면 프로그램 종료
		// x버튼을 누른다고 종료되지 않고, 메모리에 존재한다.
		// 다음의 코드를 통해 메모리에서도 제거한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		// layout을 지정하지 않으면 borderlayout이 default로 지정된다.
		// FlowLayout 화면의 크기에 따라서 배치가 달라진다.
		
		//컴포넌트 : JButton,JCheckBox,JRadio,.....
		
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		add(btn2); //같은 자리에는 붙일 수 없다.
		
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4); 
		
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		
		setVisible(true); // 컴포넌트를 다 부착한 후에 화면에 출력해야 한다.
	}
	
	public static void main(String[] args) {
		FrameTest4 f = new FrameTest4();
		
	}
}

	