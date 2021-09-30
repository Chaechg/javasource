package inheritance;

public class ChildEx {
	public static void main(String[] args) {
		//Child 객체 생성 => 2가지 방법
		//(1)
		//객체 생성
		//1) super(age); => Parent 생성자 호출
		//2) super(); => Object 생성자 호출
		//3) this.age = age
		//4) super(age); => Parent 생성자 호출
		//5) Child 객체 생성
		Child child = new Child(25); //int 값을 넘겨줘야 한다
		System.out.println("child age "+child.getAge());
		child.play();
		child.print();
		
		//2) 
		Parent parent = new Child(26);  //부모게 안나오고 자식게 나온다.
		System.out.println("child age "+parent.getAge());
		// parent.play();는 부를 수 없다.
		// Parent가 Child 보다 더 작다.
		parent.print();
		
		
			
	}
}
