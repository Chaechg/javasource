package inheritance;

public class SubListStringEx {
	public static void main(String[] args) {
		SubListString obj = new SubListString();
		obj.list(); //하위클래스만 출력 => 상위클래스도 출력  <= super();의 영향
		
		obj.writer();
	}
}
