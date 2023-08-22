package inflearnJava2;

import java.util.*;

public class Main {
	
	public static int[] solution (String str) {
		
		
		int[] answer = new int[0];
		char[] s = str.toCharArray();
		answer[0]= s[0];
		int c=1;
		for(int i = 1;i<str.length();i++) {
			if(answer[i]==s[i]) {
				c++;
			}
			else {
				answer = Add(answer, "s[i]");
			}
			
			
		}
		
		
		
		
		
		
		return answer;
		

	}

	
	
	private static int[] Add(int[] answer, String string) {
		// TODO Auto-generated method stub
		return null;
	}



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		char t = in.next().charAt(0);
		
		
		for(int x: solution(str)) {
			System.out.print(x +" ");
		}
	}

}
