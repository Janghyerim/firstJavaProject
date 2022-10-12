import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//반복문 : 실행문을 여러번 효율적으로 동작할 수 있도록 도와준다. 
		//for, while, do-while(거의 잘 안씀)
	    
//      for(초기값;조건식;증감식) {
//        	실행문
//      }                        
//		//증감식기본예제                                  // 0,1,2,3,4,5,6,7,8,9
//		for(int i=0; i<10; i++) { //i++로 출력이 된 다음, 다시 초기값으로 가면 0이되므로, 조건식으로 넘어가서 반복된다.
//			System.out.println(i + " : Hello");
//		}
		//증감식응용예제	
//		for(int i=0;i<10;i+=2) { //0,2,4,6,8
//			System.out.println(i + " : hello");
//		}
		//마이너스포문예제
//		for(int i=10;i>0;i--) { //10,9,8,7,6,5,4,3,2,1
//			System.out.println(i + " : hello");
//		}
		//무한반복문
//		for(;true;) { 
//			System.out.println("hello");
//		}
		
//		int k = 1;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(k++);
//		}
		
		//1-10사이 정수값 중에 짝수만 출력 (개인문제)
//		for(int i=1;i<=10;i++) {
//			if(i %2 == 0) {
//				System.out.println(i);
//			}
//		}
//		System.out.println("hello");
		
		//1 + 2 + 3 +   +10 => 55
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//		sum += i;	//sum = sum + i  0  =   0  + 1
//		}
//		System.out.println(sum);

		
		// 1-10까지의 정수중에 홀수의 합과 짝수의 합을 각각 구해서 출력.
//		int sum = 0;//홀수
//		int own = 0;//짝수
//		
//		for (int i = 1;i<=10;i++) {
//			if(i %2 == 1) {
//		      sum += i;
//			}else {
//			  own += i;
//			}
//		}
//		System.out.println("홀수" + sum);
//		System.out.println("짝수" + own);
//		    }
	    
	    
//		for문과 while문 차이
//		for(초기값;조건식;증감식) {
//        	실행문
//		}
//		
//		1.초기값
//		2.while(조건식) {
//		3.	    실행문
//		4.	    증감식	
//		}
	 
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//		    i++;
//		}
	    
//		int i = 10;
//		while(i > 0) {
//			System.out.println(i);
//	        i--;	
//		}
	
		//while문으로 숫자 합 구하기
//		int sum = 0;
//		int i = 1;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//      System.out.println(sum);	
	
		//while문으로 무한 반복하기
//		while(true) {
//			System.out.println("hello");
//		}
	
		//boolean타입의 while문의 무한반복
//	    boolean flag = true;
//	    int cnt = 0;
//	    while(flag) { //flag = true 이니까 무한반복
//	                  //조건이 따로 정해져 있지 않아 아래에 if문을 넣어주고 조건넣어주면 멈춘다.
//	    	cnt++;
//	    	System.out.println(cnt);
//	    	
//	    	if(cnt>200) {
//	    		flag = false;
//	    	}
//	}
        
		//중첩for문
//	    for() {//n = 5   n*m , 5*5=25
//	    	for() { //m = 5
//	    		실행문 (25번 반복된다.)
//	    	}
//	    }
	    
		//예제
//	    int k = 1;	
//	    for(int i = 0; i<5;i++) {
//	    	for(int j = 0;j<5;j++) {
//	    		System.out.println(k++);
//	    	}
//	    }
	
	    //구구단출력 p.123 
		//for문의 세로출력
//		for(int i=0; i<10;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.println(i+"x"+j+"="+i*j);
//		        System.out.println('\t');	//* '\t' : 하나씩 탭으로 띄우기 기능
//			}
//			System.out.println("===");
//		}
		
		//for문의 가로출력
//		for(int i =0;i<=9;i++) {
//			for(int j =0;j<=9;j++) {
//				System.out.print(j+"x"+i+"="+j*i+"");
//				System.out.print('\t');
//			}
//	        System.out.println();	
//		}
		
		//중첩while문
//		초기값1
//	    while(조건식) {
//	    	초기값2
//	    	while(조건식){
//	    		실행문
//	    		증감식2
//	    	}
//	    	증감식1
//	    }
		
        //이중while문
//	    int k = 1;
//	    int i = 0;
//	    while(i<5) {
//	    	int j = 0;
//	    	while(j<5) {
//	    		System.out.println(k++);
//	    		j++; //반복 되야 하니 실행문 제일 마지막에 써준다.
//	    	}
//	    	i++;
//	    }  
		
		//while문의 세로출력 
//		int i = 0;
//		while(i<10) {
//			int j = 0;
//			while(j<10) {
//				System.out.println(i + "x" + j + "=" + i*j);
//	            j++;
//				System.out.println('\t');		
//			}
//			i++;
//			System.out.println("===");
//		}
		//while문의 가로출력
//	    int h = 0;
//	    while(h<=9) {
//	    	int m = 0;
//	    	while(m<=9) {
//	    		System.out.print(m + "x" + h + "=" + m*h + "");
//	    	    m++;
//	    	    System.out.print('\t');
//	    	}
//	         h++;
//	         System.out.println();
//	    }
		
		//for문의 활용
