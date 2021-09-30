package inheritance;

public class SubListString extends ListString {
	String name = "성춘향";
	
	@Override
	public void list() {
		super.list(); //부모의 list를 호출 
		System.out.println(name+" 하위 클래스");
	}
	
	public void writer () {
		//부모가 가지고 있는 이름 출력
		System.out.println(name); //=>자식 클래스만 출력
		System.out.println(super.name); //=>부모 클래스 출력. 오버라이딩으로 가려졌지만 super를 통해 불러낼 수 있다.
	}
}
