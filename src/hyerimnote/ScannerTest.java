package hyerimnote;

import java.util.*;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		System.out.println("스캐너 입력해");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		String name = sc.next();
		System.out.println();
		int age = sc.nextInt();
		System.out.println();
		double weight = sc.nextDouble();
		System.out.println();
		//sc.next();
		boolean isSingle = sc.nextBoolean();
		System.out.println();
		
		System.out.println("ok");
		
		sc.close();
		

	}

}
