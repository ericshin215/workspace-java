package kr.co.himedia.loop;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면, q를 입력하세요.");
		String str = null;
		
		do {
			
			System.out.print(">");
			 str = in.nextLine();
			System.out.println("입력받은 메세지 = " + str);
			
		}
		while(!(str.equals("q")));
		
		System.out.println("프로그램을 종료합니다");
		
		
	}
}
	
	
