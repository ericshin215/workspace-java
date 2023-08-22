package kr.co.himedia.array;

import java.util.Arrays;

public class ArrayTest {
	
	static int[] arr = new int[10];
	
	static{
		for(int i=0; i<8;i++)
			arr[i] = (int)(Math.random()*10)+1;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		
		int[] arr2 = new int[] {1, 2, 3, 4, 5, 6};
		
		int[] arr3 = { 1, 2, 3, 4, 5};
		
		int[] arr4;
		arr4 = new int[] {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		double[] arr5 = new double[7];
		System.out.println(Arrays.toString(arr5));
		
		

	}
	}
		
	
	
