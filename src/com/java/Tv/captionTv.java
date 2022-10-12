package com.java.Tv;
public class captionTv extends Tv {
	//Tv클래스로부터 변수 7개와 메소드 6개를 상속받는다.
	//extends : 상속받아 확장함을 뜻한다.
	boolean caption; //false
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
