package com.java.Tv;
public class TvTest {
	
	//int sum; //멤버변수

	public static void main(String[] args) {
		
		int sum = 0; //지역변수
		sum += 10;  //위에 지역변수가 int sum = 0;로 값이 초기화가 되야 오류가 안난다. (int sum; X)
		
		System.out.println(new Tv());
		//new Tv() : 생성된 Tv객체의 첫번째 멤버의 주소값
		
		
		new Tv().power = true;
		new Tv().channel = 10;
		
		Tv t = new Tv();  //참조변수 (== 주소값이 들어있다.)
		//System.out.println(t);
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel);
		
		t.ChannelDown();
		System.out.println(t.channel);
		
		Tv t2  = new Tv();
		t2.channel = 20;
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		
		t2.ChannelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2 = t; //두 참조변수의 타입이 동일한 경우만 가능.(같다고 선언하면 t2의 주소값이 없어짐.->가비지콜렉션)
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t.ChannelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
		


	}

}
