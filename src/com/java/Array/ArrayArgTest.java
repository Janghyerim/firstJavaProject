package com.java.Array;
public class ArrayArgTest {

	public static void main(String[] args) {
	//*메인메소드
		/**메인 메소드를  다른 메소드가 호출 불가능하다.
		 * 다른 메소드를 메인에서 호출 할 수 있음.
		 */
		ArrayArg ay = new ArrayArg();
		ay.x = 10;
		ay.arr[0] = 1;
		ay.arr[1] = 2;
		ay.arr[2] = 3;
		ay.arr[3] = 4;
		ay.arr[4] = 5;

		//*메인2
		for(int j : ay.arr) {
			System.out.println(j);  //1,2,3,4,5
		}
		
		int[] arr2 = change(ay.arr);
		for(int j : arr2) {
			System.out.println(j);
		}
		
		//*메인 1
		for(int i : ay.arr) {
			System.out.println(i);  //1,2,3,4,5
		}
		
		change(ay.arr); //배열의 주소값 호출
		
		for(int i : ay.arr) {
			System.out.println(i);  //100,2,3,4,5 arr[0]값이 위에 호출되면서 변경되어 1->100으로 바뀜.
		}	
		
		
	}
	
	
	//*다른 메소드1
//	static void change(int[] arr) {
//		arr[0] = 100;
//		System.out.println("change() : "+arr[0]);  //arr[0] = 100
//	}
	
	//*다른 메소드2
	static int[] change(int[]arr) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1) * 10; 
		}
		
		int[] arr2;
		arr2 = arr;
		
		return arr2;
	}
	
	
	
	
	
	
	
}
