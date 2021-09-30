package classTest;

public class Triangle {
	//삼각형 넓이 구하기
	//밑변 * 높이  / 2
	
	//속성 : 밑변, 높이
	//기능(메소드) : 밑변 * 높이  / 2
	
	//생성자는 기본 생성자
	
	//속성
	int baseLine;
	int height;
	
	//생성자
	Triangle (){}
	//기본 생성자는 안해도 자동으로 만들어준다.
	
	//기능
	int getArea () {
		return baseLine * height / 2;
	}
	
	
	
	
	
}
