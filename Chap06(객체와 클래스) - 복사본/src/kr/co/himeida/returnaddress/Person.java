package kr.co.himeida.returnaddress;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this("이순신", 20);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public Person getPerson() {
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());
		
		Person person2 = person.getPerson();
		System.out.println(person);
		System.out.println(person2);
	}
	
	
}