//		for(int i =0,j =10; i<10;i++,j--) {
//			System.out.println("i : "+i+","+"j : "+j);
//		}
		
		//for문의 활용2
//		int s = 1;
//		int i;
//		for(i=0;i<10;i++,s++) {
//			System.out.println("i : "+i+","+"s : "+s);
//		}
//	    
//		System.out.println(i); //i 는 포문 안에 있는 지역변수 이기 때문에 바깥에서 사용 불가능하다.
		                       // 하여, 사용하고 싶다면 포문 바깥쪽에 int i; 라고 선언을 해주면 불러올 수있다.
	
	    //do-while문
//	    
//		초기값
//		do {
//	    	실행문
//	    	증감식
//	    }while(조건식) {
//	    	
//	    }
	   
		//예제
//	    int i = 11;
//	    do {
//	    	System.out.println(i);
//	    	i++;
//	    }while(i<=10);  //11
	    
		//이중do-while문
//		do {
//			do {
//				
//			}while();
//		}while();
	
	    //개인문제
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)의 결과를 출력 /복습해라~~~~
		
//	    int num = 0;
//	    int total = 0;
//	    for(int i=1;i<=10;i++) {
//	    	num += i; // (0+1) (0+1+2) (0+1+2+3)......(0+1+2+3+...+10)
//	    	total += num;
//	    } 
//	    System.out.println(num);
//	    System.out.println(total);
	    
	    //반복문의 제어
	    //break , continue
		//조건문 안에서 사용한다.
		
		//예제
//		for(int i=1; i<=10; i++) {
//			if(i>5) {
//				break; //반복문의 조건에 충족될 시 실행 종료.
//			}
//			System.out.println(i);
//		}
		
		//break문 예제 (어려움)     //알려줘!!!!!!!!!!!!
//		int k = 1;
//		for(int i=0; i<5; i++) {
//		System.out.println("i = " + i);
//			for(int j=0; j<5; j++) {
//				System.out.println("k = "+ k++);
//				if(k %3 == 0) {
//					break;
//				}
//				//System.out.println("k = "+ k++);
//			}
//		}
//		i j k 
//		0 0 1
//		0 1 2
//		0 2 3 //break
//	    1 0 3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//continue문 예제
		//짝수 출력 하고 싶을 때,
//	    //int sum = 0;
//		for(int i =1; i<=10; i++) { //if 조건문에 따라 continue가 sysout.을 출력 하는지 안하는지가 거쳐진다.
//			if(i %2 == 1)           // 안거쳐진다면 증감식으로 이동, 거쳐지면 sysout.거치고 조건문으로 다시 이동.
//			{
//				continue;       //if 조건문이 홀수 일때, continue문 쓰면 짝수 출력된다.
//			}
//			//sum += i;
//			System.out.println(i);
//		}
		
		//12345 -> 1+2+3+4+5 ->15 문제
//		12345 % 10 -> 5	
//		12345 / 10 -> 1234
//		12345 % 10 -> 4
//		12345 / 10 -> 123
//		12345 % 10 -> 3
//		12345 / 10 -> 12
//		12345 % 10 -> 2
//		12345 / 10 -> 1
		
		//답
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("정수를 입력하세요.");
//	    int num = sc.nextInt();
//		
//	    int sum =0;
//	    while(num>0) {
//	    	sum += num % 10;
//	    	num/=10;   //num = num / 10
//	    }
//	    System.out.println(sum);
		
		//방정식 2x+4y=10의 모든해를 구하시오. 단, x와 y는정수이고 각각의 범위는 
		//0<=ㅌ<=10, 0<=y<=10이다.
		//실행결과
//		x=1,y=2
//		x=3,y=1		
//		x=5,y=0
//		for (int i =0; i<=10;i++) {
//			for(int j =0; j<=10;j++) {
//				if(((2*i)+(4*j)) == 10) {
//					System.out.println("x : "+ i + " ,"+"y : "+j);
//				}
			
		//중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서
				//(x, y)의 형태로 출력해보세요
				//단 x와 y는 10 이하의 자연수
//			for(int i=0;i<=10;i++) {
//				for(int j=0;j<=10;j++) {
//					if(4*i+5*j == 60) { //괄호 중복 될때 안써도돼 ? (4*i+5*j == 60)
//						System.out.println("x : "+i+" ,"+"y : "+j);
//					}
		
		//1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,몇까지 더해야 총합이 
		//100이상 되는지 출력하세요.
	    
		//혜림 풀이
//		int mo = 0;
//		int po = 0;
//		for(int i=1;i<=100;i++) {
//			if(i %2 == 0) {
//				mo += i;
//				po -= i;
//			}else if(i<=100) {
//				break; 
//			}
//			System.out.println(mo+po);
//		}
		
		//답
//		int sum = 0;
//		int i;
//		for(i = 1;true;i++) {   //언제까지 더해질지 모르기 때문에 true사용.
//			sum += i;
//			if(sum >= 100) {
//				break;
//			}
//		}
//			System.out.println(sum +"," +i); //105,14
		
		//또 다른 답
