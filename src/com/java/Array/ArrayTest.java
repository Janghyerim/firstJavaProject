package com.java.Array;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 : 동일한 타입의 변수를 여러개 정의 하는 것.
		
//		int a,b,c,d,e; //비효율적인 코딩.
//		a=10;
//		b=20;
//		c=30;
//		d=40;
//		e=50;
//		System.out.println(a+b);

//		int[] arr; //배열의 선언
//		arr = new int[5]; //배열의 생성 [배열 갯수 입력]
		
//		int[]arr = new int[5]; //선언과 생성을 같이 한 공식
		
//		int[]arr = {10,20,30,40,50}; //선언과 생성과 값의 초기화까지 같이 한 공식, 바로 sys.out하면 뜸.
		
//		arr[0] = 10; //[0부터 시작되는 인덱스 번호 입력] / 0,1,2,3,4 -> indexNum
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		char[] cArr = new char[4]; //선언과 생성을 같이 한 공식
//		char[] cArr = {'G','O','O','D'}; //선언과 생성과 값의 초기화까지 같이 한 공식, 바로 sys.out하면 뜸.
//		cArr[0] = 'G';
//		cArr[1] = 'O';
//		cArr[2] = 'O';
//		cArr[3] = 'D';
//		System.out.println(cArr);
//		
//		String[] strArr = {"java","jsp","DB"};  //선언과 생성 같이 한 공식
//		System.out.println(strArr[1]);   //jsp
//		strArr[2] = "html";  //값의 변경이 적용된 예제 ->"java"->"html"
//		System.out.println(strArr[2]);   //html
		
		//배열의 대입
//		int x = 10;
//		int y;
//		
//		y = x;
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2;
//		
//		*arr2 = arr1; //배열변수는 주소값이다.*
//		
//		System.out.println(arr1[0]); //1
//		System.out.println(arr2[0]); //1
//		
//		arr2[3] = 10;
//		
//		System.out.println(arr1[3]); //10
//		System.out.println(arr2[3]); //10
		
//		배열의 활용
//		순차처리 (인덱스번호 앞에서부터 차례대로)
//		반복문 사용 (배열쓴다면 반복문을 쓴다고 알면된다.)
//		배열 사용시 반복문 초기값은 대게 0으로 시작한다.
		
//		int[] arr = new int[10];
//		
//		//쓰기 작업
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = 1; //인덱스가 반복되면 5번이 실행되는 동안 0,1,2,3,4에 각각 1이 대입된다.
//		}
//        		
//		//읽기 작업
//		for(int i=0;i<arr.length;i++) { //i<5대신, i<변수이름.length(배열의 크기)라고 써줘도 실행된다.
//			System.out.println(arr[i]);
//		}
		
		//예제 (1~10까지 출력한다면..)
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = i+1;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}  
//		int sum = 0;                      //+배열의 합 구하기
//		for(int i=0;i<arr.length;i++) {   
//			sum += arr[i];
//		}
//		System.out.println(sum);
//		
//		int k = 0;
//		int n = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] %2 == 1) {
//				k += arr[i];
//			}else {
//				n += arr[i];
//			}
//		}
//		System.out.print("홀수 : "+k);
//		System.out.println('\t');     //줄바꿈 기능
//		System.out.println("짝수 : "+n);
		
		
		//for each문
//		for(변수 : 배열변수명) {
//			실행문
//		}
//		예제
//		int[] arr = {1,2,3,4,5}; //선언 생성 초기화까지 같이 한 공식.
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		//향상된 for문
//		int sum = 0;
//		for(int i : arr) { 
//			sum += i;
//		}
		
		//문자열 예제
//		String[]str = {"사과","딸기","포도"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
		
		
		//난수 1~100사이의 값중에 10개를 배열값으로 초기화한다.
		//배열의 값을 출력한다.
		/**배열의 값에 난수 랜덤 변수를 선언해줘야함.
		 */ 
