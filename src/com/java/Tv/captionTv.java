package com.java.Tv;
public class captionTv extends Tv {
	//TvŬ�����κ��� ���� 7���� �޼ҵ� 6���� ��ӹ޴´�.
	//extends : ��ӹ޾� Ȯ������ ���Ѵ�.
	boolean caption; //false
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
