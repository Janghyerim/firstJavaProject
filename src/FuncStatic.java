
public class FuncStatic {
	int iv;
	static int cv;
	
	//����޼ҵ� : �ν��Ͻ� �޼ҵ�
	//         -�ν��Ͻ�����,Ŭ�������� ��� ��밡��
	//         -�ν��Ͻ��޼ҵ�,Ŭ�����޼ҵ� ��� ��밡��
	
	//         Ŭ����(static)�޼ҵ�
	//         -��ü �������� ��밡��
	//         -Ŭ��������,Ŭ�����޼ҵ常 ��밡��
	
	void instanceMethod() {
		System.out.println("instanceMethod() call");
		iv = 10;
		cv = 20;  //��ü���� ������ ����� �ǹǷ� ������ �ȳ���.
		
		System.out.println("iv = "+iv);
		System.out.println("cv = "+cv);
		
		staticMethod();
		
		
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() call");
		// iv = 30;  //�ν��Ͻ� ���� ��� �Ұ�
		              //�ν��Ͻ� ������ �ν��Ͻ� �޼ҵ�� �����Ͽ� ������ �ȳ���, 
		              //����ƽ �޼ҵ忡 �ν��Ͻ������� ���ԵǸ� �޸� �Ҵ��� �ȵǾ� ����������. 
		cv = 40;
		
		System.out.println("cv = "+cv);
		
		//instanceMethod();  //���������� �ٸ��� ������ �ν��Ͻ� �޼ҵ� ��� �Ұ�
		
	}
	

}
