
public class MemberInit {
	
	//�������
	//�ʱ�ȭ ���� : �ڵ��ʱ�ȭ -> ����ʱ�ȭ -> �ʱ�ȭ ��� -> �����ڿ����� �ʱ�ȭ
	//*static �ʱ�ȭ ���� �ѹ��� �����ϰ� �ν��Ͻ��� ������ ȣ�⺸�� ���� ��� ��µȴ�.*
	
	int x = 10;
	int y;
	static int cv = 100; //->����ʱ�ȭ
	static int count;
	
	
	{ //�ν��Ͻ� �ʱ�ȭ ���(��ü�� �����ɶ����� ȣ��)
		System.out.println("�ν��Ͻ� �ʱ�ȭ ���");
		x = 10;
		y = 20;
	}
	
	static {  //static �ʱ�ȭ ���(��ü���� �� �� �ѹ��� ȣ��) 
		System.out.println("static �ʱ�ȭ ���");
		count = 1000;
	}
	
	MemberInit(int x,int y){ //���� ������ ȣ��
		System.out.println("�������� ȣ��");
		this.x = x;
		this.y = y;
	}
}
