import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//�ݺ��� : ���๮�� ������ ȿ�������� ������ �� �ֵ��� �����ش�. 
		//for, while, do-while(���� �� �Ⱦ�)
	    
//      for(�ʱⰪ;���ǽ�;������) {
//        	���๮
//      }                        
//		//�����ı⺻����                                  // 0,1,2,3,4,5,6,7,8,9
//		for(int i=0; i<10; i++) { //i++�� ����� �� ����, �ٽ� �ʱⰪ���� ���� 0�̵ǹǷ�, ���ǽ����� �Ѿ�� �ݺ��ȴ�.
//			System.out.println(i + " : Hello");
//		}
		//���������뿹��	
//		for(int i=0;i<10;i+=2) { //0,2,4,6,8
//			System.out.println(i + " : hello");
//		}
		//���̳ʽ���������
//		for(int i=10;i>0;i--) { //10,9,8,7,6,5,4,3,2,1
//			System.out.println(i + " : hello");
//		}
		//���ѹݺ���
//		for(;true;) { 
//			System.out.println("hello");
//		}
		
//		int k = 1;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(k++);
//		}
		
		//1-10���� ������ �߿� ¦���� ��� (���ι���)
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

		
		// 1-10������ �����߿� Ȧ���� �հ� ¦���� ���� ���� ���ؼ� ���.
//		int sum = 0;//Ȧ��
//		int own = 0;//¦��
//		
//		for (int i = 1;i<=10;i++) {
//			if(i %2 == 1) {
//		      sum += i;
//			}else {
//			  own += i;
//			}
//		}
//		System.out.println("Ȧ��" + sum);
//		System.out.println("¦��" + own);
//		    }
	    
	    
//		for���� while�� ����
//		for(�ʱⰪ;���ǽ�;������) {
//        	���๮
//		}
//		
//		1.�ʱⰪ
//		2.while(���ǽ�) {
//		3.	    ���๮
//		4.	    ������	
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
	
		//while������ ���� �� ���ϱ�
//		int sum = 0;
//		int i = 1;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//      System.out.println(sum);	
	
		//while������ ���� �ݺ��ϱ�
//		while(true) {
//			System.out.println("hello");
//		}
	
		//booleanŸ���� while���� ���ѹݺ�
//	    boolean flag = true;
//	    int cnt = 0;
//	    while(flag) { //flag = true �̴ϱ� ���ѹݺ�
//	                  //������ ���� ������ ���� �ʾ� �Ʒ��� if���� �־��ְ� ���ǳ־��ָ� �����.
//	    	cnt++;
//	    	System.out.println(cnt);
//	    	
//	    	if(cnt>200) {
//	    		flag = false;
//	    	}
//	}
        
		//��øfor��
//	    for() {//n = 5   n*m , 5*5=25
//	    	for() { //m = 5
//	    		���๮ (25�� �ݺ��ȴ�.)
//	    	}
//	    }
	    
		//����
//	    int k = 1;	
//	    for(int i = 0; i<5;i++) {
//	    	for(int j = 0;j<5;j++) {
//	    		System.out.println(k++);
//	    	}
//	    }
	
	    //��������� p.123 
		//for���� �������
//		for(int i=0; i<10;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.println(i+"x"+j+"="+i*j);
//		        System.out.println('\t');	//* '\t' : �ϳ��� ������ ���� ���
//			}
//			System.out.println("===");
//		}
		
		//for���� �������
//		for(int i =0;i<=9;i++) {
//			for(int j =0;j<=9;j++) {
//				System.out.print(j+"x"+i+"="+j*i+"");
//				System.out.print('\t');
//			}
//	        System.out.println();	
//		}
		
		//��øwhile��
//		�ʱⰪ1
//	    while(���ǽ�) {
//	    	�ʱⰪ2
//	    	while(���ǽ�){
//	    		���๮
//	    		������2
//	    	}
//	    	������1
//	    }
		
        //����while��
//	    int k = 1;
//	    int i = 0;
//	    while(i<5) {
//	    	int j = 0;
//	    	while(j<5) {
//	    		System.out.println(k++);
//	    		j++; //�ݺ� �Ǿ� �ϴ� ���๮ ���� �������� ���ش�.
//	    	}
//	    	i++;
//	    }  
		
		//while���� ������� 
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
		//while���� �������
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
		
		//for���� Ȱ��
//		for(int i =0,j =10; i<10;i++,j--) {
//			System.out.println("i : "+i+","+"j : "+j);
//		}
		
		//for���� Ȱ��2
//		int s = 1;
//		int i;
//		for(i=0;i<10;i++,s++) {
//			System.out.println("i : "+i+","+"s : "+s);
//		}
//	    
//		System.out.println(i); //i �� ���� �ȿ� �ִ� �������� �̱� ������ �ٱ����� ��� �Ұ����ϴ�.
		                       // �Ͽ�, ����ϰ� �ʹٸ� ���� �ٱ��ʿ� int i; ��� ������ ���ָ� �ҷ��� ���ִ�.
	
	    //do-while��
