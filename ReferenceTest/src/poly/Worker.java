package poly;

public class Worker {
	public void work(Employee e) {
		// 여기서 행위를 호출할 예정
		// 부모를 넣어주면 한 번에 해결된다.
		// 부모자식 관계가 있어야 가능하다. 
		// 없다면 받아낼 수 없다.
		e.work();
		
	}
}