//		 int[]arr = new int[10];
//
//		 for(int i=0;i<arr.length;i++) { 
//			 int ran = (int)(Math.random() * 100)+1; //+1은 1부터 시작 하게끔 초기화 하는 것.
//		     arr[i] = ran;
//		 }
//		 for(int i=0;i<arr.length;i++) {
//			  System.out.println(arr[i]); 
//		} 
//		 System.out.println("==========");           //<---위 배열안에 가장 큰 숫자를 찾는 예제
//		 int max = arr[0];                           //임의로 현재 최대값을 인덱스0번째 설정
//		 int min = arr[0];                           //임의로 현재 최소값을 인덱스0번째 설정
//		 
//		 for(int i = 0;i<arr.length;i++) {
//			 if(max<arr[i]) {
//				 max = arr[i];
//			 } 
//			 if(min>arr[i]){
//				 min = arr[i];
//			 }
//		  } 
//		 System.out.println("max = " + max);
//		 System.out.println("min = " + min);
		/**
		int[]arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			int ran = (int)(Math.random()*100)+1;
			arr[i] = ran;
			}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=========");
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				
			}
		}
		*/
		
		//난수 이용하여 0~9까지의 정수값을 초기화 한다.
//		int[] arr = new int[10];
//		
//		for(int i = 0;i<arr.length;i++) {
//			int ran = (int)(Math.random()*10);     //난수 범위 대입
//			arr[i] = ran;                          //초기화 
//		}
//		for(int i = 0;i<arr.length;i++) {
//			System.out.print(arr[i]+",");          //츨력
//		}
//		
//		//int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;    //선언
//		int[] cntArr = new int[10]; //기본값으로 자동초기화된다.
//		
//		for(int i=0;i<arr.length;i++) {  //설명 필요!!
//		    cntArr[arr[i]]++;            //숫자별 갯수가 누적되어 자동 합산 된다. 하기보다 간결한 식임.
//			//for(int j=0;j<arr.length;j++) {
//				//if(arr[i] == j) {
//					//cntArr[j]++;
//				//}
//			//}
//		}
//		  System.out.println();
//		  for(int i =0;i<cntArr.length;i++) {
//			  System.out.println(i+"-"+cntArr[i]+"개");
//			  }
		
		//차례대로 등수 출력하기
		//60점은 7등입니다. ...
//		int[] score = {60,70,80,90,75,85,95,50,45,30};
//		int[] rank = {1,1,1,1,1,1,1,1,1,1};
//		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score.length; j++) {
//				if(score[i] < score[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		for(int i=0;i<rank.length;i++) {
//			System.out.println(score[i] + "점은 " + rank[i] + "등 입니다.");
//		}
//		         중첩for문 사용
////		score[0] < score[0]    rank[0] -> 1
////		score[0] < score[1]    rank[0] -> 2
////		score[0] < score[2]    rank[0] -> 3
////		score[0] < score[3]    rank[0] -> 4
////		score[0] < score[4]    rank[0] -> 5
////		score[0] < score[5]    rank[0] -> 6
////		score[0] < score[6]    rank[0] -> 7
////		score[0] < score[7]    rank[0] -> 7
////		score[0] < score[8]    rank[0] -> 7
////		score[0] < score[9]    rank[0] -> 7
////      전체 한번씩 사이클 돌리면 등수가 정리된다.	   
		
		
		//정렬 : 오름(1,2,3,4,5) , 내림(5,4,3,2,1)
//		int[] arr = {2,4,1,5,3};
//		//오름차순
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) { //최솟값부터 비교하기 위해 하나씩 더 뒤에거를 비교하므로 i+1이된다.
//				if(arr[i]>arr[j]) {           //부등호 방향만 변경 해주면 오름차순 내림차순 정렬 가능하다.
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+", ");
//		}
//		
//		//내림차순
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) { //최솟값부터 비교하기 위해 하나씩 더 뒤에거를 비교하므로 i+1이된다.
//				if(arr[i]<arr[j]) {           //부등호 방향만 변경 해주면 오름차순 내림차순 정렬 가능하다.
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+", ");
//		}
		
