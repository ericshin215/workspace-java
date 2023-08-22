package kr.co.himedia.templatemethod02;

public class IntermediateLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("jump 합니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn 못합니다");
	}


	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("*******중급자 레벨*******");
	}

}