//	    
//		�ʱⰪ
//		do {
//	    	���๮
//	    	������
//	    }while(���ǽ�) {
//	    	
//	    }
	   
		//����
//	    int i = 11;
//	    do {
//	    	System.out.println(i);
//	    	i++;
//	    }while(i<=10);  //11
	    
		//����do-while��
//		do {
//			do {
//				
//			}while();
//		}while();
	
	    //���ι���
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)�� ����� ��� /�����ض�~~~~
		
//	    int num = 0;
//	    int total = 0;
//	    for(int i=1;i<=10;i++) {
//	    	num += i; // (0+1) (0+1+2) (0+1+2+3)......(0+1+2+3+...+10)
//	    	total += num;
//	    } 
//	    System.out.println(num);
//	    System.out.println(total);
	    
	    //�ݺ����� ����
	    //break , continue
		//���ǹ� �ȿ��� ����Ѵ�.
		
		//����
//		for(int i=1; i<=10; i++) {
//			if(i>5) {
//				break; //�ݺ����� ���ǿ� ������ �� ���� ����.
//			}
//			System.out.println(i);
//		}
		
		//break�� ���� (�����)     //�˷���!!!!!!!!!!!!
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//continue�� ����
		//¦�� ��� �ϰ� ���� ��,
//	    //int sum = 0;
//		for(int i =1; i<=10; i++) { //if ���ǹ��� ���� continue�� sysout.�� ��� �ϴ��� ���ϴ����� ��������.
//			if(i %2 == 1)           // �Ȱ������ٸ� ���������� �̵�, �������� sysout.��ġ�� ���ǹ����� �ٽ� �̵�.
//			{
//				continue;       //if ���ǹ��� Ȧ�� �϶�, continue�� ���� ¦�� ��µȴ�.
//			}
//			//sum += i;
//			System.out.println(i);
//		}
		
		//12345 -> 1+2+3+4+5 ->15 ����
//		12345 % 10 -> 5	
//		12345 / 10 -> 1234
//		12345 % 10 -> 4
//		12345 / 10 -> 123
//		12345 % 10 -> 3
//		12345 / 10 -> 12
//		12345 % 10 -> 2
//		12345 / 10 -> 1
		
		//��
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("������ �Է��ϼ���.");
//	    int num = sc.nextInt();
//		
//	    int sum =0;
//	    while(num>0) {
//	    	sum += num % 10;
//	    	num/=10;   //num = num / 10
//	    }
//	    System.out.println(sum);
		
		//������ 2x+4y=10�� ����ظ� ���Ͻÿ�. ��, x�� y�������̰� ������ ������ 
		//0<=��<=10, 0<=y<=10�̴�.
		//������
//		x=1,y=2
//		x=3,y=1		
//		x=5,y=0
//		for (int i =0; i<=10;i++) {
//			for(int j =0; j<=10;j++) {
//				if(((2*i)+(4*j)) == 10) {
//					System.out.println("x : "+ i + " ,"+"y : "+j);
//				}
			
		//��ø for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ�
				//(x, y)�� ���·� ����غ�����
				//�� x�� y�� 10 ������ �ڿ���
//			for(int i=0;i<=10;i++) {
//				for(int j=0;j<=10;j++) {
//					if(4*i+5*j == 60) { //��ȣ �ߺ� �ɶ� �Ƚᵵ�� ? (4*i+5*j == 60)
//						System.out.println("x : "+i+" ,"+"y : "+j);
//					}
		
		//1+(-2)+3+(-4)+...�� ���� ������ ��� ���س����� ��,����� ���ؾ� ������ 
		//100�̻� �Ǵ��� ����ϼ���.
	    
		//���� Ǯ��
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
		
		//��
//		int sum = 0;
//		int i;
//		for(i = 1;true;i++) {   //�������� �������� �𸣱� ������ true���.
//			sum += i;
//			if(sum >= 100) {
//				break;
//			}
//		}
//			System.out.println(sum +"," +i); //105,14
		
		//�� �ٸ� ��
//		int sum = 0;
//		int s = 1;
//		int num = 0;
//		int i;
//		for(i = 1;true;i++,s=-s) {   //�������� �������� �𸣱� ������ true���.
//			num = s * i;
//			sum += num;
//			if(sum >= 100) {
//				break;
//			}
//		}
//		System.out.println(sum +"," +i);	//100,199
		
		
		//break�� ����
