package exception;

public class UnCheckedException3 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		//ClassCastException -cat을 dog로 바꿀 수 없음
		changeDog(cat);
	}
	//왼쪽은 부모, 오른쪽은 자식
	//Animal animal =dog;
	//Animal animal =cat;
	public static void changeDog (Animal animal) {
		if (animal instanceof Dog) {  //이 구문을 넣으면 오류가 나지 않는다.
			Dog dog = (Dog) animal;
		}
		
		
	}
}