//		for(int i=0;i<arr.length*5;i++) { //arr.length*5 ->섞이는 횟수 25번 
//			int x = (int)(Math.random()*5);
//			int y = (int)(Math.random()*5);
//			
//			int tmp;                 //배열의 위치값을 교환해준다.
//			tmp = arr[x];
//			arr[x] = arr[y];
//			arr[y] = tmp;
//		}
//        for(int i=0; i<arr.length;i++) {
//        	System.out.print(arr[i]+", ");
//        }

//		=============================
/*		교환할때 쓰는 방식
		int tmp;                
		tmp = arr[1];
		arr[1] = arr[3];
		arr[3] = tmp;
		
		int x = 10;
		int y = 20;
		int tmp = 0;
		
		tmp = x;
		x = y;
		y = tmp;
*/
		//메달을 가장 많이 딴사람부터 이름과 메달수를 출력하라.
		//실행결과
		//김연아 메달10개 1등 
		//홍길동 메달3개 2등 
		//손흥민 메달2개 3등
		
//		String[] name = {"홍길동","손흥민","김연아"};
//		int[] medal = {3,2,10};
//		//10,3,2
//		for(int i=0;i<medal.length;i++) {       
//			for(int j=i+1;j<medal.length;j++) {        //최솟값부터 비교하기 위해 하나씩 더 뒤에거를 비교하므로 i+1이된다.
//				if(medal[i]<medal[j]) {                //내림차순ver./부등호 방향만 변경 해주면 오름차순 내림차순 정렬 가능하다.
//					int tmp;
//					tmp = medal[i];
//					medal[i] = medal[j];
//					medal[j] = tmp;
//			        
//					String nTmp;
//					nTmp = name[i];
//					name[i] = name[j];
//					name[j] = nTmp;
//			  }
//		   }
//		}
//		for(int i=0;i<medal.length;i++) {
//			System.out.println(name[i] + " 메달 " + medal[i] +"개 "+ (i+1) + "등 입니다.");       //(i+1) -> 메달 가장 많은순으로 정렬이 되어있고, 차례대로 i+1로 출력해준다.
//				}
			
//		*배열 - 1차원
//		    - 다차원(2차원 등등..일반적인 프로그램에서 3차원 이상으로 가진 않는다.)   ->정방형(열의크기가 동일한 경우),비정방형(열의크기가 다른 경우 = 잘 안씀)
		
//		int[][] score = new int[5][3];           //많이 쓰이는  선언이랑 생성 같이 하는 방식.
//       //int[][] score;                        //선언
//       //score = new int[5][3];  //[행][열]     //생성
		
//      score[0][0] = 1;
//      score[0][1] = 2;
//      score[0][2] = 3;
//
//      score[1][0] = 4;
//      score[1][1] = 5;
//      score[1][2] = 6;
//		
//      score[4][2] = 15;
		
		//1)
//		int[][] score = new int[5][3];     //많이 쓰이는  선언이랑 생성 같이 하는 방식.
//        score[0][0] = 1;                 //조건
//        score[0][1] = 2;
//        score[0][2] = 3;
//        score[1][0] = 4;
//        score[1][1] = 5;
//        score[1][2] = 6;
//		
//        score[4][2] = 15;
//		
//		System.out.println(score[0][0]);   //출력
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);
//		
//		System.out.println(score[4][2]);
		
		//2)
//		int[][] score = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15},
//		};
//	   
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);
//		
//		System.out.println(score[4][2]);
		
		
		//3)
