package com.java.Tv;

public class Tv {  //����� �������� �Ӽ��� ������,����� �޼ҵ�� ���� �ϸ��.

//�θ�Ŭ���� : ���� �ڽ�Ŭ������ ���´�.	
//          ���� ��Ӹ� �����ϴ�.	
//	�Ӽ�
//	ũ��,������ư,ä��,����,����,���ͳ�,....��,�����⵵,������
//	���(����)
//	����(ON/OFF),ä�� (UP/DOWN),����(UP/DOWN),....
//  Ŭ����  = ���赵
	boolean power; //������ư    false(������Ÿ�� �⺻��)
	int channel; //ä��  0
	int volume; //����   0
	String color; //����   null
	String model; //��   null
	int year; //�����⵵   0
	String company; //������   null
 	
	
	void Power() {   //����(ON/OFF)
		power = !power; // t�϶� f, f�϶� t
	}
	void ChannelUp() {  //ä�� (UP/DOWN)
		channel++;
	}
	void ChannelDown() {  //ä�� (UP/DOWN)
		channel--;
	}
	void VolumeUp() {  //����(UP/DOWN)
		volume++;
	}
	void VolumeDown() {  //����(UP/DOWN)
		volume--;
	}
	//������ �ٰž��� ��������� �ʰ�, �Ӽ��� �ٰ��Ͽ� �������.
	
	void showInfo() {
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
	

}
