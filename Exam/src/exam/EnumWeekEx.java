package exam;

import java.util.Calendar;

public class EnumWeekEx {
	public static void main(String[] args) {
		
		Week today = null;
		
		//Calendar c = new calendar.getInstance();
		// Calendar는 추상클래스이기 때문에, 위와 같이 쓸 수 없다.
		Calendar c = Calendar.getInstance(); //자식을 부르지 않아도 구현할 수 있게 getInstance를 썼다.
		//Calendar는 자바에서 가져온 클래스이다.
		int week = c.get(Calendar.DAY_OF_WEEK); //1~7까지 수를 일~월까지 준다.
		
		switch (week) {
		case 1:
			today = Week.Sunday; 	//상수형태로 정하면, 오타날 확률이 준
			break; 					//개발자가 달라도 같은 단어로 나타낸다.	
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
		System.out.println("오늘 요일 "+today);
		
		if (today==Week.Sunday) {
			System.out.println("일요일에는 쉽니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
	}
}
