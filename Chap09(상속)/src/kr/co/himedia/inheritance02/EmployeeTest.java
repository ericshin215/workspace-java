package kr.co.himedia.inheritance02;

public class EmployeeTest {
	
	public static void main(String[] args) {
		RempDTO dto = new RempDTO();
		System.out.println(dto);
		
		RempDTO dto2 = new RempDTO("이순신", 30, "010-2311-1234","2-23-07-01","개발팀");
		System.out.println(dto2);
	}

}
