package com.java.Tv;
public class InternetTv extends Tv {
	//Tv클래스로부터 변수 7개와 메소드 6개를 상속받는다.
	boolean internet;
	
	void internetPower() {
		if(internet) {
			System.out.println("인터넷 기능 동작중..");
		}
	}
}
