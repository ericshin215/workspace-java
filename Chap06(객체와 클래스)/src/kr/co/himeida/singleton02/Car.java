package kr.co.himeida.singleton02;

import kr.co.himeida.singleton.Company;

/*
 * static 변수 serialNum
 * 
 * 
 */


public class Car {
	
	private static int serialNum = 1000;
	private int carNum;
	
	Car(){
		serialNum++; // Car.serialNum++;
		carNum = serialNum;
		
	}

	public int getCarNum() {
		return carNum;
		
	}
	


}
