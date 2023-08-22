package kr.co.himeida.cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		
		bus.ride(1250);
		this.money -= 1250;
		
	}
	
	public void takeSubway(Subway subway) {
		
		subway.ride(1250);
		this.money -= 1300;
		
	}
	
	public void showInfo() {
		System.out.println(studentName+"의 잔액은"+money+"입니다");
	}
	
	
	
	
	
	

}
