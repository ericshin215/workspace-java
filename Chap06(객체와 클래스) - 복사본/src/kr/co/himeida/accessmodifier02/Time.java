package kr.co.himeida.accessmodifier02;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return this.getHour()+"시"+this.getMinute()+"분"+this.getSecond()+"초 입니다";
	}
	

}
