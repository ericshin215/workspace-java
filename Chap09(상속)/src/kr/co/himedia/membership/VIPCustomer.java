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
	
	public int getAgentId() {
		return agentId;
	}

	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
	

}
