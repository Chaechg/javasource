package classTest;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { //static �޼��� �ȿ��� surface area�� �ʱ�ȭ ��.
		EARTH_SURFACE_AREA = 4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI;
	}
	
	//Math.PI - �������� ����ϴ� ����. ������� 
}
