package com.java.Tv;
public class TvTest {
	
	//int sum; //�������

	public static void main(String[] args) {
		
		int sum = 0; //��������
		sum += 10;  //���� ���������� int sum = 0;�� ���� �ʱ�ȭ�� �Ǿ� ������ �ȳ���. (int sum; X)
		
		System.out.println(new Tv());
		//new Tv() : ������ Tv��ü�� ù��° ����� �ּҰ�
		
		
		new Tv().power = true;
		new Tv().channel = 10;
		
		Tv t = new Tv();  //�������� (== �ּҰ��� ����ִ�.)
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
		
		t2 = t; //�� ���������� Ÿ���� ������ ��츸 ����.(���ٰ� �����ϸ� t2�� �ּҰ��� ������.->�������ݷ���)
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t.ChannelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
		


	}

}
