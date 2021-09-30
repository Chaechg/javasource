package inheritance;

public class CarEx {
	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
		//f = a;  //Type mismatch. ��Ӱ��谡 �ƴ� Ŭ�������� ����ȯ �Ұ�
		
		//Car car = new FireEngine();  ������ �θ�, �������� �ڽ� => car�� ������ �θ��� ������ ���ѵȴ�.
		f = new FireEngine();
		Car car = f;  //��Ӱ���� ����ȯ�� �����ϴ�.��ĳ����(- ����ȯ ��������)
		//car.water(); ������ �ʴ´�.
		
		FireEngine f2;
		f2 = (FireEngine) car; //�ٿ�ĳ����( - ����ȯ ���� �Ұ�)
		f2.water();  //f2�� Car�� FireEngine�� ��� ���� ������ �� �ִ�.
		
		
		
		
	}
}
