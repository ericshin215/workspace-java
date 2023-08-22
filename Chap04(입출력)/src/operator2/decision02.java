package operator2;

import java.util.Scanner;

public class decision02 {

	
	public static void main(String[] args) {
		//quiz 정수 1개를 입력 받아 입력된 수가 8의 배수인지를 출렧하시오 
		
	Scanner scan = new Scanner(System.in);
	
//	System.out.println("숫자를 입력하세요");
//	int num = scan.nextInt();
//	
//	if(num % 8 == 0) {
//		System.out.println(num +"은 8의 배수입니다. ");
//		
//	}
//	else {
//		System.out.println(num +"은 8의 배수가 아닙니다. ");
//	}
//	
	System.out.println("몇살입니까?");
	int age = scan.nextInt();
	
	if(age >= 18) {
		System.out.println("성인입니다.");
	}
	else {
		System.out.println("미성년자입니다.");
	}
	
	System.out.println("프로그랩 종료");	
	scan.close();
	
	
	
	
	}
}

