package kr.co.himedia.membership;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
	public VIPCustomer() {
		//super();
		this.customerGrade = "VIP"; 
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;
		
		
	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		this.customerGrade = "VIP"; 
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;
		
	};
	
	public VIPCustomer(int customerID, String customerName, int agentId) {
		
		super(customerID, customerName);
		this.agentId=agentId;
		this.customerGrade = "VIP"; 
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;
		
	}
	
	public int getAgentId() {
		return agentId;
	}

	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	public String showInfo() {
		return super.showInfo() + " 담당 상담원 번호는 " +agentId+"입니다.";
	}
	

}
