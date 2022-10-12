package com.java.Scanner;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //초기화
		System.out.print("정수 하나를 입력하세요: ");
		int num = sc.nextInt(); //콘솔창에 직접 입력 (실행)
		System.out.println("입력하신 정수는 : " + num); //출력
	
		System.out.println(); //줄바꿈
		
        System.out.print("실수 하나를 입력하세요: ");	
        double d = sc.nextDouble();
        System.out.println("입력하신 실수는 : " + d);
        
        System.out.println();
        sc.nextLine(); //문자 입력 시 버퍼 \n을 제거하기 위해 구문 하나를 더 써줘야한다.  =>문자를 먼저 입력하고 숫자를 출력하면 문제가 안되나, 숫자를 먼저 입력하고 문자를 입력하면 이와같이 실행 되어야 출력 가능하다.
	
	    System.out.print("문자를 입력하세요: ");
	    String str = sc.nextLine();
	    System.out.println("입력하신 문자는 : " + str);
	    
	}

}
