package com.java.Array;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// �迭 : ������ Ÿ���� ������ ������ ���� �ϴ� ��.
		
//		int a,b,c,d,e; //��ȿ������ �ڵ�.
//		a=10;
//		b=20;
//		c=30;
//		d=40;
//		e=50;
//		System.out.println(a+b);

//		int[] arr; //�迭�� ����
//		arr = new int[5]; //�迭�� ���� [�迭 ���� �Է�]
		
//		int[]arr = new int[5]; //����� ������ ���� �� ����
		
//		int[]arr = {10,20,30,40,50}; //����� ������ ���� �ʱ�ȭ���� ���� �� ����, �ٷ� sys.out�ϸ� ��.
		
//		arr[0] = 10; //[0���� ���۵Ǵ� �ε��� ��ȣ �Է�] / 0,1,2,3,4 -> indexNum
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		char[] cArr = new char[4]; //����� ������ ���� �� ����
//		char[] cArr = {'G','O','O','D'}; //����� ������ ���� �ʱ�ȭ���� ���� �� ����, �ٷ� sys.out�ϸ� ��.
//		cArr[0] = 'G';
//		cArr[1] = 'O';
//		cArr[2] = 'O';
//		cArr[3] = 'D';
//		System.out.println(cArr);
//		
//		String[] strArr = {"java","jsp","DB"};  //����� ���� ���� �� ����
//		System.out.println(strArr[1]);   //jsp
//		strArr[2] = "html";  //���� ������ ����� ���� ->"java"->"html"
//		System.out.println(strArr[2]);   //html
		
		//�迭�� ����
//		int x = 10;
//		int y;
//		
//		y = x;
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2;
//		
//		*arr2 = arr1; //�迭������ �ּҰ��̴�.*
//		
//		System.out.println(arr1[0]); //1
//		System.out.println(arr2[0]); //1
//		
//		arr2[3] = 10;
//		
//		System.out.println(arr1[3]); //10
//		System.out.println(arr2[3]); //10
		
//		�迭�� Ȱ��
//		����ó�� (�ε�����ȣ �տ������� ���ʴ��)
//		�ݺ��� ��� (�迭���ٸ� �ݺ����� ���ٰ� �˸�ȴ�.)
//		�迭 ���� �ݺ��� �ʱⰪ�� ��� 0���� �����Ѵ�.
		
//		int[] arr = new int[10];
//		
//		//���� �۾�
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = 1; //�ε����� �ݺ��Ǹ� 5���� ����Ǵ� ���� 0,1,2,3,4�� ���� 1�� ���Եȴ�.
//		}
//        		
//		//�б� �۾�
//		for(int i=0;i<arr.length;i++) { //i<5���, i<�����̸�.length(�迭�� ũ��)��� ���൵ ����ȴ�.
//			System.out.println(arr[i]);
//		}
		
		//���� (1~10���� ����Ѵٸ�..)
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = i+1;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}  
//		int sum = 0;                      //+�迭�� �� ���ϱ�
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
//		System.out.print("Ȧ�� : "+k);
//		System.out.println('\t');     //�ٹٲ� ���
//		System.out.println("¦�� : "+n);
		
		
		//for each��
//		for(���� : �迭������) {
//			���๮
//		}
//		����
//		int[] arr = {1,2,3,4,5}; //���� ���� �ʱ�ȭ���� ���� �� ����.
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		//���� for��
//		int sum = 0;
//		for(int i : arr) { 
//			sum += i;
//		}
		
		//���ڿ� ����
//		String[]str = {"���","����","����"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
		
		
		//���� 1~100������ ���߿� 10���� �迭������ �ʱ�ȭ�Ѵ�.
		//�迭�� ���� ����Ѵ�.
		/**�迭�� ���� ���� ���� ������ �����������.
		 */ 
//		 int[]arr = new int[10];
//
//		 for(int i=0;i<arr.length;i++) { 
//			 int ran = (int)(Math.random() * 100)+1; //+1�� 1���� ���� �ϰԲ� �ʱ�ȭ �ϴ� ��.
//		     arr[i] = ran;
//		 }
//		 for(int i=0;i<arr.length;i++) {
//			  System.out.println(arr[i]); 
//		} 
//		 System.out.println("==========");           //<---�� �迭�ȿ� ���� ū ���ڸ� ã�� ����
//		 int max = arr[0];                           //���Ƿ� ���� �ִ밪�� �ε���0��° ����
//		 int min = arr[0];                           //���Ƿ� ���� �ּҰ��� �ε���0��° ����
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
		
		//���� �̿��Ͽ� 0~9������ �������� �ʱ�ȭ �Ѵ�.
