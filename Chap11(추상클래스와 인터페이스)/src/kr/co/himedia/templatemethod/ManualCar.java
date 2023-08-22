package kr.co.himedia.templatemethod;

public class ManualCar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들을 조정합니다.");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("브레이크를 밟아서 멈춥니다.");
		
	}

	@Override
	public void washCar() {
		// TODO Auto-generated method stub
		System.out.println("자동세차장에서 세차합니다.");
		
	}

}
