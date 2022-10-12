package com.java.Array;

public class ArrayMaxTest {

	public static void main(String[] args) {
		//1.ArrayMax 객체를 생성한다.
		//2.생성된 객체의 배열에 1~100사이의 값을 랜덤하게 저장한다.
		//3.메소드를 정의한다.(배열의 최댓값을 구해서 반환하도록 한다.)
		//4.반환된 최댓값을 출력한다.
		
//		ArrayMax am = new ArrayMax(); //1.객체생성
//		
//		for(int i=0;i<am.arr.length;i++) {
//			am.arr[i] = (int)(Math.random()*100)+1;  //2.난수 랜덤 지정
//		}
//		
//		for(int i : am.arr) {
//			System.out.println(i);
//		}
//		
//		int max = ArrayMax(am.arr);
//		System.out.println("max : "+max);     //4.최댓값 출력
//	}
//	
//	static int ArrayMax(int[]arr) {  //반환된 타입을 맞춰서 void -> int로 바꿔줌.
//		int max = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//		}
//		return max;               //3.메소드를 정의한다.
//	}
		
		
		
		//혜림 풀이
/**		ArrayMax am = new ArrayMax();
	
		for(int i=0;i<am.arr.length;i++) {
			am.arr[i] = (int)(Math.random()*100)+1;
		}
		for(int i : am.arr) {
			System.out.println(i);
		}
* 위 공식 다시 풀어보기		
*/
		
//		System.out.println("==========");
//		int max = am.arr[0];
//		
//		for(int i=0;i<am.arr.length;i++) {
//			if(max<am.arr[i]) {
//				max = am.arr[i];
//			}
//		}
//		System.out.println("Max : "+ max);
		

	
	}
}

