package kr.co.himedia.templatemethod;

public class GenerativeAICar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 스스로 멈춥니다.");
		
	}

	@Override
	public void washCar() {
		// TODO Auto-generated method stub
		System.out.println("셀프로 세차를 합니다.");
	}

}
