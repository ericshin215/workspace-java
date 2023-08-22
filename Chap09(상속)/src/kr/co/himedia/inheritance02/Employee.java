package kr.co.himedia.inheritance02;

public class Employee {
	protected String name;
	private int age;
	private String phome;
	private String empDate;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String phome, String empDate, String dept) {
		//super();
		this.name = name;
		this.age = age;
		this.phome = phome;
		this.empDate = empDate;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phome=" + phome + ", empDate=" + empDate + ", dept="
				+ dept + "]";
	}
	
	
	
	

}
