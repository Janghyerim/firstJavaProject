
public class VarTest {

	public static void main(String[] args) {
//		���־��� ������Ÿ�� : ����,����,���ڿ�,��   etc)��¥,�̹���,������
//      ���� : ���� �����ϴ� ����, ���� ������ �� �ִ�.
//		�ڷ��� ������; -> ������ ����
//
//      ���� : ����, �Ǽ�
//      ���� : ����, ���ڿ�
//		�� : ��, ���� 
//		
//		��
//		��,���� : boolean
//		
//		����
//		���� : byte / short / int / long
//		�Ǽ� : float / double
//		
//		����
//		���� : char ' '
//		���ڿ� : String " "

//      byte ����
		byte b; //byte : -128 ~ 127
		b = 10;
		System.out.println(b);
		
		b = 20;
		System.out.println(b);

//		int ����
		int i; //int : -21�� ~ 21�� ���� 
		i = 300;
		System.out.println(i);
//		
		int x;
		int y;
		int z;
		
		//int x,y,z;
		
		//x=y=z=10;
		
		//int x=10,y=20,z=30; //����� �ʱ�ȭ�� ���ÿ� ���� �ϴ� ����
		
		x = 10;
		y = 20;
		z = 30;
		
		System.out.println(x);
	    System.out.println(y);
		System.out.println(z);
		
//		short ����
//		short s = 10; //short : -32768 ~ 32767
      
//		long ����  
//      long l = 10L; //long : ���� ŭ.  /Ư¡ : ���ڵڿ� L�� �ٿ���� �Ѵ�. 		
		
//		char ����
//		char c;  //char : 0 ~ 65525 (������ �ٷ�.)
//		c= 'a';
//		System.out.println(c);
//		
//		char c2 = '��';
//	    System.out.println(c2);
//		
//	    char c = 'A'; //65 char�� ������ ������ ������ ��, int�� �ѹ� �� �����ϰ� ����ϸ� �ڵ����� 65�� ��µȴ�.
//	    int i = c;
//	    System.out.printf("%c\n",c);
//	    System.out.printf("%d",i);   //%d : +-��ȣ �ִ� ���� byte,short,int�� ��� �ǰ� long�� %l���� ����.
//	    
//	    char c1,c2;
//	    c1 = 'A'; //65
//	    c2 = 'B'; //66
//	    System.out.println(c1+c2); // 'A'+'B'
		
		//'A'->65, 'a'->97 , '0'->48
	    
//		String ����
		String str = "A";
		String str2 = "abc";
		
		System.out.println(str);
		System.out.println(str2);
		System.out.printf("%s\n", str);
		System.out.printf("%s\n", str2);
		
//		float ����
		float f = 3.14159445463f;  //���̻�� �ʼ� (��,�ҹ��� �������.)
		System.out.println(f);
		System.out.printf("%.3f\n", f); //�Ҽ����� .����°�ڸ����� ��Ÿ���� �ִ�. / %�ڿ� .2�� ������ ��°�ڸ����� ��Ÿ�� �� �ִ�.
		
//		double ����
		double d = 3.14; //���̻�� ���û��� (��,�ҹ��� �������.)
		System.out.println(d);
		System.out.printf("%.4f", d);
		
//		�ڷ����� �⺻ Ÿ��
//		���� : int
//		�Ǽ� : double
		
//     	boolean ����
//		boolean b;
//		b = true;
//		System.out.println(b);
//		b = false;
//		System.out.println(b);
		
//		������ �⺻��
//		boolean -> false
//		byte    -> 0
//		short   -> 0
//		int     -> 0
//		long    -> 0L
//		
//		char    -> ''  // ĭ ���� �ϸ� �ȵȴ�.
//		
//		float   -> 0.0f
//		double  -> 0.0d //���̻� ���û���
//		
//		String  -> null, ""  // ĭ ���� �������.
		
//		���ͷ� : ������ ���Ǵ� ��
		
	  }

}
