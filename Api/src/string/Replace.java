package string;

// String 클래스의 특징 => Immutable (불변)

public class Replace {
	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		
		//자바 =>Java
		
		System.out.println(str1);
		str1.replace("자바", "Java");
		System.out.println(str1); //변경되지 않음
		// 처음 생성되는 것은 바꾸지 않느다.
		// 변경한 것을 다시 str1에 담아야 한다. 
		
		str1 = str1.replace("자바", "Java"); //기존에 있던 것을 없애고 다시 담은 의미이다.
		System.out.println(str1); 
		
		//replaceAll => 모두 바꿈
		//replaceFirst => 앞에만 바꿈
		
		String str2 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		str2 = str2.replaceFirst("자바", "Java"); 
		System.out.println(str2); 
	}
}
