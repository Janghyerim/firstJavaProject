package com.java.Scanner;
import java.util.Scanner;

public class ScannerAgain {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.print("�̸��� " + name + ", ");

		String city = sc.next();
		System.out.print("���ô�" + city + ", ");
		
		int age = sc.nextInt();
		System.out.print("���̴� " + age + "��, " );
		
		double weight = sc.nextDouble();
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean isSingle = sc.nextBoolean();
		System.out.println("���ſ��δ� " + isSingle + "�Դϴ�.");
		
		sc.close(); //��ĳ�� ��ü �ݱ� �ʼ�!!
		
		
		
		String type2 = sc.nextLine();
		String type = sc.next();
		int number = sc.nextInt();
		double height = sc.nextDouble();
		boolean isCouple = sc.nextBoolean();
		sc.close();
		
		
	}

}
