package kr.co.himeida.staticarea;

public class StaticTest {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int result = sum(a,b);
		System.out.println("sum = "+result);
		
		
	}
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

}
