package kr.co.himedia.interface03;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Customer Sell");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Customer Buy");
		
	}
	
	@Override
	public void order() {
		System.out.println("customer order!");
		
		
	}
	
	public void sayHello() {
		System.out.println("Hello world");
		
	}


	
}
