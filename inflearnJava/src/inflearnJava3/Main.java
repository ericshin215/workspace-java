package inflearnJava3;

import java.util.*;

public class Main {
	
	public static String solution(int t, String str) {
		String answer = "";
		char[] s = str.toCharArray();
		for(int i =0; i<t;i++) {
			String tmp=str.substring(0, 7).replace('#', '1').replace('*', '0');
			str = str.substring(7);
			int num = Integer.parseInt(tmp, 2);
			char ch = (char) num;
			answer=answer+ch;
			
		}
		
		return answer;
		
	
				
			
			
		}
		
		
		
		

	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		String str = in.next();
		
		System.out.println(solution(t, str));
		
		in.close();
		
				
		
	}

}
