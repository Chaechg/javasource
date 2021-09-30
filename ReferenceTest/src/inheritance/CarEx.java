package inheritance;

public class CarEx {
	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
		//f = a;  //Type mismatch. 상속관계가 아닌 클래스간의 형변환 불가
		
		//Car car = new FireEngine();  완쪽이 부모, 오른쪽이 자식 => car의 범위는 부모의 범위로 제한된다.
		f = new FireEngine();
		Car car = f;  //상속관계는 형변환이 가능하다.업캐스팅(- 형변환 생략가능)
		//car.water(); 보이지 않는다.
		
		FireEngine f2;
		f2 = (FireEngine) car; //다운캐스팅( - 형변환 생략 불가)
		f2.water();  //f2는 Car와 FireEngine의 모든 것을 가져올 수 있다.
		
		
		
		
	}
}
