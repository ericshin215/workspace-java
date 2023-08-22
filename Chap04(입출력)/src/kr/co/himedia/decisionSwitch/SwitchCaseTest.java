package kr.co.himedia.decisionSwitch;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		System.out.print("월 : ");
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		int day;
		
		switch(month) {
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default:
			day = 31;
			break;
		}
		
		System.out.println(month + "월은 " + day+ "일 입니다.");
		scan.close();
		
	}

}
