package kr.co.himeida.singleton02;

import kr.co.himeida.singleton.Company;

/*
 * createCar()
 * 
 * 
 */

public class CarFactory {
	
	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory();
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	

}
	
