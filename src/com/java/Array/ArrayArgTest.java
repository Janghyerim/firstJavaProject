package com.java.Array;
public class ArrayArgTest {

	public static void main(String[] args) {
	//*���θ޼ҵ�
		/**���� �޼ҵ带  �ٸ� �޼ҵ尡 ȣ�� �Ұ����ϴ�.
		 * �ٸ� �޼ҵ带 ���ο��� ȣ�� �� �� ����.
		 */
		ArrayArg ay = new ArrayArg();
		ay.x = 10;
		ay.arr[0] = 1;
		ay.arr[1] = 2;
		ay.arr[2] = 3;
		ay.arr[3] = 4;
		ay.arr[4] = 5;

		//*����2
		for(int j : ay.arr) {
			System.out.println(j);  //1,2,3,4,5
		}
		
		int[] arr2 = change(ay.arr);
		for(int j : arr2) {
			System.out.println(j);
		}
		
		//*���� 1
		for(int i : ay.arr) {
			System.out.println(i);  //1,2,3,4,5
		}
		
		change(ay.arr); //�迭�� �ּҰ� ȣ��
		
		for(int i : ay.arr) {
			System.out.println(i);  //100,2,3,4,5 arr[0]���� ���� ȣ��Ǹ鼭 ����Ǿ� 1->100���� �ٲ�.
		}	
		
		
	}
	
	
	//*�ٸ� �޼ҵ�1
//	static void change(int[] arr) {
//		arr[0] = 100;
//		System.out.println("change() : "+arr[0]);  //arr[0] = 100
//	}
	
	//*�ٸ� �޼ҵ�2
	static int[] change(int[]arr) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1) * 10; 
		}
		
		int[] arr2;
		arr2 = arr;
		
		return arr2;
	}
	
	
	
	
	
	
	
}
