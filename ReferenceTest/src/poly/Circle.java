package poly;

public class Circle extends Shape {
					//��� - ���� �����̴�.
	
	//Point center; //���� ������ǥ //Point�� ���� ��ü�� �������� ����.//�޸𸮿� �ö� ���� ����
	// Point�� Ŭ������ null �����̴�.
	// null�̹Ƿ� center.x�� ȣ���ص� ���� �� ����.
	
	Point center; // Point center = new Point();�� �� ���� �ִ�. �̷��� �����ڷ� �ʱ�ȭ ���� �ʾƵ� �ȴ�.
				  //���� ������ǥ
	int r; //������
	
	public Circle () {
		this(new Point (0,0),100); //�����ڸ� ���� �ʱ�ȭ �����ν� ��ü�� �������ش�.
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
