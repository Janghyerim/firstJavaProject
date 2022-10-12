package com.java.Tv;

public class Tv {  //대상이 정해지면 속성은 변수로,기능은 메소드로 정의 하면됨.

//부모클래스 : 여러 자식클래스를 갖는다.	
//          단일 상속만 가능하다.	
//	속성
//	크기,전원버튼,채널,볼륨,색상,인터넷,....모델,제조년도,제조사
//	기능(행위)
//	전원(ON/OFF),채널 (UP/DOWN),볼륨(UP/DOWN),....
//  클래스  = 설계도
	boolean power; //전원버튼    false(데이터타입 기본값)
	int channel; //채널  0
	int volume; //볼륨   0
	String color; //색상   null
	String model; //모델   null
	int year; //제조년도   0
	String company; //제조사   null
 	
	
	void Power() {   //전원(ON/OFF)
		power = !power; // t일때 f, f일때 t
	}
	void ChannelUp() {  //채널 (UP/DOWN)
		channel++;
	}
	void ChannelDown() {  //채널 (UP/DOWN)
		channel--;
	}
	void VolumeUp() {  //볼륨(UP/DOWN)
		volume++;
	}
	void VolumeDown() {  //볼륨(UP/DOWN)
		volume--;
	}
	//행위는 근거없이 만들어지지 않고, 속성을 근거하여 만들어짐.
	
	void showInfo() {
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
	

}
