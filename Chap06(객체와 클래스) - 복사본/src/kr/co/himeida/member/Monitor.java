package kr.co.himeida.member;

public class Monitor {
	String color;
	int channel;
	int volume;
	boolean power;
	
	public void poweronoff () {
		if(power==true) {
			power = false;
		}
		else {
			power = true;
		}
	}
}
