package com.java.Tv;

public class captionTvTest {

	public static void main(String[] args) {
		captionTv ctv = new captionTv(); //기본생성자호출
		ctv.channel = 10;
		System.out.println(ctv.channel); //10
		ctv.ChannelDown();
		System.out.println(ctv.channel); //9         //부모  상속 받아 불러온 것
		
		
		ctv.caption = true;
		ctv.displayCaption("오늘의 날씨를 알려 드립니다.");  //자식 다른 조건도 쓸수 있다.
		
		I3dTv idd = new I3dTv();
		idd.i3d = true;
		idd.i3dPower();
		
		I3dTv dd = new I3dTv();
		dd.i4d = true;
		dd.i4dPower();
		
		InternetTv internet = new InternetTv();
		internet.internet = true;
		internet.internetPower();
		
		
		
		
		
		

	}

}