//		Scanner sc = new Scanner(System.in);
//		
//		int sel;
//		
//		while(true) {
//			System.out.println("��ȣ�� ���� �ϼ���.");
//            System.out.println("1.������ 2.��� 3.�Ķ��� 4.����");		
//            sel = sc.nextInt();
//            
//            if(sel == 1) {
//            	System.out.println("������ ����");
//            } else if(sel == 2) {
//            	System.out.println("��� ����");
//            } else if(sel == 3) {
//            	System.out.println("�Ķ��� ����");
//            } else if(sel == 4) {
//            	break;
//            }
//		}
		
		//���� (�˼����� �� , ����)
//		Math.random(); //0.0 <= r < 1.0 -> 0.0 ~ 0.9999999
//		System.out.println(Math.random()); //��°��� ��� �޶�����. 0.~���� �ȿ���
	    
//		Math.random() * 10 //*�ڿ� ���� ����� ������ �����ָ� �ȴ�. 0.0 \~ 9.999.........
//		(int)(Math.random() * 10)  //0 ~ 9
//		(int)(Math.random() * 10) + 1 //1 ~10
//		System.out.println((int)(Math.random() * 10) + 1);
			
	    //567~58940389
//		(int)(Math.random() * ������ ����(������ �ִ밪 - ������ �ּڰ� + 1))+ ������ �ּڰ�		
			
        //1~3 //üũ!!!!!!!!!
//		int a = //(int)(Math.random() * 3) + 1;
//		System.out.println(a);
		
		//���������� ����
//		int com;
//		int me;
//		
//		Scanner sc = new Scanner(System.in);
//		//���� ���
//		while(true) {
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.���� 2.���� 3.�� : ");
//			me = sc.nextInt();
//			
//			System.out.println("com : "+com+" , me : "+me);
//		if(me == 1) {
//			if(com == 1) {
//				System.out.println("���º�");
//			}else if(com == 2) {
//				System.out.println("�й�");
//			}else {
//				System.out.println("�¸�");
//			}
//		}else if(me == 2) {
//			if(com == 1) {
//				System.out.println("�¸�");
//			}else if(com == 2) {
//				System.out.println("���º�");
//			}else {
//				System.out.println("�й�");
//			}
//		}else if(me == 3) {
//			if(com == 1) {
//				System.out.println("�й�");
//			}else if(com == 2) {
//				System.out.println("�¸�");
//			}else {
//				System.out.println("���º�");
//			}
//			
//		} 
		
		
		//ȿ������ ���??....
//		int com;
//		int me;
//		int correctCnt = 0; //�̱� Ƚ�� ���� ����
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.���� 2.���� 3.�� : ");
//			me = sc.nextInt();
//			
//			int result = com - me;
//		
//			 if(result == -1 || result == 2) {
//			 System.out.println("you win");
//			 correctCnt++; //�̱�Ƚ�� ���̰�
//			 System.out.println("�̱� Ƚ�� : "+ correctCnt+"ȸ"); // �̱�Ƚ�� ����
//			 if(correctCnt == 3) { //���� �̱� Ƚ���� 3�̸� 
//				 break;            //�극��ũ
//			 }
//			 }else if(result == 0) {
//				 System.out.println("tie break");
//			 }else {
//				 System.out.println("you lose");
//			 }
//		}
		
		//����Ƚ�� 3�� ||�̱�Ƚ�� 1�� �̸� ���� ����
//		int com; //��ǻ��
//		int me;  //��
//		int correctCnt = 0; //�̱� Ƚ��
//		int challengeCnt = 0;  //��ü ����Ƚ��
//		
//		Scanner sc = new Scanner(System.in);
//		
//	    while(true) {
//			challengeCnt++;
//		    if(challengeCnt == 4) { 
//			  System.out.println("3���� ���� ��ȸ�� �� ���� �ϼ̽��ϴ�.");
//			  break;
//		    }
//					
//		com = (int)(Math.random() * 3) + 1;
//		System.out.println("1.���� 2.���� 3.�� : ");
//	    me = sc.nextInt();
//					
//	    int result = com - me;
//				
//		if(result == -1 || result == 2) {
//		   System.out.println("you win");
//		   correctCnt++; //�̱�Ƚ�� ���̰�
//		   System.out.println("�̱� Ƚ�� : "+ correctCnt+"ȸ"); // �̱�Ƚ�� ����
//		   if(correctCnt == 1) {
//			  break;	 
//		   }
//		 }else if(result == 0) {
//			System.out.println("tie break");
//		 }else {
//		    System.out.println("you lose");
//		  }
//	    }
	
	     //�ڵ� �ۼ��� �� ��Ģ
//	     while() { //��� ���� �ؾ� ���� ã�� �� ����.
//	    	 if() {
//	    		 if() {
//	    			
//	    		 }
//	    	 }
//	     }
	}
}


		
		
					
		
	

		
		
		
		
		
		
		
		
		
		
		
	


