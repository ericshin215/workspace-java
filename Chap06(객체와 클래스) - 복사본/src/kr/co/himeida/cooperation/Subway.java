package kr.co.himeida.cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void ride(int money) {
		this.money +=money;
		passengerCount++;
		
	}


}
