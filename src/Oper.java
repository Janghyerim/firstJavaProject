import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		//���������
		//+, -, *, /(������|,��), %(������)
		
//      int x = 5;
//      int y = 2;
//      System.out.println(x/y); //2
//      System.out.println(x%y); //1
//      System.out.printf("%d\n",(x/y)); //2
//      System.out.printf("%d",(x%y)); //1
        
        //�Ϲݿ���
//      double pi = 3.14;
//      pi = 2.34; //���� ����ȴ�.
//      System.out.println(pi); 
		//���
//      final double PI = 3.14; //�ҹ��ڷ� ���ٰ� ������ ������ �ȳ�����, ��Ӱ��� ����̴�.
//      PI = 2.34; //���� ���� �Ұ��ϰ�,�빮�ڷ� ����� �Ѵ�. ��� : ����
//      System.out.println(PI);
        
        //����ȯ(�ڷ��� or ������Ÿ��)
//      int -> double
//      boolean�� ���� (���ڳ� ���ڰ� �ƴ� ��,�����̹Ƿ�...)
//      --------------------------------------------------------->  �ڵ� ����ȯ
//      byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)   => ����<�Ǽ��� ��
//           char(2)       < 
//      <---------------------------------------------------------  ���� ����ȯ
		
//      byte b = 85;
//      int i = b;  //������ Ÿ���� �ٸ��� ���� Ÿ������ ���߱� ���� �ڵ� ����ȯ. 
        
//      int i = 85;
//      byte b = (byte)i;  //������ ���� : Type mismatch: cannot convert from int to byte ������������ ū������ �� ��,���� ����ȯ�� ���� ����ߵȴ�.
               //�׽��� ������
       
//		int i = 300;
//      byte b = (byte)i; //��������ȯ(������ �ս��� �߻� (������ ��Ʈ�� ���Ǿ� �ڵ� ���� ���̴�.))
//      System.out.println(b); 
        
//      double d = 3.14;
//      int i = (int)d;
//      System.out.println(i); //�Ҽ��ڿ� ���� ��������, �տ� �����θ� �����Ѵ�. ->3
        
//      int i = 3;
//      double d = i;
//      System.out.println(d);  //3.0
		
//		byte b = 65;
//		char c = (char)b;
//		System.out.println(c); //�ƽ�Ű�ڵ� ��ȯ���� ���� 'A'�� ��µȴ�.
		
//		int x = 10;
//		int y = 20;
//		int result = x + y;
//		System.out.println(result);
		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = (byte)(b1 + b2); //byte b = (byte)(int + int)  
//		System.out.println(result);
		
		//����� int���� ���� ����Ÿ���� ��� int������ �ڵ� ����ȯ �ȴ�.
//		byte + byte -> int + int
//		byte + short -> int + int
//      char + byte -> int + int // char �� �����̳� �����ڵ�� ��ȯ�Ͽ� ���ڷ� ǥ���� �ȴ�.
		
		//int������ ������ �� ũ�� ū�ɷ� ����.
//		int + long -> long + long
//		int + float -> float + float 
//		float + double -> double + double
		
		//����)
//		int x = 5;
//		int y = 2;
//		double result = x / y; //2.0
//		double result = x % y; //1.0
//		System.out.println(result);
		
		//����)
//		int x = 3;
//		int y = 5;
//		//double result = (double)x / y; // 3.0/5.0 = 0.6 
//		double result = (double)(x / y); // 0.0
//		System.out.println(result);
		
		//String ����ȯ ����
//		String str = "java";
//		double ver =1.8;
//		String result = str + ver; //"java" + "1.8" -> "java1.8"
//		System.out.println(result);
	
//		       (�Ÿ���̰�)
//		String + anyType -> String
//		String + double -> String + String -> String
		
		//+ => ���, ����, ��ȣ(���or����)
		
	
		
		//���������� : ���� 1 ����, ���� 1 ���� 
		// ++ , --
		//�������� ��� �����ϴ�.
		//��ġ, ��ġ ��� �����ϴ�.
		
		//����
//		int x = 10;
//		++x; //11
//		System.out.println(x);
//		x++; //12
//		System.out.println(x);
//		--x; //11
//		System.out.println(x);
//		x--; //10
//		System.out.println(x);
		
		//����
//		int x = 10;
//		int y = 0;
//		
//		y = x++ +10; // x=11 , y=20 �����ڰ� �ڿ� �ִٸ�, �켱���� ���� ������ �ڿ� �ٽ� ������Ų��.
//		System.out.println("x = "+ x +","+"y = "+y);
		
//		y = ++x + 10; // x=11 , y=21 �����ڰ� �տ� �ִٸ�,���� �켱���� �̴� ���� ���� ��Ű�� y���� ���Ѵ�.
//		System.out.println(y);
//		System.out.println("x = "+ x +","+"y = "+y);
		
		//���Կ����� 
		//������ ���Ǵ� ������
		// = , += , -= , *= , /= , <<= , |= ......
		//int a = 10; // = -> �ܼ����Կ�����
		
		
		//���մ��Կ�����
//	    int x = 10; //������ ���� �Ҷ��� ������ ���� �� �־�� �Ѵ�.
//	    x += 10; // x = x + 10
//		System.out.println(x); //20
//		
//		x -= 10;
//		System.out.println(x); //0
//		
//		x *= 2;
//		System.out.println(x); //20
		
		
		//�񱳿�����
		// 5>3 
		// < , > , <= , >= , ==(������) , !=(�ٸ���)
		//true or false
		
