package classTest;

public class Triangle2 {
	//삼각형 넓이 구하기
	//밑변 * 높이  / 2
	
	//속성 : 밑변, 높이
	//기능(메소드) : 밑변 * 높이  / 2
	
	//생성자는 기본 생성자
	
	//속성
	//속성은 외부에서 변화하지 못하게 막는다.
	//private
	private int baseLine;
	private int height;
	
	//생성자
	//Triangle2() is undefined
	Triangle2 (int baseLine, int height){
		this.baseLine = baseLine;
		this.height = height;
	}
	// 생성자가 이미 있는 경우는 기본 생성자를 만들어 주지 않는다. 
	
	//기능
	int getArea () {
		return baseLine * height / 2;
	}
	
	
	
	
	
}
