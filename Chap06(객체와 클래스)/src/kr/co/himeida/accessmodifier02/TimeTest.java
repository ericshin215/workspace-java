package kr.co.himeida.accessmodifier02;

public class TimeTest {
	
	public static void main(String[] args) {
		Time time = new Time();
		
		time.setHour(10);
		time.setMinute(12);
		time.setSecond(20);
		
		System.out.println(time);
	}

}
