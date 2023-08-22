package kr.co.himedia.decisionMethod;


import java.util.Scanner;

public class RandomTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dice = (int)(Math.random()*6)+1;
		
		System.out.println(dice);
		System.out.println(dice);
		System.out.println(dice);
	}

}
