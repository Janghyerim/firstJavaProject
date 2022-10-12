package com.java.Hello;

public class Hello2 {

	public static void main(String[] args) {
		/* print , println , printf 의 기능*/
		
		System.out.print("Hello World!!2");
	    System.out.print("Hi~~");
	
	    System.out.println(); //줄바꿈
	    
	    System.out.println("Hello World!!2");
	    System.out.println("Hi~~");
	    
        // : 한줄 주석 , /* */ : 여러줄 주석 (Ctrl+/)
        
	    /*
	     System.out.printf("%d\n", 10); //format = %d , 뒤에오는 숫자가 대입이 된다.
	     System.out.printf("%d\n", 20);
	    */
	    //함수의 포맷 스트링
        System.out.printf("제 나이는 %d살 입니다.\n", 30);
        System.out.printf("%s", "안녕하세요"); //%s = 문자열이 대입이 된다.
        System.out.println();
	
	    //sysout + (ctrl+space) = System.out.println();
        System.out.println("자동완성");
	}
}
