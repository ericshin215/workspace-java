package kr.co.himedia.loop;

import java.util.Scanner;

public class MyCalculator {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	
		while(true) {
			showMenu();
			
			int num = in.nextInt();
			
			if(num == 5) break;
			
			System.out.print("첫번째 숫자 : ");
			int num1 = in.nextInt();
			
			System.out.print("두번째 숫자 : ");
			int num2 = in.nextInt();
			
			
			
			 if (num==1) {
				addNum(num1, num2);
			}
			else if(num==2) {
				abstractNum(num1, num2);
			}
			else if(num==3) {
				multiplyNum(num1, num2);
			}
			else if(num==4) {
				divideNum(num1, num2);
			}
			else {
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
			
			
			
			
		}
		System.out.println("끝났습니다.");
	}
	
	public static void divideNum(int num1, int num2) {
		int result1 = num1 / num2;
		System.out.println(num1 + "/" + num2 +"=" + result1 );
		
		int result2 = num1 % num2;
		System.out.println(num1 + "%" + num2 +"=" + result2 );
		
		
	}

	public static void multiplyNum(int num1, int num2) {
		int result1 = num1 * num2;
		System.out.println(num1 + "*" + num2 +"=" + result1 );
		
		
	}

	public static void abstractNum(int num1, int num2) {
		
		int result1 = num1 - num2;
		System.out.println(num1 + "-" + num2 +"=" + result1 );
	}

	public static void addNum(int num1, int num2) {
		int result1 = num1 + num2;
		System.out.println(num1 + "+" + num2 +"=" + result1 );
		
		
	}

	public static void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("5.끝내기");
		
	}
	
	

}
