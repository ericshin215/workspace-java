package operator2;

import java.util.Scanner;

public class IfElseIfTest {
	
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if (score >=0 && score <100) {
			if(score >=80) {
				if(score >=90) {
					System.out.println("A반입니다.");
				}
				else if (score >= 85) {
					System.out.println("B반입니다.");
				}
				else {
					System.out.println("C반입니다.");
				}
				
			}
			else {
				System.out.println("불합격입니다.");
			}
		}
		
		
	}

}
