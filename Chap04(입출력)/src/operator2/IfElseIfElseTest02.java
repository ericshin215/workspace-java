package operator2;

import java.util.Scanner;

public class IfElseIfElseTest02 {
	
	   public static void main(String[] args) {
		      
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.print("점수를 입력하세요 : ");
		      int score = scan.nextInt();
		      
		      if(score >=0 && score < 100) {
		    	  if (score >= 90) {
				         System.out.println("점수가 100~90점 사이 입니다.");
				         System.out.println("등급은 A입니다.");
				      } else if (score >= 80 ) {
				         System.out.println("점수가 80~89점 사이 입니다.");
				         System.out.println("등급은 B입니다.");
				      } else if (score >= 70) {
				         System.out.println("점수가 70~79점 사이 입니다.");
				         System.out.println("등급은 C입니다.");
				      } else if (score >= 60) {
				         System.out.println("점수가 60~69점 사이 입니다.");
				         System.out.println("등급은 D입니다.");
				      } else {
				         System.out.println("등급은 F입니다.");
				      }
				      
		      }
		      else {
		    	  System.out.println("잘못 입력했습니다.");
		      }
		      scan.close();

}
}
