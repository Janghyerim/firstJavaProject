
public class OverLoading {
	//��ü : ���,������,ĸ��ȭ(��������)
	//�����ε� : �޼ҵ�� ���ǽ� ����ϴ� ���
	//1.�޼ҵ��� �̸��� �����ϰ� ����Ѵ�.
	//2.�� �Ű������� Ÿ�� �Ǵ� ������ �޶���Ѵ�.
	//3.����Ÿ�԰��� �����ϴ�.
	//4.��ü�� ������ ����  
	
	int x;
	
	//������Ÿ���̳� ������ �ٸ� ����
	void add () {}
	
	void add(int x) {}
	
	void add(long l) {}
	
	void add(int x,int y) {}
	
	void add(int x,long y) {}
	
	void add(long x,int y) {}
	
	//int add() {}  X

}