//		int[][] score = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15},
//		};
//		//3-1
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(score[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		//3-2
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("======");
//		
//		//3-3 2차원배열
//        for(int[] i:score) {
//        	for(int j : i) {
//        		System.out.print(j+"  ");
//        	}
//        	System.out.println();
//        }
		
		//2차원배열 순차처리 예제
		
//		//int num = 1;
//		int[][] arr = new int [2][5];
//		
//		for(int i=0;i<arr.length;i++) { //0,1
//			for(int j=0;j<arr[i].length;j++) { //0,1,2,3,4
//				//arr[i][j] = num++;
//				arr[i][j] = (i*5) + j + 1;  //1,2,3,4,5,
//				                            //6,7,8,9,10
//			}
//		}
//		for(int[]i : arr) {
//			for(int j : i) {
//				System.out.print(j+"  ");
//			}
//			System.out.println();
//		}
		
		
		//1~15까지 출력해보기 개인문제
//		int num = 1;
//		int[][] arr = new int[5][3];
//		
//		for(int i=0;i<arr.length;i++) {
//		    for(int j=0;j<arr[i].length;j++) {
//		    	arr[i][j] = (i*3)+j+1;
//        	}
//        }
//		for(int[]i : arr) {
//			for(int j : i) {
//				System.out.print(j+"  ");
//			}
//			System.out.println();
//		}
		
		/**
		 * 
		 **
		 ***
		 ****
		 *****
		 */
	/**	char[][] star = new char[5][5];
		
		for(int i=0;i<star.length;i++) {
			for(int j=0;j<star.length;j++) {
				
			}
		}
		
		*/
		
		
		
//		char[][] star = new char [5][5];
//		
//		for(int i=0; i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i>=j) {
//					star[i][j] = '*';
//				}
//			}
//		}
//		
//		for(char[]i : star) {
//			for(char j : i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		/**
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
//		char[][] star = new char[5][5];
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i+j<=4) {   //더한값이 4보다 작거나 같아야함.
//					star[i][j] = '*';
//				}
//			}
//		}
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		/**
		  * 
		 **
		***
	   ****
	  *****
		 */ //혼자 완성함*****
//		char[][] star = new char[5][5];
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i+j>=4) {
//					star[i][j] = '*';
//				}
//			}
//		}
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		/**   1,3,5,7,9
		 * 
		***
	   *****  
	  *******
	 *********
		 */
		//내 방법
//	   char[][] star = new char[5][9];
//	   
//	   for(int i=0;i<star.length;i++) {
//		   for(int j=0;j<star[i].length;j++) {
//			   if(i+j>=4 && j-i<=4) {
//				   star[i][j] ='*';
//			   }
//		   }
//	   }
//	   for(char[] i : star) {
//		   for(char j : i) {
//			   System.out.print(j+" ");
//		   }
//		   System.out.println();
//	   }
		
	   //응용ver.
//	   Scanner sc = new Scanner(System.in);
//	   System.out.print("행의 크기를 입력하시오 : ");
//	   int row = sc.nextInt();  //행의 스캐너 입력 선언
//	   int col = row * 2 - 1; //열의 공식
//	   
//	   //또 다른 방법
//	   char[][] star = new char[row][col];
//	   
//	   for(int i=0;i<star.length;i++) {
//		   int starCnt =2*i+1;   //1,3,5,7,9  //별의갯수
//		   int starStart = star.length-(i+1);  // 4,3,2,1,0  //별의 위치를 넣기위한 시작점
//		   for(int j=starStart;j<starStart+starCnt;j++) {
//			   star[i][j]='*';
//		   }
//	   }
//	   for(char[] i : star) {
//		   for(char j :i) {
//			   System.out.print(j+" ");
//		   }
//		   System.out.println();
//	   }
		
		//2차원배열 행열예제
//		char[][] star = {  //4행5열
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'},
//		};
//		
//		for(int i=0;i<star.length;i++) { //행의 크기
//			for(int j=0;j<star[i].length;j++) { //열의크기
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
//		
//		//5행4열	
//		char[][] result = new char[star[0].length][star.length];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				int x = j;
//				int y = 3-i;
//				result[x][y] = star[i][j];
//			}
//		}
//		System.out.println();
//		System.out.println();
//		
//		for(char[]i : result) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		//2차원배열 사용하여 합과 평균 구하기 예제
//		int[][] score = {
//				{10,10,10},
//				{20,20,20},
//				{30,30,30},
//				{40,40,40},
//				{50,50,50},
//		};
//		
//		System.out.println("번호    국어     영어      수학     총점     평균");
//		int sum;
//		int korTot =0;
//		int engTot =0;
//		int mathTot =0;
//		for(int i=0;i<score.length;i++) {
//			
//			korTot += score[i][0];  //행이바뀌면 열의 숫자를 넣어 확인한다.
//			engTot += score[i][1];
//			mathTot += score[i][2];
//			sum = 0;
//			System.out.print(" "+(i + 1) + " ");
//			
//			for(int j=0;j<score[i].length;j++) {
//				sum += score[i][j];
//				System.out.print("  "+score[i][j]+" ");
//			}
//			System.out.print("  "+sum);  //총합 구하기
//			double avg = sum / (double)score[i].length; //평균값 소수점 구하기 (더블 타입 사용)
//			System.out.print("  "+avg);
//			System.out.println();
//		}
//		int totScore = korTot + engTot + mathTot;
//		System.out.println("합계 "+"  "+korTot+"  "+engTot+"  "+mathTot+"   "+totScore);
		
//		실행결과
//		
//	       번호  국어  영어   수학   총점    평균
//		1  10  10  10  30  10.0
//		2  20  20  20  60  20.0
//		3  30  30  30  90  30.0
//		4  40  40  40  120 40.0
//		5  50  50  50  150 50.0
// 	      합계  150 150 150  450
		
		/**
		score.length : 행의크기(세로방향)
		score[0].length : 첫번째 행의 열의크기 (가로방향)  -> 숫자가 바뀌어도 (행이 바뀌어도) 열은 바뀌지 않는다.
		*/
		
		
		//빙고게임 만들기   (연습 많이 해야함)
//		//1.25개의 값을 구성하는 2차원 배열 생성
//		int[][] bingo = new int [5][5];
//		
//		//2.배열의 1~50 난수를 초기화 하라.
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				bingo[i][j] = (int)(Math.random()*50)+1;
//			}
//		}
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				System.out.print(bingo[i][j]+" ");
//			}
//			System.out.println();
//		}
//		//값을 입력하고 배열의 같은 값이 있으면 0으로 변경한다.
//		Scanner sc = new Scanner(System.in);
//		boolean flag = true;
//		int num = 0;
//		//
//		int sum = 0;  //합의 변수 선언
//		while(flag) {  //계속 실행 되니 값이 0이 됐을 때 종료 시켜야함.
//			System.out.println("숫자입력 : ");
//			num = sc.nextInt();
//			
//			//배열의 모든값이 0으로 변경되면 전체 반복문 종료
//			sum = 0;  //위에 선언을 했지만 한번 더 0으로 선언한다.
//			
//			for(int i=0;i<bingo.length;i++) {
//				for(int j=0;j<bingo[i].length;j++) {
//					if(bingo[i][j] == num) {
//						bingo[i][j] = 0;
//					}
//					//
//					sum += bingo[i][j];
//					System.out.print(bingo[i][j]+" ");
//					}
//				System.out.println();
//			}
//			//
//			System.out.println("sum = "+sum);  //0이 됐는지 한번더 확인 위해 써주는게 좋다.
//			if(sum==0) {
//				flag = false;
//			}
//		}
//		//
//		System.out.println("Game Over");
//		//기본 소스 끝==========================
	  
		
		
	    

		
	}
}
		
		
	



		
		   
	    
        
        

	