//		int x = 10;
//		int y = 20;
//		System.out.println(x < y); //true
//		System.out.println(x > y); //false
//		System.out.println(x <= y); //true
//		System.out.println(x >= y); //false
//		System.out.println(x == y); //false 
//		System.out.println(x != y); //true
		
		//��������
		//&& : AND ���� / ��� true�� ��쿡�� true
		//|| : OR ���� / ��� false�� ��쿡�� false
		// ! : NOT ���� / a�� true�̸� false , false�̸� true
		//�ΰ��� �̻��� ������ Ȯ���� �� ����Ѵ�.
		
		//����
//		int x = 10;
//		int y = 20;
//		int z = 30;
//		System.out.println(x == 10);
//		System.out.println(y == 20);
//		System.out.println(z == 30);
		
		
		//&& AND ������
//		x == 10 && y == 20 // true && true
//		System.out.println(x == 10 && y == 20); // true && true => true 
//		System.out.println(x == 10 && y == 30); // true && false => false
//		System.out.println(x == 50 && y == 30); // false && false => false
//		System.out.println(x == 10 && y == 20 && z == 30); // true && true && true => true
//		System.out.println(x == 10 && y == 20 && z == 40); // true && true && false => false
		
//		true && true => true
//	    true && false => false
//      false && true => false
//		false && false => false
		
		//|| OR ������
//		int x = 10;
//		int y = 20;
//		int z = 30;
//
//      System.out.println(x == 10 || y == 20); //true
//      System.out.println(x == 30 || y == 20); //true
//      System.out.println(x == 30 || y == 50); //false
	
//		true || true => true
//	    true || false => true
//      false || true => true
//		false || false => false 
		
		//! NOT ������
		//!true -> false
		//!false ->true
        
//      int x = 10;
//      System.out.println(!(x==10)); //false
//      System.out.println(!(x==20)); //true
       
//      �Ǽ��� ������ �񱳿���
//		(3.45 <= 2) => (double <= int) => (double <= double) => double����ȯ  //false
//      (3.45 <= 2.0)
		
		//���ǿ����� (���׿����� : �����Ͱ� 3�� �ʿ�)
		// ���ǽ�                         ?  ��� 1  : ��� 2
		//(true or false) ? (true) : (false)
		
//		int x = 10;
//		int y = 20;
//		int result =(x>y)? x : y; //20
//		System.out.println(result);
//		
//		int age = 20;
//		String rs = (age>=20)? "���� �Դϴ�." : "�̼��� �Դϴ�.";
//		System.out.println(rs); //���� �Դϴ�.
		
		
		// 456 -> 400 , 111 -> 100
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �ڸ����ڸ� �Է��ϼ��� : ");
//		int num = sc.nextInt();
//		
//		System.out.println("�Է� ���� �� : " + num);
//		System.out.println("���� �Ǿ��� �� : " + num/100*100);
		
		// 333 -> 331 , 777 -> 771
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1���ڸ� ���ڸ� ������ 1�� �����ϼ���.");
//		int num = sc.nextInt();
//
//		System.out.println("�Է� ���� �� : " + num);
//		System.out.println("���� �Ǿ��� �� : " + (num/10*10+1));
		
//		int i = sc.nextInt();
//		System.out.println("�Է¹��� �� : " + i);
//		System.out.println("����Ǿ��� ��� : " + (i / 10 * 10 + 1));
		
		//10�� ���
        //19 -> 20 , 81 -> 90
//		Scanner sc = new Scanner(System.in);
//        System.out.println("�Է� ���� ����� 10�� ����� ���Ͻÿ�.");
//        int num = sc.nextInt();
//	
//        System.out.println("�Է¹��� �� : " + num);
//        System.out.println("����Ǿ��� ��� : " + ((num/10+1)*10));
	
	    //19 - 20 -> 1, 81 - 90 -> 9 , 24 -> 6	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����ڸ� ���ڸ� �Է��ϼ���.");
//		int num = sc.nextInt();
//	
//		System.out.println("�Է¹��� �� : " + num);
//		System.out.println(10 - num % 10);
	
	    // 30 - 24 = 6
		// 24 % 10 = 4
		// 10 - 4 = 6
		
		//����� ������ �Է¹޴´�.
		//�� �ٱ��Ͽ� 10���� ����� ���� �� �ִ�.
		//�׷� ��� �ٱ��ϰ� �ʿ��ұ��?
		//123 -> 13�� , 456 -> 46�� 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����� ������ �Է��ϼ��� : ");
//		int appleNum = sc.nextInt();
//		
//	    int basketNum = appleNum / 10 + (appleNum % 10 > 0 ? 1 : 0);
//		System.out.println("�� �ٱ��Ͽ� 10���� ����� ���� �� �ֽ��ϴ�.");
//		System.out.println("�׷� �� ���� �ٱ��ϰ� �ʿ��ұ��?");
//		
//		System.out.println(basketNum + "��");
//		System.out.println("�� ����� ������ " + appleNum + "�� �̸� �ٱ��ϴ� " + basketNum + "�� �ʿ��մϴ�.");
//		
//		System.out.print("����� ������ �Է��ϼ��� : ");
//		int apple = sc.nextInt();
//		
//		int c = apple / 10 + (apple % 10 > 0 ? 1:0);
//		System.out.println("����� ���� " + apple + "��");
//		System.out.println("�ٱ����� ���� " + c + "�� �ʿ��մϴ�.");
		
		//�������� ����
//		int x = -3;
//		System.out.println(x >= 0 && x <= 10);
//		System.out.println(!(x > 0 && x < 10));
//		System.out.println(x <= 0 || x >= 10);

  }

}
