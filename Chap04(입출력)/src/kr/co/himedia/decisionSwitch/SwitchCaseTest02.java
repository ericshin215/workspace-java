package kr.co.himedia.decisionSwitch;

import java.util.Scanner;

public class SwitchCaseTest02 {
	
	public static void main(String[] args) {
		System.out.print("무슨요일 입니까? ");
		Scanner scan = new Scanner(System.in);
		
		String day  = scan.nextLine();
		String part;
		
		switch(day) {
		case "Monday":
			part = "가슴" ;
			break;
		case "Tuseday":
			part = "등" ;
			break;
		case "Wednesday":
			part = "어깨" ;
			break;
		case "Thursday":
			part = "팔" ;
			break;
		case "Friday":
			part = "하체" ;
			break;
		case "Saturday":
			part = "복근" ;
			break;
			
		default:
			part = "휴식";
			break;
		}
		
		System.out.println(day + "는 " + part  + "입니다.");
		scan.close();
		
	}

}
