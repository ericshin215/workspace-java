package kr.co.himedia.membership;

import java.util.*;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer(202308, "이순신");
		Customer customerS = new Customer(202309, "신사임당");
		Customer customerLee = new Customer(202310, "이성계");
		Customer customerC = new Customer(202311, "최영");
		Customer customerK = new Customer(202312, "김유신");
		
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerLee);
		customerList.add(customerC);
		customerList.add(customerK);
		
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer : customerList) {
			
			System.out.println(customer.showInfo());
			
		}
		
		int price = 10000;
		System.out.println("===========할인율 계산 출력 =========");
for(Customer customer : customerList) {
		
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost+"원 지불하셨습니다.");
			
		}
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
