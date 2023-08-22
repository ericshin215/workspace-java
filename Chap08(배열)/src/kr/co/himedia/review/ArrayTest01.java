package kr.co.himedia.review;

import java.util.*;

public class ArrayTest01 {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("생성할 배열의 length : ");
		int length = in.nextInt();
		int sum = 0;
		int arr[] = new int[length];
		for(int i = 0; i<length;i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
		System.out.println(Arrays.toString(arr));
	}
	
	int[] arr = {};
}
