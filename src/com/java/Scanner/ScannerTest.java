package com.java.Scanner;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //�ʱ�ȭ
		System.out.print("���� �ϳ��� �Է��ϼ���: ");
		int num = sc.nextInt(); //�ܼ�â�� ���� �Է� (����)
		System.out.println("�Է��Ͻ� ������ : " + num); //���
	
		System.out.println(); //�ٹٲ�
		
        System.out.print("�Ǽ� �ϳ��� �Է��ϼ���: ");	
        double d = sc.nextDouble();
        System.out.println("�Է��Ͻ� �Ǽ��� : " + d);
        
        System.out.println();
        sc.nextLine(); //���� �Է� �� ���� \n�� �����ϱ� ���� ���� �ϳ��� �� ������Ѵ�.  =>���ڸ� ���� �Է��ϰ� ���ڸ� ����ϸ� ������ �ȵǳ�, ���ڸ� ���� �Է��ϰ� ���ڸ� �Է��ϸ� �̿Ͱ��� ���� �Ǿ�� ��� �����ϴ�.
	
	    System.out.print("���ڸ� �Է��ϼ���: ");
	    String str = sc.nextLine();
	    System.out.println("�Է��Ͻ� ���ڴ� : " + str);
	    
	}

}
