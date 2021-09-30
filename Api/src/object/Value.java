package object;

public class Value {
	int value;

	protected Value(int value) {
		super();//object를 포함한 부모 생성자를 물려받는다.
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) { 
		//value1.equals(value2)
		// Object obj = value2; obj.value(x) => 자식 객체로 형변환
		
		Value v = (Value)obj; // obj를 value 객체로 형변환
		
		if (this.value == v.value) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return value+""; //int 값을 문자열로 변경 : int+"", String.valueOf(int)
	}
}
