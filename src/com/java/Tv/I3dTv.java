package com.java.Tv;
public class I3dTv extends Tv {
	//TvŬ�����κ��� ���� 7���� �޼ҵ� 6���� ��ӹ޴´�.
		boolean i3d;
		
		void i3dPower() {
			if(i3d) {
				System.out.println("3D��� ������...");
			}
		}

		boolean i4d;
		
		void i4dPower() {
			if(i4d) {
				System.out.println("4D��� ���� ��...");
			}
		}
}
