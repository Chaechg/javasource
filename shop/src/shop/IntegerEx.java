package shop;

import java.util.Scanner;

public class IntegerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		
		//5 => "5"
		String input = sc.next();
		System.out.println(input+5); // +는 연결의 의미
		
		//"5"=>5
		int num = Integer.parseInt(input);
		//Integer.parseInt 문자를 숫자로 변경. 무조건 외울 것!!
		//사용자가 숫자 형태로 입력하지 않으면 오류가 날 수 있다.
		System.out.println(num+5); 	//+는 연산의 의미
	}
}
