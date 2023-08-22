package kr.co.himeida.staticzone03;

import java.util.*;

public class StaticBeforeMain {
	
	static int num;
	
	static {
		Random random = new Random();
		num = random.nextInt(100);
		
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(num);
	}

}
