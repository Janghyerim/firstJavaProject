import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// ���ǹ� : ���� ������ ���������� ����
		// if, switch ~ case
		
//		if(���ǽ�(true or false)) { 
//		    ���๮
//	    }else {
//	    }
	    
        //����1
	    //int age = 15;
//	    if(age >= 20) { 
//	    	System.out.println("�����Դϴ�.");
//	    }else {
//	    	System.out.println("�̼����Դϴ�.");
//	    }
	    
		int age = 15;
		if(age>=20) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�̼����Դϴ�.");
		}
		//����2
//		int num = 10;
//		if(num % 2 ==1) {
//	        System.out.println("Ȧ��");
//		}else {
//			System.out.println("¦��"); 
//		}
		int num = 10;
		if(num %2==1) {
			System.out.println("Ȧ��");
		}else {
			System.out.println("¦��");
		}
	    //����3
		
		//����if��
//		int score = 101;
//		
//		if(score >= 90 && score <= 100) {
//			System.out.println("A����");
//		}else if(score >= 80 && score <=89) {
//			System.out.println("B����");
//		}else if(score >= 70 && score <=79) {
//			System.out.println("C����");
//		}else if(score >= 60 && score <=69) {
//			System.out.println("D����");
//		}else if(score >= 0 && score <=59) {
//			System.out.println("F����");
//		}else {
//	        System.out.println("���ǿ� �������� �ʴ´�.");
//	    }
	    
//		��øif��
//		if() {
//			if() {
//		}else {
//			
//		}else {
//			if() {
//		    }
//		  }
//	    }
		
//		int x = 6;
//		if(x %2 == 0) {
//			if(x %3 == 0) {
//		        System.out.println("x�� 2�� 3�� ����� �Դϴ�.");
//			}			
//		}
//	    
//		if (x %2 == 0 && x %3 == 0 ) {
//			System.out.println("x�� 2�� 3�� ����� �Դϴ�.");
//		      }
//	       }
//      }   
		
		int y = 12;
		if(y %2==0) {
			if(y %3==0) {
				System.out.println("y�� 2�� 3�� ����� �Դϴ�.");
			}
		}
		
		if (y %2==0 && y %3==0) {
			System.out.println("y�� 2�� 3�� ����� �Դϴ�.");
		}
//		switch(�񱳰�) {  //�����(==) 1:1��
//		case ��1 : ���๮;
//		break;
//		case ��2 : ���๮;
//		break;
//		case ��3 : ���๮;
//		break;
//		defauit; : ���๮;
//		}
		
//		int sel = 8;
//		switch(sel) { //����,����,���ڿ�   *�Ǽ��� ���Ұ�
//		case 1: System.out.println("1������");
//		break;
//		case 2: System.out.println("2������");
//		break;
//		case 3: System.out.println("3������");
//		break; //���̻� ������ ���� ���� ���� �ش޶�� ��.
//		default : System.out.println("���ǿ� �������� �ʴ´�.");
//		//default : if���� else���� ���� , ���� �� �Ұ� �ϴ�
//	    }
		
		int del = 2;
		switch(3) {
		case 1:System.out.println("1������");
		break;
		case 2:System.out.println("2������");
		break;
		default:System.out.println("���ǿ� ���� ����.");
		}
		
		//switch ���� ����
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ù��° ���� �Է� : ");
//		int num1 = sc.nextInt();
//		System.out.println("�ι�° ���� �Է� : ");
//		int num2 = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("�����ڸ� �Է��ϼ��� : (+, -, *, /)");
//		String op = sc.nextLine();
//		
//		switch(op) {
//		case "+" : System.out.println(num1 + num2);
//		break;
//		case "-" : System.out.println(num1 - num2);
//		break;
//		case "*" : System.out.println(num1 * num2);
//		break;
//		case "/" : System.out.println(num1 / num2);
//		break;
//		default : System.out.println("����Ұ�");
//		}
		
		//switch ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� : ");
		int num3 = sc.nextInt();
		System.out.println("�ι�° ���� �Է� : ");
		int num4 = sc.nextInt();
		
		sc.nextLine(); //nextLine() : ��°�� ����ڰ� �Է��� ���ڿ� ��(����ġ�� �� ������� �����Ѵ�.)
		
		System.out.println("�����ڸ� �Է��ϼ��� : (+,-,*,/)");
		String po = sc.nextLine();
		
		switch(po) {
		case "+" : System.out.println(num3 + num4);
		break;
		case "-" : System.out.println(num3 - num4);
		break;
		case "*" : System.out.println(num3 * num4);
		break;
		case "/" : System.out.println(num3 / num4);
		break;
		default : System.out.println("����Ұ�");
		}
		
	
	}
	
}

		
		

		
		
		
		
		
		

		
		
		

