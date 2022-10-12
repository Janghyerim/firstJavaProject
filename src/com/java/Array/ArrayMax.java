package com.java.Array;

public class ArrayMax {
	
	int[] arr = new int[10];
	
	public static void main(String[] args) {
		ArrayMax am = new ArrayMax();
		
		for (int i=0;i<am.arr.length;i++) {
			am.arr[i] = (int)(Math.random()*100)+1;
		}
		for(int i : am.arr) {
			System.out.println(i);
		}
		
		int max = ArrayMax(am.arr);
		System.out.println("max : "+ max);
		
	}
	
	static int ArrayMax(int[]arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	

}
