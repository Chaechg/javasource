package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* ActionListener
 *  JButton, JMenuItem, JTextField 컴포넌트의 이벤트 담당
 * 
 *  JButton => 마우스나 enter 버튼 선택
 *  JMenuItem => 메뉴 선택
 *  JTextField => Enter 키 입력
 */

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// getActionCommand - 액션이 일어난 객체의 command 가져옴
		System.out.println("e.getActionCommand()"+e.getActionCommand());
		// getID - 아직 알 수 없다. 쓰기는 어려울 듯하다.
		System.out.println("e.getID()"+e.getID());
		// getSource - 이벤트가 일어난 대상에 대한 모든 정보
		System.out.println("e.getSource()"+e.getSource());

	}

}
