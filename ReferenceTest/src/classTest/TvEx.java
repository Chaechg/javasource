package classTest;

public class TvEx {
	public static void main(String[] args) {
		//객체 선언, 생성
		TV tv1 = new TV("black",8); 
		//2번째 생성자로 넘겨준다. 
		//black은 color가, 8은 channel이 받는다.
		
		
//		TV tv1 = new TV("black",8);
//		tv1.color="black"
//		tv1.channel = 8;
		//이런 방식으로는 쓰지 않는다. 같은 의미이기는 하다
		
		TV tv2 = new TV();
		tv2.color="white";
		
		//객체조작
		System.out.println("채널 상태 : "+tv1.channel);
		System.out.println("채널 상태 : "+tv2.channel);
		
		
		
		
	}

}
