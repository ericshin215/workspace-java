package kr.co.himedia.templatemethod02;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("엄청 빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("아주 높이 jump 합니다");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn 합니다");
	}


	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("*******고급자 레벨*******");
	}

}
