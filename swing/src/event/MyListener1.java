package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* ActionListener
 *  JButton, JMenuItem, JTextField ������Ʈ�� �̺�Ʈ ���
 * 
 *  JButton => ���콺�� enter ��ư ����
 *  JMenuItem => �޴� ����
 *  JTextField => Enter Ű �Է�
 */

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// getActionCommand - �׼��� �Ͼ ��ü�� command ������
		System.out.println("e.getActionCommand()"+e.getActionCommand());
		// getID - ���� �� �� ����. ����� ����� ���ϴ�.
		System.out.println("e.getID()"+e.getID());
		// getSource - �̺�Ʈ�� �Ͼ ��� ���� ��� ����
		System.out.println("e.getSource()"+e.getSource());

	}

}