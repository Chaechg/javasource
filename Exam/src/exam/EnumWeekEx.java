package exam;

import java.util.Calendar;

public class EnumWeekEx {
	public static void main(String[] args) {
		
		Week today = null;
		
		//Calendar c = new calendar.getInstance();
		// Calendar�� �߻�Ŭ�����̱� ������, ���� ���� �� �� ����.
		Calendar c = Calendar.getInstance(); //�ڽ��� �θ��� �ʾƵ� ������ �� �ְ� getInstance�� ���.
		//Calendar�� �ڹٿ��� ������ Ŭ�����̴�.
		int week = c.get(Calendar.DAY_OF_WEEK); //1~7���� ���� ��~������ �ش�.
		
		switch (week) {
		case 1:
			today = Week.Sunday; 	//������·� ���ϸ�, ��Ÿ�� Ȯ���� ��
			break; 					//�����ڰ� �޶� ���� �ܾ�� ��Ÿ����.	
		case 2:
			today = Week.Monday;
			break;
		case 3:
			today = Week.Tuseday;
			break;
		case 4:
			today = Week.Wendsday;
			break;
		case 5:
			today = Week.Thursday;
			break;
		case 6:
			today = Week.Friday;
			break;
		default:
			today = Week.Saturday;
			break;
		}
		System.out.println("���� ���� "+today);
		
		if (today==Week.Sunday) {
			System.out.println("�Ͽ��Ͽ��� ���ϴ�.");
		}else {
			System.out.println("������ �ڹ� �����մϴ�.");
		}
		
	}
}
