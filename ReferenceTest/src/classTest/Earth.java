package classTest;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { //static 메서드 안에서 surface area를 초기화 함.
		EARTH_SURFACE_AREA = 4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI;
	}
	
	//Math.PI - 공통으로 사용하는 공식. 상수개념 
}
