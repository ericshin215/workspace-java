package kr.co.himedia.object02;

import java.util.Scanner;

public class StringManipulationTest {
	
	public static void main(String[] args) {
//		String str = "HelloWorld";
//	
//		System.out.println(str.replaceAll("o", "x"));
//		System.out.println(str.substring(5));
//		System.out.println(str.substring(5, 8));
//		System.out.println(str.replaceAll("o", "x"));
//		System.out.println(str.indexOf("l"));
//		
//		String str1 = "Hello World Java";
//		
//		String[] strarray = str1.split(" ");
//		for (String s : strarray) {
//			System.out.println(s);
//		}
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		String[] strArray = str.split(" ");
		
		for(String s : strArray) {
			System.out.println(s);
		}
	}
	

}
