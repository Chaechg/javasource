package exception;

public class UnCheckedException3 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		//ClassCastException -cat�� dog�� �ٲ� �� ����
		changeDog(cat);
	}
	//������ �θ�, �������� �ڽ�
	//Animal animal =dog;
	//Animal animal =cat;
	public static void changeDog (Animal animal) {
		if (animal instanceof Dog) {  //�� ������ ������ ������ ���� �ʴ´�.
			Dog dog = (Dog) animal;
		}
		
		
	}
}
