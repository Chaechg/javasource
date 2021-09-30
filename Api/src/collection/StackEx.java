package collection;

import java.util.Stack;

//Stack : LIFO(Last In First Out) 구조
//		: 수식 계산, 수식 괄호 검사, undo, redo, 웹브라우저 뒤로/앞으로

public class StackEx {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		//데이터 삽입
		stack.push("사과");
		stack.push("딸기");
		stack.push("바나나");
		stack.push("감");
		
		//데이터 가져오기
		System.out.println(stack); //toString이 오버라이딩 되어있다.
		
		System.out.println();
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}
}
