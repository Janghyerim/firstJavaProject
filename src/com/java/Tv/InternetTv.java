package com.java.Tv;
public class InternetTv extends Tv {
	//TvŬ�����κ��� ���� 7���� �޼ҵ� 6���� ��ӹ޴´�.
	boolean internet;
	
	void internetPower() {
		if(internet) {
			System.out.println("���ͳ� ��� ������..");
		}
	}
}
