package object;

public class Value {
	int value;

	protected Value(int value) {
		super();//object�� ������ �θ� �����ڸ� �����޴´�.
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) { 
		//value1.equals(value2)
		// Object obj = value2; obj.value(x) => �ڽ� ��ü�� ����ȯ
		
		Value v = (Value)obj; // obj�� value ��ü�� ����ȯ
		
		if (this.value == v.value) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return value+""; //int ���� ���ڿ��� ���� : int+"", String.valueOf(int)
	}
}
