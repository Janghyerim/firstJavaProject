import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// 조건문 : 실행 문장을 선택적으로 실행
		// if, switch ~ case
		
//		if(조건식(true or false)) { 
//		    실행문
//	    }else {
//	    }
	    
        //예제1
	    //int age = 15;
//	    if(age >= 20) { 
//	    	System.out.println("성인입니다.");
//	    }else {
//	    	System.out.println("미성년입니다.");
//	    }
	    
		int age = 15;
		if(age>=20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년입니다.");
		}
		//예제2
//		int num = 10;
//		if(num % 2 ==1) {
//	        System.out.println("홀수");
//		}else {
//			System.out.println("짝수"); 
//		}
		int num = 10;
		if(num %2==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
	    //예제3
		
		//다중if문
//		int score = 101;
//		
//		if(score >= 90 && score <= 100) {
//			System.out.println("A학점");
//		}else if(score >= 80 && score <=89) {
//			System.out.println("B학점");
//		}else if(score >= 70 && score <=79) {
//			System.out.println("C학점");
//		}else if(score >= 60 && score <=69) {
//			System.out.println("D학점");
//		}else if(score >= 0 && score <=59) {
//			System.out.println("F학점");
//		}else {
//	        System.out.println("조건에 부합하지 않는다.");
//	    }
	    
//		중첩if문
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
//		        System.out.println("x는 2와 3의 공배수 입니다.");
//			}			
//		}
//	    
//		if (x %2 == 0 && x %3 == 0 ) {
//			System.out.println("x는 2와 3의 공배수 입니다.");
//		      }
//	       }
//      }   
		
		int y = 12;
		if(y %2==0) {
			if(y %3==0) {
				System.out.println("y는 2와 3의 공배수 입니다.");
			}
		}
		
		if (y %2==0 && y %3==0) {
			System.out.println("y는 2와 3의 공배수 입니다.");
		}
//		switch(비교값) {  //등가연산(==) 1:1비교
//		case 값1 : 실행문;
//		break;
//		case 값2 : 실행문;
//		break;
//		case 값3 : 실행문;
//		break;
//		defauit; : 실행문;
//		}
		
//		int sel = 8;
//		switch(sel) { //숫자,문자,문자열   *실수는 사용불가
//		case 1: System.out.println("1번선택");
//		break;
//		case 2: System.out.println("2번선택");
//		break;
//		case 3: System.out.println("3번선택");
//		break; //더이상 비교하지 말고 실행 종료 해달라는 뜻.
//		default : System.out.println("조건에 부합하지 않는다.");
//		//default : if문의 else같은 존재 , 범위 비교 불가 하다
//	    }
		
		int del = 2;
		switch(3) {
		case 1:System.out.println("1번선택");
		break;
		case 2:System.out.println("2번선택");
		break;
		default:System.out.println("조건에 맞지 않음.");
		}
		
		//switch 계산기 예제
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 숫자 입력 : ");
//		int num2 = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("연산자를 입력하세요 : (+, -, *, /)");
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
//		default : System.out.println("연산불가");
//		}
		
		//switch 계산기 예제
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int num3 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int num4 = sc.nextInt();
		
		sc.nextLine(); //nextLine() : 통째로 사용자가 입력한 문자열 값(엔터치기 전 공백까지 포함한다.)
		
		System.out.println("연산자를 입력하세요 : (+,-,*,/)");
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
		default : System.out.println("연산불가");
		}
		
	
	}
	
}

		
		

		
		
		
		
		
		

		
		
		

