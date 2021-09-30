package object;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("삼성", "안드로이드");
		SmartPhone phone2 = new SmartPhone("애플", "ios");
		
		System.out.println(phone1); //phone.toString()
		System.out.println(phone2); //phone.toString()
		//오버라이딩 했으므로, 주소값이 나오지 않는다.
	}
}
