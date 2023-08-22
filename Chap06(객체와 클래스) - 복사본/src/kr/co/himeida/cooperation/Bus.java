package kr.co.himeida.cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void ride(int money) {
		this.money +=money;
		passengerCount++;
		
	}

}
