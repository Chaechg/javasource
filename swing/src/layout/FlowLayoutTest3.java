package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* FlowLayout : 컴포넌트를 왼쪽에서 오른쪽으로 배치
 * 			  : 오른쪽 공간이 없으면 아래로 내려감
 */
public class FlowLayoutTest3 extends JFrame{
	
	public FlowLayoutTest3() {
		setTitle("BorderLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//현재 프레임의 contentPane 가져오기
		Container container = getContentPane();
		//contentPane에 새로운 레이아웃 설정
		container.setLayout(new FlowLayout(FlowLayout.LEFT,30,40)); //버튼 간의 갭을 준다.
		
	
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		add(btn2); 
		
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4); 
		
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		FlowLayoutTest3 f = new FlowLayoutTest3();
	}
}
