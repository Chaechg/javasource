package string;

public class IndexOf {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		// 목적 : 매개값으로 주어진 문자열이 시작되는 위치를 리턴
		int index = str1.indexOf("프로그래밍");
		System.out.println(index);
		
		//찾으면 찾은 위치를, 못찾으면 -1을 출력한다.
		System.out.println("못찾는 경우 "+str1.indexOf("파이썬"));
		
		System.out.println();
		
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf(65));  //65는 A이다. 아스키코드
		System.out.println(str2.indexOf('f'));  
		System.out.println(str2.indexOf("el",2));  
		
		//lastIndexOf : 가장 뒤에 있는 l을 찾아준다. 
		System.out.println("l 찾기:"+str2.lastIndexOf("l"));
		
		
		//그가 들어있는지 확인 - 나
		if (str1.indexOf('그') > -1 ) {
			System.out.println("포함하고 있음");
		}else {
			System.out.println("포함하고 있지 않음");
		}
		//if~else는 삼항연사자로 변환 가능
		
		//그가 들어있는지 확인 - 강사님
		System.out.println(str1.indexOf("그") > -1?"포함하고 있음":"포함하고 있지 않음");
		
	}
}
