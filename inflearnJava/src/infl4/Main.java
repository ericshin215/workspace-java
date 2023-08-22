package infl4;

import java.util.*;

public class Main {
	
	public static int[] solution(int[] arr, int n){
		
		int[] point = new int[n];
		
		for(int i=0;i<n;i++) {
			point[i]=n+1;
			for(int j =0;j<n;j++) {
				if(arr[i]>=arr[j]) {
					point[i]--;
				}
			}
			
			
			
			
		}
		return point;
	}
		
		
		
		
		
		

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		int[][] arr= new int[n][n];
		for(int i=0; i<n;i++) {
			
			for(int j=0; j)
			arr[i] = in.nextInt();
			
		}
		
		for(int x: solution(arr, n)) {
			System.out.print(x+" ");
		}
		
//		System.out.println(solution(arr, n));
		
		
	}
	
	
	

}
