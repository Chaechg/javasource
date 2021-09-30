package classTest;

public class TV {
	TV tv; 
	//속성
	String color;
	boolean power;
	int channel;
	
	//생성자
	TV(){
		//default(기본) 생성자
		//명시적으로 생성자가 하나도 선언되지 않았다면 컴파일러가 자동으로 만들어냄
	}
	TV(String color, int channel){
		this.color = color;     //this는 이 객체가 가지는 속성을 의미한다.
		this.channel = channel; //갈색글을 파란글에 넣어줘.
	}
	
	
	//동작
	void power(){
	};
	
	void channelUp() {
		channel++;
	};
	
	void channelDown() {
		channel--;
	};
	
}
	
