package poly;

public class Circle extends Shape {
					//상속 - 원은 도형이다.
	
	//Point center; //원의 원점좌표 //Point에 대한 객체를 생성하지 않음.//메모리에 올라가 있지 않음
	// Point의 클래스는 null 상태이다.
	// null이므로 center.x를 호출해도 나올 수 없다.
	
	Point center; // Point center = new Point();로 쓸 수도 있다. 이러면 생성자로 초기화 하지 않아도 된다.
				  //원의 원점좌표
	int r; //반지름
	
	public Circle () {
		this(new Point (0,0),100); //생성자를 통해 초기화 함으로써 객체를 생성해준다.
	}
	
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}

	@Override
	void draw() {
	System.out.printf("[center=(%d,%d), r=%d, color =%s]\n",center.x, center.y,r,color);
	}
	
}
