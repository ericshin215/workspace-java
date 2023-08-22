package kr.co.himedia.loop;

import java.util.Scanner;

public class ForLoopTest {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("제목: ");
		String title = in.nextLine();
		System.out.println("title = "+title);
		
		
		
	
		
		System.out.print("가격: ");
		int price = in.nextInt();
		System.out.println("price = "+price);
		
		
		
		in.nextLine();
		
		System.out.print("출판사: ");
		String company = in.nextLine();
		System.out.println("company = "+company);
		
		
		
		System.out.print("저자: ");
		String author = in.nextLine();
		System.out.println("author = "+author);
		
	
		
		System.out.print("페이지수: ");
		String page = in.nextLine();
		System.out.println("page = "+page);
		
		
		
		System.out.print("ISBN: ");
		String isbn = in.nextLine();
		System.out.println("isbn = "+isbn);
		
		
		in.close();
		
		

			
		}
	
			
			
		}
	
	


