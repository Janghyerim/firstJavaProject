package hyerimnote;

public class Array {

	public static void main(String[] args) {
		//int[] arr;         //����
		//arr = new int[5];  //����
		//int[] arr = new int[5];  //����� ������ ���� �� ����
//		int[] arr = {10,20,30,40,50}; //����,����,�ʱ�ȭ���� ���� �� ����
//        
//		arr[0] = 10;  //���ǹ�
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
//		System.out.println(arr[0]);  //���
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		//char[] c = new char[4];  //����� ������ ���� �� ����
//		char[] c = {'O','O','T','D'};
//		System.out.println(c);
		
		//String[] s = new String[3];  //����� ������ ���� �� ����
//		String[] s = {"jang","hye","rim"};
//		System.out.print(s[0]);    //�ε��� ��ȣ 0���� �����!!!!!!!!!!!
//		s[2] = "bong";
//		System.out.print(s[1]);
//		System.out.println(s[2]);
		
		//�迭�� ����
		int x = 10;
		int y;
		
		y = x;
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2 = arr1;
		
		System.out.println(arr1[0]); //1
		System.out.println(arr2[0]); //1
		
		arr2[4] = 10;
		
		System.out.println(arr1[4]); //10
		System.out.println(arr2[4]); //10
		
		//�迭�� Ȱ��
		//Ư¡: ����ó��,�ݺ��� ���,�ʱⰪ0����
		
		int[] arr = new int[10];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = 1; //�ε����� �ݺ��Ǹ� 5���� ����Ǵ� ���� 0,1,2,3,4�� ���� 1�� ���Եȴ�.
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}  //1,1,1,1,1,1,1,1,1,1
		
		//���� (1~10���� ����Ѵٸ�..)
		
		int[] seo = new int[10];
		
		for(int i = 0;i<seo.length;i++) {
			seo[i] = i+1;
		}
		
		for(int i = 0;i<seo.length;i++) {
			System.out.println(seo[i]);
		}
		//����+�迭�� �� ���ϱ�
		int sum = 0;
		for(int i=0;i<seo.length;i++) {
			sum += seo[i];
		}
		System.out.println(sum);
		
		//����+Ȧ¦ �ձ��ϱ�
		int j = 0;
		int s = 0;
		for(int i = 0;i<seo.length;i++) {
			if(seo[i] %2==1) {
				j += seo[i];
			}else {
				s += seo[i];
			}
		}
		System.out.println("Ȧ�� : "+j);
		System.out.println("¦�� : "+s);
		
		//For each��
		//����
		int[] err = {1,2,3,4,5};
		for(int i : err) {
			System.out.println(i);
		}
		
		//���� for��
		int num = 0;
		for (int i : err) {
			num += i;
		}
		//���ڿ�����
		String[] jkl = {"����","������","ü��"};
	
		for(String h : jkl) {
			System.out.println(h);
		}
		//���� 1~100������ ���߿� 10���� �迭������ �ʱ�ȭ�Ѵ�.
				//�迭�� ���� ����Ѵ�.
				/**�迭�� ���� ���� ���� ������ �����������.
				 */ 
		
		
		
		
		
		
		
		
		
	}

}