//		int[] arr = new int[10];
//		
//		for(int i = 0;i<arr.length;i++) {
//			int ran = (int)(Math.random()*10);     //���� ���� ����
//			arr[i] = ran;                          //�ʱ�ȭ 
//		}
//		for(int i = 0;i<arr.length;i++) {
//			System.out.print(arr[i]+",");          //����
//		}
//		
//		//int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;    //����
//		int[] cntArr = new int[10]; //�⺻������ �ڵ��ʱ�ȭ�ȴ�.
//		
//		for(int i=0;i<arr.length;i++) {  //���� �ʿ�!!
//		    cntArr[arr[i]]++;            //���ں� ������ �����Ǿ� �ڵ� �ջ� �ȴ�. �ϱ⺸�� ������ ����.
//			//for(int j=0;j<arr.length;j++) {
//				//if(arr[i] == j) {
//					//cntArr[j]++;
//				//}
//			//}
//		}
//		  System.out.println();
//		  for(int i =0;i<cntArr.length;i++) {
//			  System.out.println(i+"-"+cntArr[i]+"��");
//			  }
		
		//���ʴ�� ��� ����ϱ�
		//60���� 7���Դϴ�. ...
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
//			System.out.println(score[i] + "���� " + rank[i] + "�� �Դϴ�.");
//		}
//		         ��øfor�� ���
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
////      ��ü �ѹ��� ����Ŭ ������ ����� �����ȴ�.	   
		
		
		//���� : ����(1,2,3,4,5) , ����(5,4,3,2,1)
