package TwoDimensionMatrix;

import java.util.*;

public class Main {
	
public static int solution(int[][] arr, int n){
		int count = 0;
	for(int i=1; i<n+1;i++) {
		
		for(int j=1; j<n+1;j++) {
			if(arr[i][j]>arr[i][j-1] &&
					arr[i][j]>arr[i-1][j] && 
							arr[i][j]>arr[i+1][j] &&
							arr[i][j]>arr[i][j+1]){
				
				count++;
				
				
				
			}
		}
		
		
	}
		
		
		
		return count;
	}
		
		
		
		
		
		

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		int[][] arr= new int[n+2][n+2];
		for(int i=1; i<n+1;i++) {
			
			for(int j=1; j<n+1;j++) {
				arr[i][j] = in.nextInt();
			}
			
			
		}
		
		
		System.out.println(solution(arr, n));
		
		
	}
	

}