//		int sum = 0;
//		int s = 1;
//		int num = 0;
//		int i;
//		for(i = 1;true;i++,s=-s) {   //언제까지 더해질지 모르기 때문에 true사용.
//			num = s * i;
//			sum += num;
//			if(sum >= 100) {
//				break;
//			}
//		}
//		System.out.println(sum +"," +i);	//100,199
		
		
		//break문 예제
//		Scanner sc = new Scanner(System.in);
//		
//		int sel;
//		
//		while(true) {
//			System.out.println("번호를 선택 하세요.");
//            System.out.println("1.빨간색 2.녹색 3.파란색 4.종료");		
//            sel = sc.nextInt();
//            
//            if(sel == 1) {
//            	System.out.println("빨간색 선택");
//            } else if(sel == 2) {
//            	System.out.println("녹색 선택");
//            } else if(sel == 3) {
//            	System.out.println("파란색 선택");
//            } else if(sel == 4) {
//            	break;
//            }
//		}
		
		//난수 (알수없는 값 , 랜덤)
//		Math.random(); //0.0 <= r < 1.0 -> 0.0 ~ 0.9999999
//		System.out.println(Math.random()); //출력값이 계속 달라진다. 0.~범위 안에서
	    
//		Math.random() * 10 //*뒤에 내가 사용할 갯수를 적어주면 된다. 0.0 \~ 9.999.........
//		(int)(Math.random() * 10)  //0 ~ 9
//		(int)(Math.random() * 10) + 1 //1 ~10
//		System.out.println((int)(Math.random() * 10) + 1);
			
	    //567~58940389
//		(int)(Math.random() * 난수의 개수(난수의 최대값 - 난수의 최솟값 + 1))+ 난수의 최솟값		
			
        //1~3 //체크!!!!!!!!!
//		int a = //(int)(Math.random() * 3) + 1;
//		System.out.println(a);
		
		//가위바위보 예제
//		int com;
//		int me;
//		
//		Scanner sc = new Scanner(System.in);
//		//혜림 방식
//		while(true) {
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.가위 2.바위 3.보 : ");
//			me = sc.nextInt();
//			
//			System.out.println("com : "+com+" , me : "+me);
//		if(me == 1) {
//			if(com == 1) {
//				System.out.println("무승부");
//			}else if(com == 2) {
//				System.out.println("패배");
//			}else {
//				System.out.println("승리");
//			}
//		}else if(me == 2) {
//			if(com == 1) {
//				System.out.println("승리");
//			}else if(com == 2) {
//				System.out.println("무승부");
//			}else {
//				System.out.println("패배");
//			}
//		}else if(me == 3) {
//			if(com == 1) {
//				System.out.println("패배");
//			}else if(com == 2) {
//				System.out.println("승리");
//			}else {
//				System.out.println("무승부");
//			}
//			
//		} 
		
		
		//효율적인 방식??....
//		int com;
//		int me;
//		int correctCnt = 0; //이긴 횟수 변수 선언
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.가위 2.바위 3.보 : ");
//			me = sc.nextInt();
//			
//			int result = com - me;
//		
//			 if(result == -1 || result == 2) {
//			 System.out.println("you win");
//			 correctCnt++; //이긴횟수 쌓이게
//			 System.out.println("이긴 횟수 : "+ correctCnt+"회"); // 이긴횟수 누적
//			 if(correctCnt == 3) { //만약 이긴 횟수가 3이면 
//				 break;            //브레이크
//			 }
//			 }else if(result == 0) {
//				 System.out.println("tie break");
//			 }else {
//				 System.out.println("you lose");
//			 }
//		}
		
		//도전횟수 3번 ||이긴횟수 1번 이면 게임 종료
//		int com; //컴퓨터
//		int me;  //나
//		int correctCnt = 0; //이긴 횟수
//		int challengeCnt = 0;  //전체 도전횟수
//		
//		Scanner sc = new Scanner(System.in);
//		
//	    while(true) {
//			challengeCnt++;
//		    if(challengeCnt == 4) { 
//			  System.out.println("3번의 도전 기회를 다 소진 하셨습니다.");
//			  break;
//		    }
//					
//		com = (int)(Math.random() * 3) + 1;
//		System.out.println("1.가위 2.바위 3.보 : ");
//	    me = sc.nextInt();
//					
//	    int result = com - me;
//				
//		if(result == -1 || result == 2) {
//		   System.out.println("you win");
//		   correctCnt++; //이긴횟수 쌓이게
//		   System.out.println("이긴 횟수 : "+ correctCnt+"회"); // 이긴횟수 누적
//		   if(correctCnt == 1) {
//			  break;	 
//		   }
//		 }else if(result == 0) {
//			System.out.println("tie break");
//		 }else {
//		    System.out.println("you lose");
//		  }
//	    }
	
	     //코드 작성할 때 규칙
//	     while() { //블록 구분 해야 쉽게 찾을 수 있음.
//	    	 if() {
//	    		 if() {
//	    			
//	    		 }
//	    	 }
//	     }
	}
}


		
		
					
		
	

		
		
		
		
		
		
		
		
		
		
		
	


