package com.java.Tv;

public class captionTvTest {

	public static void main(String[] args) {
		captionTv ctv = new captionTv(); //�⺻������ȣ��
		ctv.channel = 10;
		System.out.println(ctv.channel); //10
		ctv.ChannelDown();
		System.out.println(ctv.channel); //9         //�θ�  ��� �޾� �ҷ��� ��
		
		
		ctv.caption = true;
		ctv.displayCaption("������ ������ �˷� �帳�ϴ�.");  //�ڽ� �ٸ� ���ǵ� ���� �ִ�.
		
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
