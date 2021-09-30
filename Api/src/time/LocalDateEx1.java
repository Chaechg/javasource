package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateEx1 {
	public static void main(String[] args) {
		Date date = new Date();  //java.util의 Date를 선택 //영문형태로 나옴
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 E요일  mm분 ss초");
		System.out.println(sdf.format(date));
		
		
		LocalDate currDate = LocalDate.now();//LocalDate.now는 static이라 new를 붙일 필요 없다.객체 생성할 필요 없음
		System.out.println(currDate);
		
		LocalTime currTime =LocalTime.now();
		System.out.println(currTime);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
		
		
	}
}
