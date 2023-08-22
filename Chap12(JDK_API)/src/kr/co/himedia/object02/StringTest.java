package kr.co.himedia.object02;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = new String("himedia");
		String str2 = new String("himedia");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "himedia";
		String str4 = "himedia";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(str1.equals(str3));
		
		String str5 ="apple";
		String str6 ="bannas";
		System.out.println(str6.compareTo(str5));
	}

}
