package inflearnJava;

import java.util.*;

public class Main {
	
	public static String solution (int n, String str) {
		String answer ="";
		for(int i =0; i<n;i++) {
			String tmp=str.substring(0, 7);
			str = str.substring(7);
		}
		
		return answer;
		

	}
 
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		String str = in.next();
		
		
		
		System.out.println(solution(n, str));
	}

}
