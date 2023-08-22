package kr.co.himedia.membership;

public class Customer {
	
	private int customerID;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int customerId, String customerName) {
		
		this.customerID = customerId;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 생성자 호출");
		
		
		
	}

	
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price;
		
	}
	
	public String showInfo() {
		return customerName + "님의 등급은 " +this.customerGrade+"이며 보너스 포인트는 "+this.bonusPoint+"입니다";
	}


	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