//		int[] arr = {2,4,1,5,3};
//		//��������
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) { //�ּڰ����� ���ϱ� ���� �ϳ��� �� �ڿ��Ÿ� ���ϹǷ� i+1�̵ȴ�.
//				if(arr[i]>arr[j]) {           //�ε�ȣ ���⸸ ���� ���ָ� �������� �������� ���� �����ϴ�.
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
//		//��������
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) { //�ּڰ����� ���ϱ� ���� �ϳ��� �� �ڿ��Ÿ� ���ϹǷ� i+1�̵ȴ�.
//				if(arr[i]<arr[j]) {           //�ε�ȣ ���⸸ ���� ���ָ� �������� �������� ���� �����ϴ�.
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
		
//		for(int i=0;i<arr.length*5;i++) { //arr.length*5 ->���̴� Ƚ�� 25�� 
//			int x = (int)(Math.random()*5);
//			int y = (int)(Math.random()*5);
//			
//			int tmp;                 //�迭�� ��ġ���� ��ȯ���ش�.
//			tmp = arr[x];
//			arr[x] = arr[y];
//			arr[y] = tmp;
//		}
//        for(int i=0; i<arr.length;i++) {
//        	System.out.print(arr[i]+", ");
//        }

//		=============================
/*		��ȯ�Ҷ� ���� ���
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
		//�޴��� ���� ���� ��������� �̸��� �޴޼��� ����϶�.
		//������
		//�迬�� �޴�10�� 1�� 
		//ȫ�浿 �޴�3�� 2�� 
		//����� �޴�2�� 3��
		
//		String[] name = {"ȫ�浿","�����","�迬��"};
//		int[] medal = {3,2,10};
//		//10,3,2
//		for(int i=0;i<medal.length;i++) {       
//			for(int j=i+1;j<medal.length;j++) {        //�ּڰ����� ���ϱ� ���� �ϳ��� �� �ڿ��Ÿ� ���ϹǷ� i+1�̵ȴ�.
//				if(medal[i]<medal[j]) {                //��������ver./�ε�ȣ ���⸸ ���� ���ָ� �������� �������� ���� �����ϴ�.
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
//			System.out.println(name[i] + " �޴� " + medal[i] +"�� "+ (i+1) + "�� �Դϴ�.");       //(i+1) -> �޴� ���� ���������� ������ �Ǿ��ְ�, ���ʴ�� i+1�� ������ش�.
//				}
			
//		*�迭 - 1����
//		    - ������(2���� ���..�Ϲ����� ���α׷����� 3���� �̻����� ���� �ʴ´�.)   ->������(����ũ�Ⱑ ������ ���),��������(����ũ�Ⱑ �ٸ� ��� = �� �Ⱦ�)
		
//		int[][] score = new int[5][3];           //���� ���̴�  �����̶� ���� ���� �ϴ� ���.
//       //int[][] score;                        //����
//       //score = new int[5][3];  //[��][��]     //����
		
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
//		int[][] score = new int[5][3];     //���� ���̴�  �����̶� ���� ���� �ϴ� ���.
//        score[0][0] = 1;                 //����
//        score[0][1] = 2;
//        score[0][2] = 3;
//        score[1][0] = 4;
//        score[1][1] = 5;
//        score[1][2] = 6;
//		
//        score[4][2] = 15;
//		
//		System.out.println(score[0][0]);   //���
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
//		//3-3 2�����迭
//        for(int[] i:score) {
//        	for(int j : i) {
//        		System.out.print(j+"  ");
//        	}
//        	System.out.println();
//        }
		
		//2�����迭 ����ó�� ����
		
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
		
		
		//1~15���� ����غ��� ���ι���
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
//				if(i+j<=4) {   //���Ѱ��� 4���� �۰ų� ���ƾ���.
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
		 */ //ȥ�� �ϼ���*****
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
		//�� ���
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
		
	   //����ver.
//	   Scanner sc = new Scanner(System.in);
//	   System.out.print("���� ũ�⸦ �Է��Ͻÿ� : ");
//	   int row = sc.nextInt();  //���� ��ĳ�� �Է� ����
//	   int col = row * 2 - 1; //���� ����
//	   
//	   //�� �ٸ� ���
//	   char[][] star = new char[row][col];
//	   
//	   for(int i=0;i<star.length;i++) {
//		   int starCnt =2*i+1;   //1,3,5,7,9  //���ǰ���
//		   int starStart = star.length-(i+1);  // 4,3,2,1,0  //���� ��ġ�� �ֱ����� ������
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
		
		//2�����迭 �࿭����
//		char[][] star = {  //4��5��
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'},
//		};
//		
//		for(int i=0;i<star.length;i++) { //���� ũ��
//			for(int j=0;j<star[i].length;j++) { //����ũ��
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
//		
//		//5��4��	
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
		
//		//2�����迭 ����Ͽ� �հ� ��� ���ϱ� ����
//		int[][] score = {
//				{10,10,10},
//				{20,20,20},
//				{30,30,30},
//				{40,40,40},
//				{50,50,50},
//		};
//		
//		System.out.println("��ȣ    ����     ����      ����     ����     ���");
//		int sum;
//		int korTot =0;
//		int engTot =0;
//		int mathTot =0;
//		for(int i=0;i<score.length;i++) {
//			
//			korTot += score[i][0];  //���̹ٲ�� ���� ���ڸ� �־� Ȯ���Ѵ�.
//			engTot += score[i][1];
//			mathTot += score[i][2];
//			sum = 0;
//			System.out.print(" "+(i + 1) + " ");
//			
//			for(int j=0;j<score[i].length;j++) {
//				sum += score[i][j];
//				System.out.print("  "+score[i][j]+" ");
//			}
//			System.out.print("  "+sum);  //���� ���ϱ�
//			double avg = sum / (double)score[i].length; //��հ� �Ҽ��� ���ϱ� (���� Ÿ�� ���)
//			System.out.print("  "+avg);
//			System.out.println();
//		}
//		int totScore = korTot + engTot + mathTot;
//		System.out.println("�հ� "+"  "+korTot+"  "+engTot+"  "+mathTot+"   "+totScore);
		
//		������
//		
//	       ��ȣ  ����  ����   ����   ����    ���
//		1  10  10  10  30  10.0
//		2  20  20  20  60  20.0
//		3  30  30  30  90  30.0
//		4  40  40  40  120 40.0
//		5  50  50  50  150 50.0
// 	      �հ�  150 150 150  450
		
		/**
		score.length : ����ũ��(���ι���)
		score[0].length : ù��° ���� ����ũ�� (���ι���)  -> ���ڰ� �ٲ� (���� �ٲ�) ���� �ٲ��� �ʴ´�.
		*/
		
		
		//������� �����   (���� ���� �ؾ���)
//		//1.25���� ���� �����ϴ� 2���� �迭 ����
//		int[][] bingo = new int [5][5];
//		
//		//2.�迭�� 1~50 ������ �ʱ�ȭ �϶�.
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
//		//���� �Է��ϰ� �迭�� ���� ���� ������ 0���� �����Ѵ�.
//		Scanner sc = new Scanner(System.in);
//		boolean flag = true;
//		int num = 0;
//		//
//		int sum = 0;  //���� ���� ����
//		while(flag) {  //��� ���� �Ǵ� ���� 0�� ���� �� ���� ���Ѿ���.
//			System.out.println("�����Է� : ");
//			num = sc.nextInt();
//			
//			//�迭�� ��簪�� 0���� ����Ǹ� ��ü �ݺ��� ����
//			sum = 0;  //���� ������ ������ �ѹ� �� 0���� �����Ѵ�.
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
//			System.out.println("sum = "+sum);  //0�� �ƴ��� �ѹ��� Ȯ�� ���� ���ִ°� ����.
//			if(sum==0) {
//				flag = false;
//			}
//		}
//		//
//		System.out.println("Game Over");
//		//�⺻ �ҽ� ��==========================
	  
		
		
	    

		
	}
}
		
		
	



		
		   
	    
        
        

	


